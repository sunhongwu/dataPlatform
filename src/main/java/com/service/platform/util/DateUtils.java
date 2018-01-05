package com.service.platform.util;

import java.text.SimpleDateFormat;

/**
 * 时间日期操作工具 <br>
 * 提供对时间日期对象的补充操作支持
 * @author linyang
 * @since 2017.12.05
 */
public class DateUtils {
    /** yyyyMMddHHmmss 格式 */
    private static final SimpleDateFormat yyyyMMddHHmmss_Formater = new SimpleDateFormat( "yyyyMMddHHmmss" );

    /** yyyyMMddHHmmssSSS 格式 */
    private static final SimpleDateFormat yyyyMMddHHmmssSSS_Formater = new SimpleDateFormat( "yyyyMMddHHmmssSSS" );

    /** yyyyMMddHH 格式 */
    private static final SimpleDateFormat yyyyMMddHH_Formater = new SimpleDateFormat( "yyyyMMddHH" );

    /** yyyyMMddHHmmss */
    public static final String yyyyMMddHHmmss = "yyyyMMddHHmmss";

    /** yyyyMMddHHmmssSSS */
    public static final String yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";

    /** yyyyMMddHH */
    public static final String yyyyMMddHH = "yyyyMMddHH";
    /**
     * 将指定的时间数据进行格式化
     * @param date      时间
     * @param pattern   格式
     * @return
     */
    public static String date2String( java.util.Date date, String pattern ){
        if( yyyyMMddHHmmss.equals( pattern ) ) return yyyyMMddHHmmss_Formater.format( date );
        if( yyyyMMddHHmmssSSS.equals( pattern ) ) return yyyyMMddHHmmssSSS_Formater.format( date );
        if( yyyyMMddHH.equals( pattern ) ) return yyyyMMddHH_Formater.format( date );
        return "";
    }

}
