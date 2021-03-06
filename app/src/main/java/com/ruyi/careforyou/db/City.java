package com.ruyi.careforyou.db;

import org.litepal.exceptions.DataSupportException;

public class City extends DataSupportException {
    public City(String errorMessage) {
        super(errorMessage);
    }

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public  void save(){

    }
}
