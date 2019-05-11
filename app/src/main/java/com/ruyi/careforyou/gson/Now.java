package com.ruyi.careforyou.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;

    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
