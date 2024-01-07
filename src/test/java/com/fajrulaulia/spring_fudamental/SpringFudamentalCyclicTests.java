package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFudamentalCyclicTests {

    @Test
    void TestCyclic() {
        Assertions.assertThrows(Throwable.class, () -> {
            // Will Error
            ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringFudamentalCyclic.class);

        });

    }

}
