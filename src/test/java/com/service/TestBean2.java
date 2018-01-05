package com.service;

import com.service.platform.util.beanUtils.BeanUtils;

/**
 * Created by Administrator on 2017/12/18.
 */
public class TestBean2 {

    @BeanUtils.BeanCopySettings( ignoreCase = true )
    private  String  A_a;

//    @BeanUtils.BeanCopySettings( ignoreCase = true, ignoreUnderLine = true )
    private double B;

    @BeanUtils.BeanCopySettings( ignoreCase = true, ignoreUnderLine = true )
    private int c_;

    public String getA_a() {
        return A_a;
    }

    public void setA_a(String a_a) {
        A_a = a_a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public int getC_() {
        return c_;
    }

    public void setC_(int c_) {
        this.c_ = c_;
    }
}
