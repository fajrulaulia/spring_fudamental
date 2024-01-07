package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fajrulaulia.spring_fudamental.data.Kucing;

public class SpringFudamentalBeanPrimaryTests {

    private ApplicationContext ctx;

    @BeforeEach
    void SetupTest() {
         ctx = new AnnotationConfigApplicationContext(
                SpringFudamentalBeanPrimaryConfiguration.class);

    }

    @Test
    void TestGetBeanPrimary() {

        Kucing kucingPrimary = ctx.getBean(Kucing.class);

        Kucing kucing1 = ctx.getBean("kucingSaya1", Kucing.class);
        Kucing kucing2 = ctx.getBean("kucingSaya2", Kucing.class);

        Assertions.assertSame(kucingPrimary, kucing1);
        Assertions.assertNotSame(kucingPrimary, kucing2);

    }
}
