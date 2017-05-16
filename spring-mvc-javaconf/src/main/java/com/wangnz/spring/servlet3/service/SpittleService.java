package com.wangnz.spring.servlet3.service;

import com.wangnz.spring.servlet3.entity.Spittle;

import java.util.List;

/**
 * Created by Administrator on 2017/5/3.
 */
public interface SpittleService {
    List<Spittle> findSpittles(long max, int count);
}
