package com.freedom.json;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kuiyuxiang on 2017/4/20.
 */
public class GsonDemo {
    public static void main(String[] args) {
        //map转换为json
        Gson gson = new Gson();
        Map<String,String> map = new HashMap<String,String>();
        map.put("msisdn", "15168598761");
        map.put("subTitle","001");
        String s =gson.toJson(map);
        System.out.println(s);

        //序列化 toJson(Object)
        //反序列化  fromJson()
    }
}
