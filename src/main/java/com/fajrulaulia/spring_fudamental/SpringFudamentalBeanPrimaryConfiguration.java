package com.fajrulaulia.spring_fudamental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fajrulaulia.spring_fudamental.data.Kucing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SpringFudamentalBeanPrimaryConfiguration {

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean
    @Primary
    public Kucing kucingSaya1() {
        Kucing kcg = new Kucing();
        log.info("Membuat Kucing 1");
        return kcg;
    }

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean
    public Kucing kucingSaya2() {
        Kucing kcg = new Kucing();
        log.info("Membuat Kucing 2");
        return kcg; 
    }
}
