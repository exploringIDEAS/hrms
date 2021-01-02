package com.ralien.erp_system.user.dto.person;

public class GetBranchResp {
    private String branch;

    public GetBranchResp() {}
    public GetBranchResp(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
