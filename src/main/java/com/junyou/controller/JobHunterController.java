package com.junyou.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.junyou.pojo.JobHunter;
import com.junyou.service.JobHunterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @author xiang
 * @create 2020-08-24 11:31
 */
@RestController
public class JobHunterController {
    @Autowired
    JobHunterService jobHunterService;


    @GetMapping("/getJobHunterAll")
    public List<JobHunter> getAll() {
        List<JobHunter> jobHunterList = jobHunterService.selectAllJobhunter();
        return jobHunterList;
    }

    @RequestMapping(value = "/deleteJobHunTer/{id}")
    public String deleteJobHunTer(@PathVariable Integer id) {
        int num = jobHunterService.deletejobHunter(id);
        return "删除求职" + num + "条记录";
    }

    @PostMapping(value = "/insertJobHunTer")
    public String insertJobHunTer(@RequestParam(value = "name") String name,@RequestParam(value = "job")  String job,@RequestParam(value = "department")  String department) {

            JobHunter jobHunter = new JobHunter();
            jobHunter.setJobhunterName(name);
            jobHunter.setJobhunterJob(job);
            jobHunter.setJobhunterDepartment(department);
            int num = jobHunterService.addjobHunter(jobHunter);
            return "添加求职" + num + "条记录";
    }

    @GetMapping("/getJobHunterAll/{name}")
    public List<JobHunter> getParmAll(@PathVariable String name) {
        JobHunter jobHunter = new JobHunter();
        jobHunter.setJobhunterName(name);
        List<JobHunter> jobHunterList = jobHunterService.selectParmJobhunter(jobHunter);
        return jobHunterList;
    }

    @GetMapping("/getJobHunterAll/{name}/{job}")
    public List<JobHunter> getParmAll(@PathVariable String name, @PathVariable String job) {
        JobHunter jobHunter = new JobHunter();
        jobHunter.setJobhunterName(name);
        jobHunter.setJobhunterJob(job);
        List<JobHunter> jobHunterList = jobHunterService.selectParmJobhunter(jobHunter);
        return jobHunterList;
    }

    @GetMapping("/getJobHunterAll/{name}/{job}/{department}")
    public List<JobHunter> getParmAll(@PathVariable String name, @PathVariable String job, @PathVariable String department) {
        JobHunter jobHunter = new JobHunter();
        jobHunter.setJobhunterName(name);
        jobHunter.setJobhunterJob(job);
        jobHunter.setJobhunterDepartment(department);
        List<JobHunter> jobHunterList = jobHunterService.selectParmJobhunter(jobHunter);
        return jobHunterList;
    }
}
 