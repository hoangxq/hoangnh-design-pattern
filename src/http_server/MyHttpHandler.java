package http_server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MyHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
        if (t.getRequestMethod().equals("GET")) {
            handleGetRequest(t);
        } else if (t.getRequestMethod().equals("POST")) {
            handlePostRequest(t);
        }
    }

    private void handleGetRequest(HttpExchange t) throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentTime = formatter.format(date);

        String response = "Current time: " + currentTime;
        t.getResponseHeaders().add("Content-Type", "text/plain");
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private void handlePostRequest(HttpExchange t) throws IOException {
        InputStream is = t.getRequestBody();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String requestBody = br.readLine();

        String timeZoneStr = requestBody.substring(requestBody.indexOf("=") + 1);

        if (timeZoneStr.matches("^[+-]\\d{1,2}$")) {
            Calendar calendar = Calendar.getInstance();
            TimeZone timeZone = TimeZone.getTimeZone("GMT" + timeZoneStr);
            calendar.setTimeZone(timeZone);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            dateFormat.setTimeZone(timeZone);
            String currentTime = dateFormat.format(calendar.getTime());

            String response = "Current time in GMT" + timeZoneStr + " is: " + currentTime;
            t.getResponseHeaders().add("Content-Type", "text/plain");
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        } else {
            String errorResponse = "Invalid timezone format: " + timeZoneStr;
            t.getResponseHeaders().add("Content-Type", "text/plain");
            t.sendResponseHeaders(400, errorResponse.length());
            OutputStream os = t.getResponseBody();
            os.write(errorResponse.getBytes());
            os.close();
        }
    }

}
