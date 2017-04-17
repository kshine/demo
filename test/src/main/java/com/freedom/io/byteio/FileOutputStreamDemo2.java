package com.freedom.io.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kshine on 2017/4/16.
 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos2.txt");
            fos.write("java".getBytes());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //fos 可能会因为文件不存在而导致空指针
            if(null != fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }





    }
}
