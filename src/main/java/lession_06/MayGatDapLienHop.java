package main.java.lession_06;

public class MayGatDapLienHop {

    // What to solve

    public void gatLua(String caylua){
        System.out.println("Dang gat " + caylua);
    }

    public void xayLua(String hatLua){
        System.out.println("Dang xay " + hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        // .: dotation

        mayGatDapLienHop.gatLua("Cay lua");
        mayGatDapLienHop.xayLua("hat lua");
    }
}
