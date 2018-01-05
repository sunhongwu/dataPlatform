package com.service.platform.bootstrap;

import com.google.gson.Gson;
import com.service.biz.ITmInstEnvService;
import com.service.dao.entity.TmInstEnvEntity;
import com.service.param.def.SymbolConstant;
import com.service.platform.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 配置信息加载器 <br>
 * 在项目启动时 通过 @See {@link org.springframework.beans.factory.BeanFactory} 初始化, <br>
 * 在初始化时加载数据库中的环境变量配置信息, 并在项目运行时, 提供参数读取服务
 * @author linyang
 * @since 2017.12.13
 */
@Service
public class PropertiesLoader {

    /**
     * 日志记录对象
     */
    private Logger logger = LoggerFactory.getLogger( getClass() );

    /**
     * 系统环境变量service
     */
    @Autowired
    private ITmInstEnvService iTmInstEnvService;

    /**
     * 环境变量信息持有对象
     */
    private PropertiesCollention propertiesCollention = new PropertiesCollention();

    private Gson gson = new Gson();

    public void init(){
        logger.info( "com.service.platform.bootstrap.PropertiesLoader启动, 开始从数据库中取回项目配置信息..." );

        loadProperties();

        logger.info( "com.service.platform.bootstrap.PropertiesLoader执行完成" );
    }

    /**
     * 重新加载系统环境变量信息
     */
    public void reloadProperties(){
        logger.info( "com.service.platform.bootstrap.PropertiesLoader重新加载配置信息..." );
        loadProperties();
        logger.info( "com.service.platform.bootstrap.PropertiesLoader执行完成" );
    }

    /**
     * 根据变量key 获取变量值
     * @param key @See {@link com.service.param.def.EnvProperityName}
     * @return
     */
    public String getProperty( String key ){
        return propertiesCollention.get( key );
    }

    /**
     * 从数据库中加载配置信息
     */
    private void loadProperties(){
        List<TmInstEnvEntity> envEntities = iTmInstEnvService.finfByParams( SymbolConstant.MYCHE, SymbolConstant.YES.getCode() );
        for( TmInstEnvEntity entity : envEntities ){
            if( !StringUtils.isNullOrBlank( entity.getPropKey() ) && !StringUtils.isNullOrBlank( entity.getPropValue() ) )
                propertiesCollention.put( entity.getPropKey(), entity.getPropValue() );
            logger.info( "从服务器取回配置信息[{}], [{}]", entity.getPropKey(), entity.getPropMemo()  );
        }
    }
}
