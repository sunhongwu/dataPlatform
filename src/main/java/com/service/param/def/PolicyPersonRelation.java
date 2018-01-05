package com.service.param.def;

import com.service.platform.util.StringUtils;

/**
 * 风控人员关系枚举
 * @author linyang
 * @since 2018.01.02
 */
public enum PolicyPersonRelation {

    I( "本人" ),
    C( "共借人" ),
    M( "配偶" )

    ;

    /**
     * 联系人关系描述
     */
    private String desc;

    PolicyPersonRelation( String desc ) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 根据 {@link PolicyPersonRelation} 的name 值 获取对象的中文描述
     * @param name
     * @return
     */
    public String getDescByName( String name ){
        PolicyPersonRelation policyPersonRelation = PolicyPersonRelation.valueOf( name );
        if( null != policyPersonRelation ) return policyPersonRelation.getDesc();
        else return StringUtils.nullString;
    }
}
