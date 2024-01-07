package com.fajrulaulia.spring_fudamental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fajrulaulia.spring_fudamental.data.Kucing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SpringFudamentalBeanChangeValue {

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean(value = "KucingSayaFirst")
    @Primary // ADD THIS LINE IF DEPLOY
    public Kucing kucingSaya1() {
        Kucing kcg = new Kucing();
        log.info("Membuat KucingSaya1 diubah jadi KucingSayaFirst");
        return kcg;
    }

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean(value = "KucingSayaSecond")
    public Kucing kucingSaya2() {
        Kucing kcg = new Kucing();
        log.info("Membuat KucingSaya2 diubah jadi KucingSayaSecond");
        return kcg; 
    }
}
