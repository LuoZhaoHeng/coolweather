package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by squal on 2017/4/7.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
