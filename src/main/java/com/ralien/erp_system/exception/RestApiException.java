package com.ralien.erp_system.exception;

import java.util.Date;
public class RestApiException {
    private String message;
    private String error;
    private Date timestamp;
    private int status;
    private String path;

    public RestApiException(String message, String error, Date timestamp, int status, String path) {
        this.message = message;
        this.error = error;
        this.timestamp = timestamp;
        this.status = status;
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }
}
