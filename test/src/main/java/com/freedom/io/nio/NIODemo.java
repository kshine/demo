package com.freedom.io.nio;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by kshine on 2017/5/22.
 * Path 路径
 * Paths 有一个静态方法 返回一个路径
 *      public static Path get(URI uri)
 * Files 提供静态方法
 *      copy方法
 *      write方法
 *
 */
public class NIODemo {
    public static void main(String[] args) throws Exception {
        Files.copy(Paths.get("copy.java"),new FileOutputStream("copy2.java"));
    }
}
