package com.freedom.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kshine on 2017/4/16.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("Hello,io ".getBytes());
        fos.write("java ".getBytes());
        fos.write(97);
        fos.write("\n".getBytes());
        byte[] bys = {97,98,99,100,101};
        fos.write(bys);
        //换行
        fos.write("\n".getBytes());
        fos.write(bys,1,3);
        fos.write("\n".getBytes());
        /**
         * 1 如何实现换行    \r\n
         * 2 如何实现数据的追加写入  append= true  默认为false
         */
        for(int i = 0;i<10;i++){
            fos.write(("hello"+i).getBytes());
            //换行
            fos.write("\n".getBytes());
        }

        fos.close();
    }
}
