package com.junyou.service;

import com.junyou.pojo.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 12:49
 */
public interface CompanyService {
    List<Company> selectAllCompany();
    List<Company> selectParmCompany( Company company);
    int deleteCompany(Integer companyId);
    int addCompany(Company company);
}
