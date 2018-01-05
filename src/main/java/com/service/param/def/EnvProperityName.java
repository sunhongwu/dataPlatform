package com.service.param.def;

/**
 * 系统环境变量名称
 * @author linyang
 * @since 2017.12.13
 */
public enum EnvProperityName {

    /** -----------------------------短信平台配置信息-------------------------------- */

    /** 短信平台服务开放地址 */
    sms_url( "短信平台服务开放地址" ),

    /** 短信平台授权用户密码 */
    sms_key( "短信平台授权用户密码" ),

    /** 短信平台授权用户id */
    sms_userId( "短信平台授权用户id" ),


    /** 获取站内信息推送服务地址 */
    messagePush_url( "获取站内信息推送服务地址" ),


    /** -----------------------------风控查询配置信息-------------------------------- */

    /** 本地黑名单风控查询是否开启 ON: 开启; OFF: 关闭; */
    isExecuteLocalBlack( "本地黑名单风控查询是否开启" ),

    /** 同盾风控查询是否开启 ON: 开启; OFF: 关闭; */
    isExecuteTongdun( "同盾风控查询是否开启" ),

    /** 同盾风控访问地址 */
    tongDunBlackCheckUrl( "同盾风控访问地址" ),

    /** 同盾风控合作方编码 */
    partner_code( "同盾风控合作方编码" ),

    /** 同盾参数查询风控详情时使用 目前等同于token_id */
    partner_key( "同盾参数查询风控详情时使用 目前等同于token_id" ),

    /** 同盾参数访问授权码 */
    secret_key( "同盾参数访问授权码" ),

    /** 同盾参数访问事件编码 */
    event_id( "同盾参数访问事件编码" ),

    /** 同盾参数访问令牌 */
    token_id( "同盾参数访问令牌" ),

    /** 汇法网风控查询是否开启 ON: 开启; OFF: 关闭; */
    isHuiFa( "汇法网风控查询是否开启" ),

    /** 汇法网服务地址 */
    huifa_url( "汇法网服务地址" ),

    /** 汇法网响应数据解码key */
    huifa_desKey( "汇法网响应数据解码key" ),

    /** 汇法网配置编号 */
    huifa_conid( "汇法网配置编号汇法网配置编号" ),

    /** 百融黑名单风控查询是否开启 ON: 开启; OFF: 关闭; */
    isExecuteBaiRong( "百融黑名单风控查询是否开启" ),



    /** ----------------------------rabbit mq 配置信息------------------------------ */

    /** rabbit mq 服务地址 */
    rabbitmqAddresses( "rabbit mq 服务地址" ),

    /** rabbit mq 服务器登录名 */
    rabbitmqUsername( "rabbit mq 服务器登录名" ),

    /** rabbit mq 服务器登录密码 */
    rabbitmqPassword( "rabbit mq 服务器登录密码" ),

    /** rabbit mq 请求是否同步处理 */
    rabbitmqPublisherConfirms( "rabbit mq 请求是否同步处理" ),

    /** rabbit mq 虚拟消息服务器 */
    rabbitmqVirtualHost( "rabbit mq 虚拟消息服务器" )
    ;




    /**
     * 编码描述
     */
    private String desc;

    EnvProperityName(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
