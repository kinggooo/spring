package com.wangnz.java.ch2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.wangnz.springjava.ch2.soundsystem"})
public class CDConfig {
    @Bean
    public CompactDisk sgtPeppers() {
        return new SgtPeppers();
    }
}
