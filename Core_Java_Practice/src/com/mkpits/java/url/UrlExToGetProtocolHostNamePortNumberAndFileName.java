//Java program of URL to get the Protocol, Host Name, Port Number and File Name.

package src.com.mkpits.java.url;

import java.net.*;

public class UrlExToGetProtocolHostNamePortNumberAndFileName {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com/mkpits");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
