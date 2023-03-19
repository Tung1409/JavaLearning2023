package main.java.lab_6;

public class Lab6_4 {
//    String url = "https://google.com";
//    Check http OR https; domain name, .com OR .net

    public static void main(String[] args) {
        String url = "https://google.com";

        // Check http or https
        if (url.contains("https")){
            System.out.println("url has https");
        } else if (url.contains("http")) {
            System.out.println("url has http");
        }

        // Check Domain
        String[] splitUrl = url.split("\\.");
        String domainName = splitUrl[splitUrl.length -1];
        if (domainName.equals("com")){
            System.out.println("Domain name is .com");
        } else if (domainName.equals("net")){
            System.out.println("Domain name is .net");
        }


    }
}
