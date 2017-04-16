package com.freedom.io;

import java.io.FileInputStream;

/**
 * Created by kshine on 2017/4/16.
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("fis.txt");

        //控制长度 当读取到最后的时候 一定要控制最后一次读取的长度
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys)) != -1){
            System.out.print(new String(bys,0,len));
        }
        fis.close();
    }
}
