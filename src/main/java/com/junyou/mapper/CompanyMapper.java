package com.junyou.mapper;

import com.junyou.pojo.Company;
import com.junyou.pojo.JobHunter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 12:40
 */
@Mapper
public interface CompanyMapper {
    List<Company> selectAllCompany();
    List<Company> selectParmCompany(@Param("company") Company company);
    int deleteCompany(Integer companyId);
    int addCompany(Company company);
}
