package com.junyou.mapper;

import com.junyou.pojo.JobHunter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 11:14
 */
@Mapper
public interface JobHunterMapper {
    List<JobHunter> selectParmJobhunter(@Param("jobHunter") JobHunter jobHunter);
    List<JobHunter> selectAllJobhunter();
    int deletejobHunter(Integer jobhunterId);
    int addjobHunter(JobHunter jobHunter);
}
