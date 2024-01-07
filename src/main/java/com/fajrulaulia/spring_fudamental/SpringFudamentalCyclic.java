package com.fajrulaulia.spring_fudamental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fajrulaulia.spring_fudamental.data.cyclic.Rian;
import com.fajrulaulia.spring_fudamental.data.cyclic.Via;
import com.fajrulaulia.spring_fudamental.data.cyclic.Wira;

@Configuration
public class SpringFudamentalCyclic {

    @Bean
    public Rian rianSukaVia(Via viaSukaWira) {
        return new Rian(viaSukaWira);
    }

    @Bean
    public Via viaSukaWira(Wira viaSukaWira) {
        return new Via(viaSukaWira);
    }

    @Bean
    public Wira wiraSainganRian(Rian wiraSainganRian) {
        return new Wira(wiraSainganRian);
    }

}
