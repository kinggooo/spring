package com.wangnz.springjava.ch2.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/27.
 */
@Component("sgtPeppers")
public class SgtPeppers implements CompactDisk {
    private String title = "title";
    private String artist = "artist";

    public void play() {
        System.out.println(title + ":" + artist);
    }
}
