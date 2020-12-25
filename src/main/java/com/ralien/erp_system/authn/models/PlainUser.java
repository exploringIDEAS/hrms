package com.ralien.erp_system.authn.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class PlainUser {
    private long id;
    private String username;
    private String email;
    private String mobile;
    private String client;
}
