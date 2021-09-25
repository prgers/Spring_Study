package com.prger.service;

import com.prger.domain.Job;

import java.util.List;

/**
 * Created by prgers on 2021/9/24 5:56 下午
 */
public interface JobService {

    List<Job> list();
    boolean save(Job job);
    boolean update(Job job);
    void test(Job job);
}
