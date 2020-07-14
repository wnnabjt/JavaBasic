package Demo02BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01BSTCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket BS = server.accept();
        InputStream is = BS.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        System.out.println(line);
        String[] splitString = line.split(" ");
        String htmlPath = splitString[1].substring(1);
        FileInputStream fis = new FileInputStream(htmlPath);
        OutputStream obs = BS.getOutputStream();
        obs.write(("HTTP/1.1 200 OK\r\n").getBytes());
        obs.write("Content-Type:text/html\r\n". getBytes());
        obs.write("\r\n".getBytes());
        while((len = fis.read(bytes)) != -1) {
            obs.write(bytes, 0, len);
        }
        fis.close();
        BS.close();
        server.close();
    }

}
