package com.prger.service.impl;

import com.prger.dao.JobDao;
import com.prger.domain.Job;
import com.prger.service.JobService;

import java.util.List;

/**
 * Created by prgers on 2021/9/24 5:57 下午
 */
public class JobServiceImpl implements JobService {

    private JobDao jobDao;

    public void setJobDao(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Override
    public List<Job> list() {
        return jobDao.list();
    }

    @Override
    public boolean save(Job job) {
        return jobDao.save(job);
    }
}
