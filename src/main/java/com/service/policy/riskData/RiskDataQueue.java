package com.service.policy.riskData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 风控数据队列 二期改造时使用
 * @author linyang
 * @since 2018.01.02
 */
@Service
public class RiskDataQueue {

    /** 日志记录对象 */
    private Logger logger = LoggerFactory.getLogger( getClass() );

    /**
     * 任务队列 使用懒汉模式进行初始化
     */
    private static ArrayBlockingQueue<RiskQueueData> todoQueue;

    /**
     * 对象锁 主要用于锁定任务队列
     */
    private static final byte[] lock = new byte[0];

    public boolean addToDo( RiskQueueData todo ){
        if( null == todoQueue )  initTodoQueue();
        try {
            todoQueue.put( todo );
        } catch ( InterruptedException e ) {
            logger.error( "添加风控任务信息错误", e );
            return false;
        }
        return true;
    }


    public RiskQueueData getTodo(){
        if( null == todoQueue )  initTodoQueue();

        try {
            return todoQueue.take();
        } catch ( InterruptedException e ) {
            logger.error( "获取风控任务信息错误", e );
            return null;
        }
    }

    /**
     * 初始化任务队列
     */
    private void initTodoQueue(){
        synchronized ( lock ) {
            if( null == todoQueue ) todoQueue = new ArrayBlockingQueue<RiskQueueData>( 3000 );
        }
    }

}
