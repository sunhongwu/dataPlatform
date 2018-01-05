package com.service.param.def;

import com.service.platform.util.StringUtils;

/**
 * 婚姻状态枚举
 * @author linyang
 * @since 2018.01.02
 */
public enum MaritalStatus {

    C( "已婚" ),
    S( "未婚" ),
    O( "其他" ),
    D( "离异" ),
    W( "丧偶" );

    MaritalStatus( String desc ) {
        this.desc = desc;
    }

    /**
     * 中文描述
     */
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 根据 {@link MaritalStatus} 的name 值 获取对象的 中文描述
     * @param name
     * @return
     */
    public static String getDescByName( String name ){
        MaritalStatus maritalStatus = MaritalStatus.valueOf( name  );
        if( null != maritalStatus ) return maritalStatus.getDesc();
        else return StringUtils.nullString;
    }
}
