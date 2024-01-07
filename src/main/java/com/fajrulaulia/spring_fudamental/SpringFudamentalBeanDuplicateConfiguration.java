package com.fajrulaulia.spring_fudamental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fajrulaulia.spring_fudamental.data.Kucing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SpringFudamentalBeanDuplicateConfiguration {

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean
    public Kucing kucing1() {
        Kucing kcg = new Kucing();
        log.info("Membuat Kucing 1");
        return kcg;
    }

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean
    public Kucing kucing2() {
        Kucing kcg = new Kucing();
        log.info("Membuat Kucing 2");
        return kcg;
    }
}
