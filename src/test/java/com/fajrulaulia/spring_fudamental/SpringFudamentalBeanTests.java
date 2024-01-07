package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fajrulaulia.spring_fudamental.data.Kucing;

public class SpringFudamentalBeanTests {

    @Test
    void TestCreateBeanFromConfiguration(){
        ApplicationContext ctx =  new AnnotationConfigApplicationContext(SpringFudamentalBeanConfiguration.class);
        Assertions.assertNotNull(ctx);
    }

    @Test
    void TestGetBean(){
         ApplicationContext ctx =  new AnnotationConfigApplicationContext(SpringFudamentalBeanConfiguration.class);
        Assertions.assertNotNull(ctx);


        Kucing kucingAggora1 = ctx.getBean(Kucing.class);
        Kucing kucingAggora2 = ctx.getBean(Kucing.class);

        Assertions.assertSame(kucingAggora1, kucingAggora2);


    }
}


 
