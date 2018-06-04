package com.ptp.phamtanphat.webservice1903.Service;

import com.ptp.phamtanphat.webservice1903.Monan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataAPI {
    @GET("cacmonan.php")
    Call<List<Monan>> getTatcamonan();
}
