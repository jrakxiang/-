package com.junyou.service;

import com.junyou.pojo.JobHunter;


import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 11:05
 */
public interface JobHunterService {
    List<JobHunter> selectParmJobhunter(JobHunter jobHunter);
    List<JobHunter> selectAllJobhunter();
    int deletejobHunter(Integer jobhunterId);
    int addjobHunter(JobHunter jobHunter);
}
