package com.service.platform.util;

/**
 *  字符串补充处理工具 <br>
 *  提供对字符串 {@link java.lang.String }对象的补充操作支持
 *  @author: linyang
 *  @since: 2017/8/27 0027 下午 3:24 
 **/
public class StringUtils {
    /** String 类型对象的默认值 **/
    public static final String blankString = "";

    /** 空值 **/
    public static final String nullString = null;

    /** 下划线 **/
    public static final String underline = "_";

    /** String 类型的表达式 推荐锚点标记 */
    public static final String streingAnchor = "\\{\\}";
    /**
     * 判断字符串是否为空:       </br>
     * "" : true;                </br>
     * " " : false;              </br>
     * null : true;              </br>
     * "value" : false;          </br>
     * " value " : false;        </br>
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty( String str ){
        if( null == str || "".equals( str ) ) return true;
        return false;
    }

    /**
     * 判断字符串是否为空:       </br>
     * "" : true;                </br>
     * " " : true;               </br>
     * null : true;              </br>
     * "value" : false;          </br>
     * " value " : false;        </br>
     * @param str
     * @return
     */
    public static boolean isNullOrBlank( String str ){
        if( isNullOrEmpty( str ) ) return true;
        if( str.trim().equals( "" ) ) return true;
        return false;
    }

    /**
     * 将对象内容填充到指定格式内容中 组成新的字符串并返回 <br>
     * {@link org.slf4j.Logger} .info(..) | error (..) <br>
     * @param pattern   带有格式参数的字符串 字符串中"{}" 标记为填充锚点
     * @param args      参数数组 每个参数都将调用 .toString() 方法进行内容翻译 <br>
     *                   如传入参数为 bean 对象 可重构该对象的 .toString() 方法
     * @return
     */
    public static String formatStringAsLog4J( String pattern, Object... args ){

        if( isNullOrBlank( pattern ) ) return null;
        if( null == args || 0 == args.length ) return pattern;

        // 当前格式字符串中的第一个锚点位置
        int firstAnchor = pattern.indexOf( "{}" );
        for( Object data : args ){
            // 当格式字符串中不存在锚点信息时 结束填充动作
            if( -1 == firstAnchor ) break;

            if( null == data ) {
                pattern = pattern.replaceFirst( streingAnchor, "null" );
            }else{
                pattern = pattern.replaceFirst( streingAnchor, String.valueOf( data ) );
            }
        }
        return pattern;
    }

}
