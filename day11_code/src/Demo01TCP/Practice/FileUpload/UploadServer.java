package Demo01TCP.Practice.FileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        FileOutputStream fos = new FileOutputStream("" +
                "C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day11-code\\src\\Demo01TCP\\Practice\\FileUpload\\b.jpg");
        InputStream sis = socket.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        while((len = sis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        OutputStream sos = socket.getOutputStream();
        sos.write("图片上传成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }

}
