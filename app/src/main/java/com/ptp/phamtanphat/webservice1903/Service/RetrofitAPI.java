package com.ptp.phamtanphat.webservice1903.Service;

public class RetrofitAPI {
    public static final String url = "http://10.0.0.16/Monan1903/";

    public static DataAPI getData(){
        return RetrofitInit.getclient(url).create(DataAPI.class);
    }
}
