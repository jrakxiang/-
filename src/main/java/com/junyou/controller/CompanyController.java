package com.junyou.controller;

import com.junyou.pojo.Company;
import com.junyou.pojo.JobHunter;
import com.junyou.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 12:51
 */
@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("/getCompanyAll")
    public List<Company> getAll(){
        List<Company> companyList=companyService.selectAllCompany();
        return companyList;
    }

    @PostMapping(value = "/addCompany")
    public String addCompany(@RequestParam(value = "name") String name,@RequestParam(value = "loge")  Integer loge,@RequestParam(value = "description")  String description,@RequestParam(value = "state")  Integer state,@RequestParam(value = "companyCode")  String companyCode){
        Company company = new Company();
        company.setCompanyName(name);
        company.setCompanyLogo(loge);
        company.setDescription(description);
        company.setState(state);
        company.setCompanyCode(companyCode);
        int num=companyService.addCompany(company);
        return "添加公司"+num+"条记录";
    }

    @RequestMapping(value = "/deleteCompany/{id}")
    public String deleteJobHunTer(@PathVariable Integer id){
        int num=companyService.deleteCompany(id);
        return "删除公司"+num+"条记录";
    }

    @GetMapping("/getCompanyAll/{name}")
    public List<Company> getParmAll(@PathVariable String name){
        Company company = new Company();
        company.setCompanyName(name);
        List<Company> companyList = companyService.selectParmCompany(company);
        return companyList;
    }

    @GetMapping("/getCompanyAll/{name}/{description}")
    public List<Company> getParmAll(@PathVariable String name, @PathVariable String description){
        Company company = new Company();
        company.setCompanyName(name);
        company.setDescription(description);
        List<Company> companyList = companyService.selectParmCompany(company);
        return companyList;
    }

    @GetMapping("/getCompanyAll/{name}/{description}/{companyCode}")
    public List<Company> getParmAll(@PathVariable String name, @PathVariable String description,@PathVariable String companyCode){
        Company company = new Company();
        company.setCompanyName(name);
        company.setDescription(description);
        company.setCompanyCode(companyCode);
        List<Company> companyList = companyService.selectParmCompany(company);
        return companyList;
    }
}
