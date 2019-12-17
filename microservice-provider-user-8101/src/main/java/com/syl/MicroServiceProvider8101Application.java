package com.syl;

import brave.sampler.Sampler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.syl.dao")
public class MicroServiceProvider8101Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceProvider8101Application.class,args);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
