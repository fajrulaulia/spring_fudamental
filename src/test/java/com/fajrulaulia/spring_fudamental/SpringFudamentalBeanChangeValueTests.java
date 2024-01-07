package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fajrulaulia.spring_fudamental.data.Kucing;

public class SpringFudamentalBeanChangeValueTests {

    private ApplicationContext ctx;

    @BeforeEach
    void SetupTest() {
         ctx = new AnnotationConfigApplicationContext(
                SpringFudamentalBeanChangeValue.class);

    }

    @Test
    void TestGetBeanPrimary() {

        Kucing kucingPrimary = ctx.getBean(Kucing.class);

        Kucing kucingFirst = ctx.getBean("KucingSayaFirst", Kucing.class);
        Kucing kucingSecond = ctx.getBean("KucingSayaSecond", Kucing.class);

        Assertions.assertSame(kucingPrimary, kucingFirst); // kucing1 itu bean primary
        Assertions.assertNotSame(kucingPrimary, kucingSecond);

    }
}
