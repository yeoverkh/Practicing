package interfaces;

public interface InterfaceTest {

    default void defaultMethod() {
        System.out.println("default method is running");
    }

    int staticInt = 10;

    void method();
}
