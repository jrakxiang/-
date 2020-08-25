package com.junyou.service.serviceImpl;

import com.junyou.dao.CompanyDao;
import com.junyou.pojo.Company;
import com.junyou.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 12:50
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyDao companyDao;
    @Override
    public List<Company> selectAllCompany() {
        return companyDao.selectAllCompany();
    }

    @Override
    public List<Company> selectParmCompany(Company company) {
        return companyDao.selectParmCompany(company);
    }

    @Override
    public int deleteCompany(Integer companyId) {
        return companyDao.deleteCompany(companyId);
    }

    @Override
    public int addCompany(Company company) {
        return companyDao.addCompany(company);
    }
}
