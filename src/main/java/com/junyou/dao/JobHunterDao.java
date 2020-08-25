package com.junyou.dao;

import com.junyou.pojo.JobHunter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 11:27
 */
public interface JobHunterDao {
    List<JobHunter> selectAllJobhunter();
    List<JobHunter> selectParmJobhunter(JobHunter jobHunter);
    int deletejobHunter(Integer jobhunterId);
    int addjobHunter(JobHunter jobHunter);
}
