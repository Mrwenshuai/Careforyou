package com.ruyi.careforyou.db;

import org.litepal.exceptions.DataSupportException;

public class County extends DataSupportException {
    public County(String errorMessage) {
        super(errorMessage);
    }

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void save(){

    }
}
