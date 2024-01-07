package com.fajrulaulia.spring_fudamental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpringFudamentalSingletonTests {

    @Test
    void TestSingleton(){
        SpringFudamentalSingleton db1 =  SpringFudamentalSingleton.InitDb();
        SpringFudamentalSingleton db2 =  SpringFudamentalSingleton.InitDb();

        Assertions.assertSame(db1, db2);

    }
}

