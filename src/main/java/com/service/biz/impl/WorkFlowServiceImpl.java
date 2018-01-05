package com.service.biz.impl;

import com.service.biz.IWorkFlowService;
import com.service.param.def.Workflow_RtfState;
import com.service.platform.handler.UnifiedException;
import com.service.param.def.UnifiedCode;
import com.service.platform.util.StringUtils;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 工作流服务实现类
 * @author linyang
 * @since 2017.11.29
 */
@Service
public class WorkFlowServiceImpl implements IWorkFlowService {

    // 日志记录对象
    private static final Logger logger = LoggerFactory.getLogger( WorkFlowServiceImpl.class );

    /**
     * activi RuntimeService 负责管理activi 对象实例的操作
     */
    @Autowired
    private RuntimeService runtimeService;

    /**
     * activiti TaskService 用户任务操作对象
     */
    @Autowired
    private TaskService taskService;


    @Override
    public ProcessInstance startNewProcess( String processKey, String businessKey, Map<String, Object> variables )
            throws UnifiedException {

        if( StringUtils.isNullOrBlank( processKey ) )
            throw new UnifiedException( UnifiedCode.RES_5001.name(), "流程启动失败, processKey 不能为空" );

        // 当变量参数为空时 初始化变量
        if( null == variables )  variables = new HashMap<String, Object>();

        // 添加流程实例的默认情动参数
        variables.put( Workflow_RtfState.enumName, Workflow_RtfState.Start.name() );

        // 流程实例对象
        ProcessInstance processInstance = null;
        try{
            processInstance = runtimeService.startProcessInstanceByKey( processKey, businessKey, variables );
        }catch( Exception ex ){
            throw new UnifiedException( UnifiedCode.RES_5001.name(), ex.getMessage(), ex.getCause() );
        }

        logger.info( "流程启动成功 流程实例id[{}], 当前流程所处节点activityId[{}], 业务关联主键appNo = busunessKey[{}]",
                processInstance.getId(), processInstance.getActivityId(), processInstance.getBusinessKey() );

        return processInstance;
    }

    @Override
    public void complateUserTask( String businessKey, Map<String, Object> params ) {

        if( StringUtils.isNullOrBlank( businessKey ) )
            throw new UnifiedException( UnifiedCode.RES_5002.name(), "业务主键不能为空" );


        // 如果参数中未包含 ${rtfState} 变量时 向参数中添加 ${rtfState=Pass}
        if( null == params ) params = new HashMap<String, Object>();
//        if( !params.containsKey( Workflow_RtfState.enumName ) || null == params.get( Workflow_RtfState.enumName ) )
//            params.put( Workflow_RtfState.enumName, Workflow_RtfState.Start.name() );

        // 用户任务对象
        TaskEntity taskEntity = null;
        try{
            taskEntity = ( TaskEntity ) taskService.createTaskQuery().processInstanceBusinessKey( businessKey ).singleResult();

            if( null == taskEntity ) throw new UnifiedException( UnifiedCode.RES_5002.name(),
                        "未找到业务主键对应的用户任务,业务主键businessKey[".concat( businessKey ).concat( "]" ) );

            taskService.complete( taskEntity.getId(), params );
        }catch( Exception ex ){
            throw new UnifiedException( UnifiedCode.RES_5002.name(), ex.getMessage(), ex.getCause() );
        }
    }
}
