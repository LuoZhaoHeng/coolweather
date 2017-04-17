package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by squal on 2017/4/7.
 */

public class Now {

    @SerializedName("tmp")
    public String tempareture;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
