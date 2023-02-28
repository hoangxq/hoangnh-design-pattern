package http_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MyHttpHandler {

    public void handle(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String headerLine = in.readLine();

        String[] tokens = headerLine.split(" ");
        String method = tokens[0];
        String version = tokens[2];
        System.out.println(method + " " + version);

        if (method.equalsIgnoreCase("GET")) {
            handleGetRequest(clientSocket);
        } else if (method.equalsIgnoreCase("POST")) {
            handlePostRequest(clientSocket, in);
        }
    }

    private void handleGetRequest(Socket clientSocket) throws IOException {
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        out.println("HTTP/1.1 200 OK");
        out.println("Content-Type: text/plain");
        out.println("Server: MyHttpServer");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTime = formatter.format(date);
        String responseBody = "Current time: " + currentTime;
        out.println("Content-Length: " + responseBody.length());

        out.println("");
        out.println(responseBody);

        clientSocket.close();
    }

    private void handlePostRequest(Socket clientSocket, BufferedReader in) throws IOException {
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        String timeZoneStr;
        int contentLength = 0;

        String headerLine;
        while ((headerLine = in.readLine()) != null && headerLine.length() > 0) {
            if (headerLine.startsWith("content-length:")) {
                contentLength = Integer.parseInt(headerLine.substring(16).trim());
            } else if (headerLine.startsWith("Time-Zone:")) {
                timeZoneStr = headerLine.substring(10).trim();
            }
        }

        StringBuilder requestBodyBuilder = new StringBuilder();
        for (int i = 0; i < contentLength; i++) {
            requestBodyBuilder.append((char) in.read());
        }
        String requestBody = requestBodyBuilder.toString();
        System.out.println("Request body: " + requestBody);
        timeZoneStr = requestBody.substring(requestBody.indexOf("=") + 1);

        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone("GMT" + timeZoneStr);
        calendar.setTimeZone(timeZone);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateFormat.setTimeZone(timeZone);
        String currentTime = dateFormat.format(calendar.getTime());

        String responseBody = "Current time: " + currentTime;

        out.println("HTTP/1.1 200 OK");
        out.println("Content-Type: text/html");
        out.println("Server: MyHttpServer");
        out.println("Content-Length: " + responseBody.length());

        out.println("");
        out.println(responseBody);

        clientSocket.close();
    }

}
