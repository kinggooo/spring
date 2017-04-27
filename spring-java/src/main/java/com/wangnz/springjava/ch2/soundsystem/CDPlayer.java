package com.wangnz.springjava.ch2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    @Autowired
    private CompactDisk cd;

    public void play() {
        cd.play();
    }

    public CompactDisk getCd() {
        return cd;
    }

    public void setCd(CompactDisk cd) {
        this.cd = cd;
    }
}
