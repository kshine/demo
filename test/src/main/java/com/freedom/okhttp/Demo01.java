package com.freedom.okhttp;

import com.freedom.util.HttpUtils;
import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kuiyuxiang on 2017/4/14.
 *  商用域地址：211.138.118.14:1100
 *  Host：aep.api.cmccopen.cn
 *
 *  测试域地址：211.138.118.15:1100
 *  Host：aep.test.api.cmccopen.cn
 *
 *  App标识
 *  889890ad6f9844b1929e65a4c376656a
 *
 *  App密钥
 *  3b7f06fb3ec9991f
 *
 *
 *  476affecfe1a48dc9c78b7f7ad01cb71
 *  da7e1886f2d07cbe
 */
public class Demo01 {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static void main(String[] args) throws IOException {

        String appSign = "889890ad6f9844b1929e65a4c376656a";
        String appKey = "3b7f06fb3ec9991f";
        Map<String,String> headersMap = HttpUtils.getHeaders(appSign,appKey);
        String url = "http://211.138.118.14:1100/callshine/qryUserCondition/v1";
        Headers headers =new Headers.Builder()
                .add("Host","aep.api.cmccopen.cn")
                        .add("Authorization",headersMap.get("Authorization"))
                        .add("X-WSSE",headersMap.get("X-WSSE"))
                        .add("Content-Type",headersMap.get("Content-Type"))
                        .build();

        Gson gson = new Gson();
        Map<String,String> map = new HashMap<String,String>();
        map.put("msisdn", "15168598761");
        map.put("subTitle","001");
        String json =gson.toJson(map);
        RequestBody body = RequestBody.create(JSON, json);
        System.out.println(body);

//        RequestBody formBody = new FormBody.Builder()
//                .add("msisdn", "15168598761")
//                .add("subTitle","001")
//                .build();





        final OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(body)
                .build();



        Response response = okHttpClient.newCall(request).execute();
        //code  description

        System.out.println(response);
        System.out.println(response.headers());




    }
}
