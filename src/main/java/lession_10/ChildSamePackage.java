package main.java.lession_10;

public class ChildSamePackage extends ParentClass{

    @Override
    protected void fromParent() {
        super.fromParent();
    }

    public void doSth() {
        fromParent();
    }
}


// access modifier cua thang con phai lon hon thang cha
// theo thu tu private < default < protected < public