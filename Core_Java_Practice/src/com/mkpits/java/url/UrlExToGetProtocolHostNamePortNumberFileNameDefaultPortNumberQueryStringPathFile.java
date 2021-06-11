//Java program of URL to get the Protocol, Host Name, Port Number, File Name,
//Default Port Number, Query String, Path and File.

package src.com.mkpits.java.url;

import java.net.*;

public class UrlExToGetProtocolHostNamePortNumberFileNameDefaultPortNumberQueryStringPathFile {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/search?q=google&oq=google&sourceid=chrome&ie=UTF-8");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Default Port Number: " + url.getDefaultPort());
            System.out.println("Query String: " + url.getQuery());
            System.out.println("Path: " + url.getPath());
            System.out.println("File: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
