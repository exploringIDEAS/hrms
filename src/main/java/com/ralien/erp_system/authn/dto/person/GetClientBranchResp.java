package com.ralien.erp_system.authn.dto.person;

public class GetClientBranchResp {
    private GetClientResp client;
    private GetBranchResp branch;

    public GetClientBranchResp() {}

    public GetClientBranchResp(GetClientResp client, GetBranchResp branch) {
        this.client = client;
        this.branch = branch;
    }

    public GetClientResp getClient() {
        return client;
    }

    public void setClient(GetClientResp client) {
        this.client = client;
    }

    public GetBranchResp getBranch() {
        return branch;
    }

    public void setBranch(GetBranchResp branch) {
        this.branch = branch;
    }
}
