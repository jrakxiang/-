package com.junyou.service.serviceImpl;

import com.junyou.dao.JobHunterDao;
import com.junyou.pojo.JobHunter;
import com.junyou.service.JobHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 11:25
 */
@Service
public class JobHunterServiceImpl implements JobHunterService {

     @Autowired
    JobHunterDao jobHunterDao;


    @Override
    public List<JobHunter> selectParmJobhunter(JobHunter jobHunter) {
        return jobHunterDao.selectParmJobhunter(jobHunter);
    }

    @Override
    public List<JobHunter> selectAllJobhunter() {
        return jobHunterDao.selectAllJobhunter();
    }

    @Override
    public int deletejobHunter(Integer jobhunterId) {
        return jobHunterDao.deletejobHunter(jobhunterId);
    }

    @Override
    public int addjobHunter(JobHunter jobHunter) {
        return jobHunterDao.addjobHunter(jobHunter);
    }
}
