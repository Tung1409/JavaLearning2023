package main.java.lession_10_1;

import lession_10.ParentClass;

public class ChildSamePackage extends ParentClass {

    @Override
    protected void fromParent() {
        super.fromParent();
    }

    public void doSth() {
        fromParent();
    }
}


// access modifier cua thang con phai lon hon thang cha, it nhat la phai bang
// theo thu tu private < default < protected < public