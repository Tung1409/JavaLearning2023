package main.java.lab_6;

import java.util.Arrays;

public class Lab6_4 {
//    String url = "https://google.com";
//    Check http OR https; domain name, .com OR .net

    public static void main(String[] args) {
        String url = "https://google.com";
        /* 1. trim 2 dau roi lay ra 5 ky tu, check xem co https hay khong
         * */
//        String checkhttps;
//        url.trim();
//        System.out.println(url);
//        url.substring(0, 6);
//        System.out.println(url.substring(0, 6));
//        checkhttps = url.substring(0, 6);
//        if (checkhttps.contains("https")){
//        System.out.println(checkhttps.contains("https"));
//        }else System.out.println("day la http chu khong phai https");
//
//        //check domain name
//        String domainName;
//        domainName = url.replaceAll("https://","");
//        System.out.println("Domain name is: " + domainName);

        //check .com or .net
        String url2 = "https://google.com";
        String[] urlSplit = url2.split("\\.");
        System.out.println(Arrays.toString(urlSplit));
        // chua lam xong
    }
}
