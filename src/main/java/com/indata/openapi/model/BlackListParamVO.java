package com.indata.openapi.model;

import com.sun.istack.internal.NotNull;

public class BlackListParamVO {
    /**
     * 黑名单组Id
     */
    private Integer blacklistInfoGroupId = -1;

    /**
     * 客户姓名
     */
    private String name;
    /**
     * 手机号
     */
    @NotNull
    private String mobile;
    /**
     * 备注
     */
    private String remark;
    /**
     * 公司Id(openapi使用-鉴权)
     */
    private Integer companyId;

    public Integer getBlacklistInfoGroupId() {
        return blacklistInfoGroupId;
    }

    public void setBlacklistInfoGroupId(Integer blacklistInfoGroupId) {
        this.blacklistInfoGroupId = blacklistInfoGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
