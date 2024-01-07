package com.fajrulaulia.spring_fudamental;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fajrulaulia.spring_fudamental.data.Tikus;
import com.fajrulaulia.spring_fudamental.data.TikusKucing;
import com.fajrulaulia.spring_fudamental.data.Kucing;

@Configuration
public class SpringFudamentalDepedencyInjection {

    @Bean
    public Tikus tikus() {
        return new Tikus();
    }

  
    @Bean
    @Primary
    public Kucing kucingFirst() {
        return new Kucing();
    }
 
    @Bean
    public Kucing kucingSecond() {
        return new Kucing();
    }

    @Bean
    public TikusKucing tikusKucing(Tikus a,@Qualifier("kucingSecond")  Kucing k) {
        return new TikusKucing(a, k);
    }
}
