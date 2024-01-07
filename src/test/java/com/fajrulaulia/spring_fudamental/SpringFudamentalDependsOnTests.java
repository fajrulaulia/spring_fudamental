package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fajrulaulia.spring_fudamental.data.Tikus;

public class SpringFudamentalDependsOnTests {
     private ApplicationContext ctx;

    @BeforeEach
    void setUp() {
        ctx = new AnnotationConfigApplicationContext(SpringFudamentalDependsOn.class);
    }

    @Test
    void TestDependsOn(){

        ctx.getBean(Tikus.class);
        
    }

    

}
