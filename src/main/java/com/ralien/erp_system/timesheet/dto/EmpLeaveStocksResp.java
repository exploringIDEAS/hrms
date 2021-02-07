package com.ralien.erp_system.timesheet.dto;

import java.util.ArrayList;
import java.util.List;

public class EmpLeaveStocksResp {
    private List<EmpLeaveStockResp> stocks;

    public EmpLeaveStocksResp() {
        stocks = new ArrayList<>();
    }

    public List<EmpLeaveStockResp> getStocks() {
        return stocks;
    }

    public void setStocks(List<EmpLeaveStockResp> stocks) {
        this.stocks = stocks;
    }
}
