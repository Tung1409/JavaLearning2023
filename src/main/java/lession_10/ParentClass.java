package main.java.lession_10;

public class ParentClass {

    protected void fromParent(){
        System.out.println("FromParent");
    }

    public void doSth(){
         fromParent();
    }
}
