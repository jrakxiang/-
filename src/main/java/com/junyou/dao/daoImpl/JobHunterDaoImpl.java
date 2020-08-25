package com.junyou.dao.daoImpl;

import com.junyou.dao.JobHunterDao;
import com.junyou.mapper.JobHunterMapper;
import com.junyou.pojo.JobHunter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 11:28
 */
@Repository
public class JobHunterDaoImpl implements JobHunterDao {

    @Autowired
    JobHunterMapper jobHunterMapper;


    @Override
    public List<JobHunter> selectAllJobhunter() {

        return jobHunterMapper.selectAllJobhunter();
    }

    @Override
    public List<JobHunter> selectParmJobhunter(JobHunter jobHunter) {
        return jobHunterMapper.selectParmJobhunter(jobHunter);
    }

    @Override
    public int deletejobHunter(Integer jobhunterId) {
        return jobHunterMapper.deletejobHunter(jobhunterId);
    }

    @Override
    public int addjobHunter(JobHunter jobHunter) {
        return jobHunterMapper.addjobHunter(jobHunter);
    }

}