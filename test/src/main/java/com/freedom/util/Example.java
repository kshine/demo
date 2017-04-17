package com.freedom.util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by kuiyuxiang on 2017/4/17.
 */
public class Example {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";
        //指定编码  文字编解码
        //byte[] bys = s.getBytes();  //[-28, -67, -96, -27, -91, -67]
        //byte[] bys =s.getBytes("GBK");//[-60, -29, -70, -61]
        byte[] bys =s.getBytes("UTF8");//[-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(bys));

        //String ss =new String(bys);
        //String ss = new String(bys,"GBK");
        String ss = new String(bys,"utf8");
        System.out.println(ss);
    }
}
