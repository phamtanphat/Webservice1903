package com.ptp.phamtanphat.webservice1903.Service;

import com.ptp.phamtanphat.webservice1903.Monan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface DataAPI {

    @GET("cacmonan.php")
    Call<List<Monan>> getTatcamonan();
//    http://10.0.0.16/Monan1903/themmonan.php?Tenmonan=Haca&Giamonan=15000&Diachi=duong3thang2
    @GET("themmonan.php")
    Call<String> onInsertMonan(@Query("Tenmonan") String tenmonan ,
                               @Query("Giamonan") String giamonan ,
                               @Query("Diachi") String diachi);

    @FormUrlEncoded
    @POST("delete.php")
    Call<String> onDeleteMonan(@Field("Idmonan") Integer idmonan);
}
