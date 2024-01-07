package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFudamentalApplicationContextTests {


    @Test
    void testAplicationContext(){
        ApplicationContext ctx =  new AnnotationConfigApplicationContext(SpringFudamentalConfiguration.class);

        Assertions.assertNotNull(ctx);

    }

    
}
