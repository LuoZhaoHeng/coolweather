package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by squal on 2017/4/7.
 */

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperture temperture;

    @SerializedName("cond")
    public More more;

    public class Temperture {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
