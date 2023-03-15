package main.java.lession_10;

public class NormalUnrealatedClass {

    public void doSth(){
        ParentClass childSamePackage = new ChildSamePackage();
        childSamePackage.fromParent();
    }
}
