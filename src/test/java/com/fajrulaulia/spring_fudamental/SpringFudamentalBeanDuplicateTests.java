package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fajrulaulia.spring_fudamental.data.Kucing;

public class SpringFudamentalBeanDuplicateTests {

    @Test
    void TestGetBeanDuplicate() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringFudamentalBeanDuplicateConfiguration.class);
        Kucing kucing1 = ctx.getBean("kucing1",Kucing.class);
        Kucing kucing2 = ctx.getBean("kucing2",Kucing.class);
        Assertions.assertNotSame(kucing1, kucing2);

    }
}
