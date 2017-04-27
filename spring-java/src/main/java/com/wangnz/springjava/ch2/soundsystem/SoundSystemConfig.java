package com.wangnz.springjava.ch2.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CDConfig.class, CDPlayerConfig.class})
//@ImportResource("classpath:spring.xml")
public class SoundSystemConfig {
}
