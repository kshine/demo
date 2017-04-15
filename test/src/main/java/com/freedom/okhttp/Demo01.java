package com.freedom.okhttp;

import com.freedom.util.HttpUtils;
import okhttp3.*;

import java.io.IOException;
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
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        String appSign = "476affecfe1a48dc9c78b7f7ad01cb71";
        String appKey = "da7e1886f2d07cbe";
        Map<String,String> headersMap = HttpUtils.getHeaders(appSign,appKey);
        String url = "http://211.138.118.14:1100/callshine/qryUserCondition/v1";
        Headers headers =new Headers.Builder()
//                .add("Host","aep.api.cmccopen.cn:1100")
                        .add("Authorization",headersMap.get("Authorization"))
                        .add("X-WSSE",headersMap.get("X-WSSE"))
                        .add("Content-Type",headersMap.get("Content-Type"))
                        .build();

        RequestBody formBody = new FormBody.Builder()
                .add("msisdn", "15168598761")
                .add("subTitle","001")
                .build();

        final OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .headers(headers)
                .post(formBody)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        //code  description

        System.out.println(response);
        System.out.println(response.headers());
        System.out.println(response.body().charStream().read());




    }
}
