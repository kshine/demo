package com.freedom.okhttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;

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
    public static void main(String[] args) {
        final OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().build();
    }
}
