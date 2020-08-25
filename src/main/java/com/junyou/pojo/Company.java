package com.junyou.pojo;

import lombok.Data;

/**
 * @author xiang
 * @create 2020-08-24 10:58
 */
@Data
public class Company {
    public Integer companyId;
    public String companyName;
    public Integer companyLogo;
    public String description;
    public Integer state;
    public String companyCode;
}
