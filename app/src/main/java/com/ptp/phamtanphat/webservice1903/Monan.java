package com.ptp.phamtanphat.webservice1903;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Monan {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Tenmonan")
    @Expose
    private String tenmonan;
    @SerializedName("Giamonan")
    @Expose
    private String giamonan;
    @SerializedName("Diadiem")
    @Expose
    private String diadiem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public String getGiamonan() {
        return giamonan;
    }

    public void setGiamonan(String giamonan) {
        this.giamonan = giamonan;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

}