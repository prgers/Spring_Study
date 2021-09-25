package com.prger.service.impl;

import com.prger.dao.JobDao;
import com.prger.domain.Job;
import com.prger.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by prgers on 2021/9/24 5:57 下午
 */
@Service("jobService")
public class JobServiceImpl implements JobService {

    private JobDao jobDao;

    @Autowired
    public void setJobDao(JobDao jobDao) {
        this.jobDao = jobDao;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Job> list() {
        return jobDao.list();
    }

    @Transactional
    @Override
    public boolean save(Job job) {
        return jobDao.save(job);
    }

    @Transactional
    @Override
    public boolean update(Job job) {
        return jobDao.update(job);
    }

    @Transactional
    @Override
    public void test(Job job) {
        jobDao.save(job);
        System.out.println(10 / 0);
        job.setId(14);
        jobDao.update(job);
    }
}
