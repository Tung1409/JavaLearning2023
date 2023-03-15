package main.java.lession_10_1;

import lession_10.ChildSamePackage;
import lession_10.ParentClass;

public class NormalUnrealatedClass {

    public void doSth(){
        ChildSamePackage childSamePackage = new ChildSamePackage();
        childSamePackage.doSth();
    }
}
