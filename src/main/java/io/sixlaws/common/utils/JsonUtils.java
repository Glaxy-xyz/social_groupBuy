package io.sixlaws.common.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;


public  class JsonUtils {


    public static List<String> JsonToList(String jsonString){
        return JSON.parseArray(jsonString, String.class);
    }
}
