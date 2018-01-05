package com.service;

import com.google.gson.Gson;
import com.service.platform.util.beanUtils.BeanUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/12/18.
 */
public class BeanCopyTest {

    @Test
    public void test(){

        Gson gson = new Gson();

        // from 对象
        TestBean test1 = new TestBean();
        test1.setA_a( "asdasd" );
        test1.setB( "hah" );
        test1.setC_A( 123 );

        // 目标对象
        TestBean2 test2 = new TestBean2();

        BeanUtils.copy( test1, test2 );


        System.out.println( gson.toJson( test2 ) );

    }

}
