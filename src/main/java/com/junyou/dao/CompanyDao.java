package com.junyou.dao;

import com.junyou.pojo.Company;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 12:39
 */
public interface CompanyDao {
    List<Company> selectAllCompany();
    List<Company> selectParmCompany(Company company);
    int deleteCompany(Integer companyId);
    int addCompany(Company company);
}
