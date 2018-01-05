package com.service;

import com.google.gson.Gson;
import com.service.param.def.SmsTemplateCode;
import com.service.svc.shortMessage.SmsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceImplApplicationTests {

    @Test
    public void contextLoads() {

        SmsRequest pojo = new SmsRequest();
        pojo.setTemplateCode( SmsTemplateCode.MYC_FINALCHECK.name() );

        List<String> smsParams = new ArrayList<String>(){{
            add( "p0" );add( "p1" );add( "p2" );add( "p3" );
        }};

        pojo.setParams( smsParams );

        Gson gson = new Gson();
        System.out.println( gson.toJson( pojo ) );
    }

}
