
package com.example.demo;
/*
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.net.ssl.HttpsURLConnection;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@SpringBootApplication(scanBasePackages = {"com.example.demo.server.main"})
class SpringBootRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApplication.class, args);
    }
}



class DemoApplicationTests {


    URL url_ = null;
    HttpsURLConnection connection_ = null;
    int _responseCode = 404;

    @Test
    void contextLoads() {

        try {
            url_ = new URL("http://localhost:8080/welcome/user?name=Abhijit");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        sendRequest(url_, "GET", "", "text/xml");
    }



    private boolean setSSLConnection(URL url, String method, String msgtype){
        try {
            connection_ = (HttpsURLConnection) url.openConnection();
            if (method == "POST")
                connection_.setRequestMethod(method);
            connection_.setDoInput(true);
            connection_.setRequestProperty("Content-Type", msgtype );
            connection_.connect();
            return true;

        }
        catch (Exception e){
            connection_.disconnect();
            connection_ = null;
            return false;
        }
    }

    public void releaseConnection(){
        connection_.disconnect();
        connection_ = null;
    }

    public  String sendRequest(URL url, String method, String message, String msgtype){

        String response = null;
        if (setSSLConnection(url, method, msgtype)){
            try {
                //sending the request to remote server
                OutputStreamWriter writer = new OutputStreamWriter(connection_.getOutputStream());
                writer.write(message);
                writer.flush();
                writer.close();
                _responseCode = connection_.getResponseCode();

                //reading the response
                InputStreamReader reader = new InputStreamReader(connection_.getInputStream());
                StringBuilder buf = new StringBuilder();
                char[] cbuf = new char[2048];
                int num;
                while (-1 != (num = reader.read(cbuf))){
                    buf.append(cbuf, 0, num);
                }
                response = buf.toString();
            }
            catch (Exception e){
                response = "<EXCEPTION>Exception occurred while sending message</EXCEPTION>";
                e.printStackTrace();
            }
        }
        releaseConnection();
        return response;
    }
}
 */



/* "text/xml" */