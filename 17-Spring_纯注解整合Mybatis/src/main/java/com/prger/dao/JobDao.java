package com.prger.dao;

import com.prger.domain.Job;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface JobDao {

    List<Job> list();

    @Insert("INSERT INTO job(name, duty) VALUES(#{name}, #{duty})")
    boolean save(Job job);
}
