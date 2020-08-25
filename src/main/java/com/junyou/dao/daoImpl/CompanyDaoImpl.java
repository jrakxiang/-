package com.junyou.dao.daoImpl;

import com.junyou.dao.CompanyDao;
import com.junyou.mapper.CompanyMapper;
import com.junyou.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 12:48
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {
    @Autowired
    CompanyMapper companyMapper;
    @Override
    public List<Company> selectAllCompany() {
        return companyMapper.selectAllCompany();
    }

    @Override
    public List<Company> selectParmCompany(Company company) {
        return companyMapper.selectParmCompany(company);
    }

    @Override
    public int deleteCompany(Integer companyId) {
        return companyMapper.deleteCompany(companyId);
    }

    @Override
    public int addCompany(Company company) {
        return companyMapper.addCompany(company);
    }
}
