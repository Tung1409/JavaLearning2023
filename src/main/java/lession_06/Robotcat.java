package main.java.lession_06;

public class Robotcat {

    private String name;
    private Integer year;
    private String color;

    public Robotcat() {
    }

    public Robotcat(String name, Integer year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Robotcat{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
