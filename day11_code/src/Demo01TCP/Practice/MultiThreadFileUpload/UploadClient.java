package Demo01TCP.Practice.MultiThreadFileUpload;

/*
    文件从客户端上传到服务器，实质上就是文件的复制过程。
        数据源 --> 客户端 --> 服务器 --> 数据目的地
        【注意】 客户端，服务器和自身硬盘进行通讯使用的是本地字节流
            客户端和服务器之间通讯必须使用Socket包含的网络字节流

    【注意】！！！！！
        我们在读取本地文件并上传的时候，如果文件读取完毕，len为-1，但是这个-1并不会上传到服务器，因此服务器端的read进入到阻塞状态。
        因此如服务器端无法执行到反馈部分，客户端也无法接收反馈，因此两个程序都会进入到阻塞状态。

        如何解决呢？
            Socket中包含一个方法
                void shutdownOutput() 禁用词套接字的输出流
            对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列。
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("" +
                "C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day11-code\\src\\Demo01TCP\\Practice\\FileUpload\\a.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream sos = socket.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1) {
            sos.write(bytes, 0, len);
        }
        socket.shutdownOutput();//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        InputStream sis = socket.getInputStream();
        while((len = sis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
        socket.close();
    }

}
