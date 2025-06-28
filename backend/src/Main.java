import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Java HTTP Server started on port 8080...");
        while (true) {
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String line;
            while ((line = in.readLine()) != null && !line.isEmpty()) {
                // HTTP request read
            }
            out.println("HTTP/1.1 200 OK\r\nContent-Type: text/plain\r\n\r\nHello from Java backend!");
            clientSocket.close();
        }
    }
}