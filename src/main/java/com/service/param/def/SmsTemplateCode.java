package com.service.param.def;

/**
 * 短信模板编码
 * @author linyang
 * @since 2017.12.06
 */
public enum SmsTemplateCode {

    /**
     * 放款提醒短信
     */
    MYC_FINALCHECK( "放款提醒短信(美易车)" ),


    ;

    /**
     * 编码说明
     */
    private String desc;

    SmsTemplateCode(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 根据编码查询对应的短信模板信息
     * @param name
     * @return
     */
    public SmsTemplateCode getSmsTemplateByName(String name ){
        SmsTemplateCode[] smsTemplateCodes = SmsTemplateCode.values();
        for( SmsTemplateCode smsTemplateCode : smsTemplateCodes){
            if( smsTemplateCode.name().toString().equals( name ) )
                return smsTemplateCode;
        }
        return null;
    }
}
