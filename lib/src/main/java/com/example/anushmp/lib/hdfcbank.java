package com.example.anushmp.lib;

import java.util.HashMap;

public class hdfcbank {

    private Integer customerbalance;

    protected HashMap<String, String> info;

    public hdfcbank(){

        info = new HashMap<>();

        this.customerbalance = 100;
        info.put("name","John Smith");
        info.put("address","123 apple boulevard San Diego California");
        info.put("accountbalance",customerbalance.toString());

    }

    public void setCustomerbalance(int newBalance){

        this.customerbalance = newBalance;

    }

    public Integer getCustomerbalance(){

        return this.customerbalance;

    }


    public HashMap<String,String> getInfo(){

        return this.info;
    }


}
