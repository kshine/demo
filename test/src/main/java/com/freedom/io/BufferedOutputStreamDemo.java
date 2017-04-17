package com.freedom.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kuiyuxiang on 2017/4/17.
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt",true));
        bos.write("hello".getBytes());
        bos.close();
    }
}
