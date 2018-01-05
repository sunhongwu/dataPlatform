package com.service.biz;

import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 工作流服务 </br>
 * 当前工作流服务是在activi 流程引擎基础上进行二次封装的服务, </br>
 * 实现了 流程的创建、任务的审核、签收 及工作流的管理 等服务
 * @author linyang
 * @since  2017.11.29
 */
@Component
public interface IWorkFlowService {

    /**
     * 启动新的工作流实例
     * @param processKey    流程部署时的模板id
     * @param businessKey   业务主键(appNo)
     * @param variables     流程启动变量 可根据业务需求自行添加 当前系统会自动添加 ${rtfState}变量
     *                      ${rtfState} 变量在处理流程节点分支时使用
     * @return
     */
    public ProcessInstance startNewProcess( String processKey, String businessKey, Map<String, Object> variables );

    /**
     * 执行当前activiti 用户节点(userTask)
     * @param businessKey   业务主键(appNo)
     * @param params        向acticiti 流程节点中添加的变量信息 没有可输入null 当param为null 或
     *                      params.containsKey( "rtfState" ) = false时 会自动添加变量 ${rtfState=Pass}
     */
    public void complateUserTask( String businessKey, Map<String, Object> params );


}
