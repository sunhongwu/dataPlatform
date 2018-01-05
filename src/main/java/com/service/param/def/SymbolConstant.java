package com.service.param.def;

/**
 * 标识常量枚举</br>
 * 记录系统中经常使用的
 * @author linyang
 * @since 2017.12.15
 */
public enum SymbolConstant {

    YES( "Y", "是", "whether" ),
    NO( "N", "否", "whether" ),

    HAVE( "Y", "有", "isHave" ),
    NOT_HAVE( "N", "无", "isHave" ),

    SUCCESS( "Success", "成功", "isSuccess" ),
    FAILD( "Faild", "失败", "isSuccess" ),


    ON( "ON", "开启", "onOff" ),
    OFF( "OFF", "关闭", "onOff" ),

    IN_USE( "0", "使用中", "inUse" ),
    NOT_USE( "1", "使用中", "inUse" ),
    ;

    /** 项目标识 政审美车项目 */
    public static final String MYCHE = "MYCHE";

    /** 项目标识 政审美车项目 缩写 */
    public static final String MC = "MC";

    /** 组织机构编号 用于兼容常亮项目 */
    public static final String ORG = "000000000001";

    /** 枚举分组 是否 */
    public static final String enumGroup_whether = "whether";

    /** 枚举分组 有无*/
    public static final String enumGroup_isHave = "isHave";

    /** 是否成功 */
    public static final String enumGroup_isSuccess = "isSuccess";

    /** 是否开启 */
    public static final String enumGroup_onOff = "onOff";

    /** 使用情况 */
    public static final String enumGroup_inUse = "inUse";

    /** 编码 */
    private String code;

    /** 中文解释 */
    private String desc;

    /** 枚举分组 */
    private String enumGroup;

    private SymbolConstant( String code, String desc, String enumGroup ) {
        this.code = code;
        this.desc = desc;
        this.enumGroup = enumGroup;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnumGroup() {
        return enumGroup;
    }

    public void setEnumGroup(String enumGroup) {
        this.enumGroup = enumGroup;
    }

    /**
     * 根据枚举编码 与分组编码 获取对应的枚举对象</br>
     * @param code      枚举编码
     * @param enumGroup 枚举分组
     * @return
     */
    public static SymbolConstant getSymbolConstant( String code, String enumGroup ){
        // 获取枚举对象集合
        SymbolConstant[] symbolConstants = SymbolConstant.values();

        for( SymbolConstant symbolConstant :symbolConstants ){
            if( symbolConstant.enumGroup.equalsIgnoreCase( enumGroup ) && symbolConstant.code.equalsIgnoreCase( code ) )
                return symbolConstant;
        }
        return null;
    }

    /**
     * 根据枚举编码 与分组编码 获取对应的编码描述</br>
     * @param code      枚举编码
     * @param enumGroup 枚举分组
     * @return
     */
    public static String getDesc(  String code, String enumGroup ){
        // 获取枚举对象集合
        SymbolConstant[] symbolConstants = SymbolConstant.values();

        for( SymbolConstant symbolConstant :symbolConstants ){
            if( symbolConstant.enumGroup.equalsIgnoreCase( enumGroup ) && symbolConstant.code.equalsIgnoreCase( code ) )
                return symbolConstant.getDesc();
        }
        return "";
    }
}
