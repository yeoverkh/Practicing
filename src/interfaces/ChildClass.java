package interfaces;

public class ChildClass implements InterfaceTest {

    @Override
    public void defaultMethod() {
        InterfaceTest.super.defaultMethod();
        System.out.println("has been overridden");
    }

    @Override
    public void method() {
    }
}
