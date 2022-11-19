package Interfaces;

public interface DefaultInterface {
    void sayGoodbye();
    default void sayHello() {
        System.out.println("Hello!!");
    }

    static void BOOO() {
        System.out.println("Scary!");
    }
}
