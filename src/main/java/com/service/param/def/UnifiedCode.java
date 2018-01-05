package com.service.param.def;/**

/**
 *  系统统一运行状态码                                      </br>
 *
 *  请按照下列规则进行编码命名                    </br>
 *  1.正确执行规则          [RES_0001,RES_1000]   </br>
 *  2.系统异常规则          [RES_4001,RES_5000]   </br>
 *  3.业务或数据异常规则    [RES_6001,RES_7000]   </br>
 *  4.执行失败              [RES_9001,RES_9999]
 *  @author: linyang
 *  @since: 2017/8/24 下午 11:38
 **/
public enum UnifiedCode {

    /** ======================================系统响应============================================== */

    /** 执行成功 */
    RES_0001( "RES_0001", "执行成功" ),
    /** 系统异常 */
    RES_4001( "RES_4001", "系统异常" ),
    /** 请求报文格式错误 */
    RES_4002( "RES_4002", "请求报文格式错误" ),
    /** 未找到ServiceId对的应服务 */
    RES_4003( "RES_4003", "未找到ServiceId对的应服务" ),
    /** 不能支持的数据类型 */
    RES_4004( "RES_4004", "不能支持的数据类型" ),
    /** 不能支持的协议类型 */
    RES_4005( "RES_4005", "不能支持的协议类型" ),
    /** 重复交易 */
    RES_1012( "RES_1012", "重复交易" ),
    /** 执行失败 */
    RES_9999( "RES_9999", "执行失败" ),



    /** ======================================avtiviti相关========================================== */

    /** activiti 执行完成 */
    RES_5000( "RES_5000", "执行完成" ),

    /** activiti 流程启动异常 */
    RES_5001( "RES_5001", "流程启动异常" ),

    /** activiti 流程执行异常 */
    RES_5002( "RES_5002", "流程执行异常" ),


    ;

    UnifiedCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /** 编码 */
    private String code;

    /** 编码描述 */
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode( String code ) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc( String desc ) {
        this.desc = desc;
    }

    /**
     * 根据 {@link UnifiedCode} 枚举对象的 name 值 获取对应的枚举对象
     * @param code
     * @return
     */
    public UnifiedCode getUnifiedCodeByCode( String code ){
        // 获取全部的枚举对象
        UnifiedCode[] unifiedCodes = UnifiedCode.values();
        for( UnifiedCode unifiedCode : unifiedCodes )
            if( unifiedCode.name().equalsIgnoreCase( code ) ) return unifiedCode;
        return null;
    }

}
