package com.service.param.def;

/**
 * 联系人关系枚举定义
 * @author linyang
 * @since 2018.01.02
 */
public enum LinkRelation {

    /**
     *	兄弟
     **/
    B( "兄弟" ),
    /**
     *	配偶
     **/
    C( "配偶" ),
    /**
     *	女儿
     **/
    D( "女儿" ),
    /**
     *	父亲
     **/
    F( "父亲" ),
    /**
     *	父亲
     **/
    H( "子女" ),
    /**
     *	本人
     **/
    I( "本人" ),
    /**
     *	母亲
     **/
    M( "母亲" ),
    /**
     *	其它
     **/
    O( "其它" ),
    /**
     *	姐妹
     **/
    S( "姐妹" ),
    /**
     *	姐姐
     **/
    SIS( "姐姐" ),
    /**
     *	儿子
     **/
    SON( "儿子" ),
    /**
     *	同学
     **/
    T( "同学" ),
    /**
     *	同事
     **/
    W( "同事" ),
    /**
     *	朋友
     **/
    friend( "朋友" ),
    /**
     *	朋友
     **/
    Y( "朋友" ),
    /**
     *	弟弟
     **/
    YB( "弟弟" ),
    /**
     *	妹妹
     **/
    YSIS( "妹妹" );

    /**
     * 联系人来源 系统添加
     */
    public static final String systemAdd = "1";

    /**
     * 联系人来源 pc 进件上传
     */
    public static final String pcAdd = "0";

    /**
     * 联系人来源 风控审核时手动添加
     */
    public static final String checkerAdd = "2";

    private String  relationship;

    public String getRelationship() {
        return relationship;
    }

    private LinkRelation(String relationship) {
        this.relationship =relationship;
    }
}
