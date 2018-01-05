package com.service.param.def;

/**
 * 定时任务类型
 * @author linyang
 * @since 2017.12.01
 */
public enum ScheduledTaskType {

    /** 在指定时间第一次执行任务 并以固定频率重复执行 如果第一次执行时间设置为空 则默认启动后30s[ScheduleTaskManager.defaultStartDelay] 执行第一次任务 */
    AtTime_Rate_Model( "AtTimeRateModel", "周期任务" ),

    /** 任务仅在指定时间执行一次 并不会以固定周期重复执行 如果第一次执行时间设置为空 则默认启动后30s 执行任务 */
    AtTime_DoOnece_Model( "AtTimeDoOneceModel", "非周期任务" )
    ;

    /** 编码 */
    private String code;

    /** 描述 */
    private String desc;

    /** RtfState 对象在流程引擎中应用时的标准标量名称 */
    public static final String enumName = "scheduledTaskType";

    ScheduledTaskType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 根据编码获取 定时任务类型 对象
     * @param code
     * @return
     */
    public static ScheduledTaskType getScheduledTaskTypeByCode( String code ) {
        ScheduledTaskType[] scheduledTaskTypes = ScheduledTaskType.values();
        for( ScheduledTaskType scheduledTaskType : scheduledTaskTypes ) {
            if( scheduledTaskType.getCode().equalsIgnoreCase( code ) )
                return scheduledTaskType;
        }
        return null;
    }
}
