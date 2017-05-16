package com.wangnz.spring.javaconf.service;

import com.wangnz.spring.javaconf.entity.Spittle;

import java.util.List;

/**
 * Created by Administrator on 2017/5/3.
 */
public interface SpittleService {
    List<Spittle> findSpittles(long max, int count);
}
