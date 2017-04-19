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
        int ch = 0;
        while((ch = isr.read())!= -1){
            System.out.print((char) ch);
        }
        isr.close();
    }
}
