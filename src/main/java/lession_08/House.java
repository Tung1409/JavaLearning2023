package main.java.lession_08;

public class House {

    private int doorNum = 1;
    private String topRoofColor = "red";
    private String color = "white";

    // problem1: neu nhieu attribute thi rat nhieu overloading
    // problem2: neu lay tat ca attribute dua vao constructor
    //thi luc dung rat kho doc
    // cach giai quyet: chi tao. setter


    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        House house = new House();
        house.setDoorNum(2);
        house.setTopRoofColor("blue");
    }
    // Immutable object: object khong duoc thay doi
    // khi object co qua nhieu Attribute ma o do object do la immutable
    // thi minh dung design pattern

    // Nhung neu object do co luc attribute lay cai nay, luc lay cai kia,
    // con lai la default value thi khong dung Design pattern => dung setter la du
}
