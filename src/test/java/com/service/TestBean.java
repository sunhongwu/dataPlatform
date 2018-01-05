package com.service;

import com.service.platform.util.beanUtils.BeanUtils;

/**
 * Created by Administrator on 2017/12/18.
 */
public class TestBean {

    @BeanUtils.BeanCopySettings( ignoreCase = false )
    private  String  a_a;

    private String b;

    @BeanUtils.BeanCopySettings( ignoreCase = true, ignoreUnderLine = true, asTransName = "c" )
    private int C_A;

    public String getA_a() {
        return a_a;
    }

    public void setA_a(String a_a) {
        this.a_a = a_a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC_A() {
        return C_A;
    }

    public void setC_A(int c_A) {
        C_A = c_A;
    }
}
