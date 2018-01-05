package com.service.platform.dec;

import com.service.param.def.UnifiedCode;
import com.service.platform.handler.UnifiedException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5 加密工具
 * @author linyang
 * @since 2017.12.05
 */
public class Md5Util {
    /**
     * 将字符串加密
     * @param plainText 被加密字符串
     * @author xlizy
     * */
    public static String getMd5Result( String plainText ){
        String str = "";
        try {
            MessageDigest md = MessageDigest.getInstance( "MD5" );
            md.update( plainText.getBytes() );
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer( "" );
            for ( int offset = 0; offset < b.length; offset++ ) {
                i = b[offset];
                if ( i < 0 )
                    i += 256;
                if ( i < 16 )
                    buf.append("0");
                buf.append( Integer.toHexString( i ) );
            }
            str = buf.toString();
            return str;
        } catch ( NoSuchAlgorithmException e ) {
            throw new UnifiedException( UnifiedCode.RES_9999.getCode(), "未找到对应的算法", e.getCause() );
        }
    }
}
