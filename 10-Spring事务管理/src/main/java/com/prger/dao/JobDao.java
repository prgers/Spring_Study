package com.prger.dao;

import com.prger.domain.Job;

import java.util.List;

/**
 * Created by prgers on 2021/9/24 4:51 下午
 */
public interface JobDao {
    List<Job> list();
    boolean save(Job job);
}
