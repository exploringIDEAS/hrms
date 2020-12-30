package com.ralien.erp_system.authn.dto.person;

public class GetClientResp {
    private String title;

    public GetClientResp() {}

    public GetClientResp(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
