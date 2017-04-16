package com.freedom.io;

import java.io.FileInputStream;

/**
 * Created by kshine on 2017/4/16.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("fis.txt");
        //读取字节 字节流
        int by = 0;
        while ((by = fis.read()) !=-1){
            System.out.print((char)by);
        }

        fis.close();
    }
}
