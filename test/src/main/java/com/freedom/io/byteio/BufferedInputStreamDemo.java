package com.freedom.io.byteio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

/**
 * Created by kuiyuxiang on 2017/4/17.
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bis.txt"));

        byte[] bys = new byte[1024];
        int len = 0;
        if((len = bis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }

        bis.close();


    }
}
