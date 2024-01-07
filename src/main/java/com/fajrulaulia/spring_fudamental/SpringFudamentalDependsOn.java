package com.fajrulaulia.spring_fudamental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import com.fajrulaulia.spring_fudamental.data.Kucing;
import com.fajrulaulia.spring_fudamental.data.Tikus;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class SpringFudamentalDependsOn {

  @Lazy
  @Bean
  @DependsOn({
      "kucing"
  })
  public Tikus tikus() {
    log.info("Create Tikus");
    return new Tikus();
  }

  @Bean

  public Kucing kucing() {
    log.info("Create Kucing");
    return new Kucing();
  }

}
