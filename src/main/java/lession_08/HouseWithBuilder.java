package main.java.lession_08;

public class HouseWithBuilder {

    private int doorNum = 1;
    private String topRoofColor = "red";
    private String color = "white";

    public HouseWithBuilder() {
    }

    protected HouseWithBuilder(Builder builder){
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        color = builder.color;
    }
    // READ ONLY


    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNum=" + doorNum +
                ", topRoofColor='" + topRoofColor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // Customer service | Inner class
    public static class Builder {
        private int doorNum = 1;
        private String topRoofColor = "red";
        private String color = "white";
        // ban sever chi duoc lay thong tin cua khach, khong duoc doi
        // nen la write only

        public void setDoorNum(int doorNum) {
            this.doorNum = doorNum;
        }

        public void setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }
}
