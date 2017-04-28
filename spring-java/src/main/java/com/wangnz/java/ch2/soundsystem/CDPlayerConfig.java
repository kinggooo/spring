package com.wangnz.java.ch2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(CDConfig.class)
//@ComponentScan(basePackages = {"com.wangnz.springjava.ch2.soundsystem"})
public class CDPlayerConfig {
    @Bean
    public MediaPlayer cdPlayer(CompactDisk compactDisk) {
        CDPlayer player = new CDPlayer();
        player.setCd(compactDisk);
        return player;
    }
}
