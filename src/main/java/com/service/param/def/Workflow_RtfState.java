package com.service.param.def;

/**
 * 流程引擎节点状态枚举类
 * @author linyang
 * @since 2017.12.15
 */
public enum Workflow_RtfState {
    /** 通过 */
    Pass("通过"),
    /** 退回 */
    Return( "退回" ),
    /**  取消 */
    Cancel( "取消" ),
    /** 拒绝 */
    Reject( "拒绝" ),
    /** 转上级 */
    Super( "转上级" ),
    /** 开始 */
    Start( "开始" ),
    /** 结束 */
    Finish( "结束" )
    ;

    /** Workflow_RtfState 对象在流程引擎中应用时的标准标量名称 */
    public static final String enumName = "rtfState";

    /**
     * 枚举描述
     */
    private String rtfStateDesc;

    private Workflow_RtfState(String rtfStateDesc) {
        this.rtfStateDesc = rtfStateDesc;
    }

    public String getRtfStateDesc() {
        return rtfStateDesc;
    }

    public void setRtfStateDesc(String rtfStateDesc) {
        this.rtfStateDesc = rtfStateDesc;
    }

    /**
     * 根据 Workflow_RtfState 枚举对象的 name 值 获取对应的枚举对象
     * @param rtfState
     * @return
     */
    public Workflow_RtfState getRtfStateByState(String rtfState ){
        // 获取全部的枚举对象
        Workflow_RtfState[] workFlowRtfStates = Workflow_RtfState.values();
        for( Workflow_RtfState rtfS : workFlowRtfStates)
            if( rtfS.name().equalsIgnoreCase( rtfState ) ) return rtfS;
        return null;
    }
}
