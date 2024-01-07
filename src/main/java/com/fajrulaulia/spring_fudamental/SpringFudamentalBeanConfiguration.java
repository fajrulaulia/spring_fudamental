package com.fajrulaulia.spring_fudamental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fajrulaulia.spring_fudamental.data.Kucing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SpringFudamentalBeanConfiguration {

    // This will be manage by ApplicationContext
    // To Access Bean, use ApplicationContext Method getBean()
    @Bean 
    public Kucing kucingAnggora(){
        Kucing kucingAnggora = new Kucing();
        log.info("Membuat kucing aggora dari class kucing");
        System.out.println("Okkk");
        return kucingAnggora;
    }
    
}
