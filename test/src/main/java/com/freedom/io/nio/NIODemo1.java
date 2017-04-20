package com.freedom.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

/**
 * Created by kshine on 2017/4/20.
 * NIO主要用到的是块，所以NIO的效率要比IO高
 * 一套是针对标准输入输出NIO，另一套就是网络编程NIO
 * Buffer和Channel 核心对象
 *
 * 任何来源和目的数据都必须通过一个Channel对象。
 * 一个Buffer实质上是一个容器对象，发给Channel的所有对象都必须先放到Buffer中；
 * 同样的，从Channel中读取的任何数据都要读到Buffer中。
 */
public class NIODemo1 {
    public static void main(String[] args) throws Exception {

        /*
          使用 Buffer 读写数据一般遵循以下四个步骤：
         1.写入数据到 Buffer；
         2.调用 flip() 方法 ---- 将 Buffer 从写模式切换到读模式。
         3.从 Buffer 中读取数据；
         4.调用 clear() 方法或者 compact() 方法。---清空缓冲区
         clear() 方法会清空整个缓冲区。
         compact() 方法只会清除已经读过的数据。任何未读的数据都被移到缓冲区的起始处，新写入的数据将放到缓冲区未读数据的后面。
         */

        /*
          Channel是一个对象，可以通过它读取和写入数据。可以把它看做IO中的流。但是它和流相比还有一些不同：
         Channel是双向的，既可以读又可以写，而流是单向的
         Channel可以进行异步的读写
         对Channel的读写必须通过buffer对象

         在Java NIO中Channel主要有如下几种类型：
         FileChannel：从文件读取数据的
         DatagramChannel：读写UDP网络协议数据
         SocketChannel：读写TCP网络协议数据
         ServerSocketChannel：可以监听TCP连接
         */

        /*
          因此，如果从文件读取数据的话，需要如下三步：
         从FileInputStream获取Channel
         创建Buffer
         从Channel读取数据到Buffer
         */
        FileOutputStream fis = new FileOutputStream("README.md");
        FileChannel fc = fis.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.flip();
        fc.read(buffer);
//
//
//        FileOutputStream fos = new FileOutputStream( "nio.txt" );
//        FileChannel fc2 = fos.getChannel();
//        fc.write( buffer );


    }

}
