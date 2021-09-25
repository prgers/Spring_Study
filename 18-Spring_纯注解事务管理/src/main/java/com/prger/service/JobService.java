package com.prger.service;

import com.prger.domain.Job;

import java.util.List;

public interface JobService {

    List<Job> list();
    boolean save(Job job);
}
