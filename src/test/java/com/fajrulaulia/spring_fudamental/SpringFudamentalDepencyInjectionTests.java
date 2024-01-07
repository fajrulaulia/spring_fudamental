package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fajrulaulia.spring_fudamental.data.Tikus;
import com.fajrulaulia.spring_fudamental.data.TikusKucing;
import com.fajrulaulia.spring_fudamental.data.Kucing;

public class SpringFudamentalDepencyInjectionTests {
    private ApplicationContext ctx;

    @BeforeEach
    void setUp() {
        ctx = new AnnotationConfigApplicationContext(SpringFudamentalDepedencyInjection.class);
    }

    @Test
    void testAplicationContext() {
        Assertions.assertNotNull(ctx);
    }

    @Test
    void TestWithtDI() {
       TikusKucing tikusKucing = ctx.getBean(TikusKucing.class);

       Kucing kucing = ctx.getBean("kucingSecond",Kucing.class);
       Tikus tikus = ctx.getBean(Tikus.class);


       Assertions.assertSame(kucing, tikusKucing.getKucing());
       Assertions.assertSame(tikus, tikusKucing.getTikus());



    }

    @Test
    void TestWitoutDI() {

        Tikus tikus = new Tikus();
        Kucing kucing = new Kucing();

        TikusKucing tikusKucing = new TikusKucing(tikus, kucing);

        Assertions.assertSame(kucing, tikusKucing.getKucing());
        Assertions.assertSame(tikus, tikusKucing.getTikus());

    }

}
