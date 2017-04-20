package com.freedom.io.rw;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by kshine on 2017/4/19.
 * InputStreamReader(InputStream in)
 * InputStreamReader(InputStream in,String charsetName)
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));


        //读数据的两种方式
        //int read();
//        int ch = 0;
//        while((ch = isr.read())!= -1){
//            System.out.print((char) ch);
//        }

        //int read(char[] chs)
        char[] chs = new char[1024];
        int len ;
        while((len = isr.read(chs))!= -1){
            System.out.println(new String(chs,0,len));
        }

        isr.close();
    }
}
