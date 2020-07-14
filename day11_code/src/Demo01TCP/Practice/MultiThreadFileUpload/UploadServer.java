package Demo01TCP.Practice.MultiThreadFileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class UploadServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while(true) {
            Socket socket = server.accept();
            File file = new File("day11-code\\upload");
            if(!file.exists()) {
                file.mkdirs();
            }
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        String loadName = "FileUpload" + System.currentTimeMillis() + new Random().nextInt() + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\" + loadName);
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
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }
//        server.close();
    }

}
