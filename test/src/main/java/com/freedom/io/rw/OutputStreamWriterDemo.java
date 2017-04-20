package com.freedom.io.rw;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by kshine on 2017/4/19.
 * OutputStreamWriter(OutputStream out) 字符流
 * 把字节流转换成字符流
 * 字符流=字节流+编码表
 * OutputStreamWriter(OutputStream out,String charsetName)
 * 简化写法 FileWriter  FileReader
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
     //   OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
        osw.write("中国");

        //OutputStreamWriter的方法
        //1 写入一个字符
        osw.write('a');
        osw.write(97);
        //为什么数据没有进去 在缓冲区
        //写入一个字符数组
        char[] chs ={'a','b','c','d','e'};
        osw.write(chs);
        osw.write(chs,1,3);
        //字符串  字符串的一部分
        String s = "万万没想到";
        osw.write(s);
        osw.write(s,1,3);
        //把缓冲区的内容写入文件

        osw.flush();

        osw.close();
    }
}
