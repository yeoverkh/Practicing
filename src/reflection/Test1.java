package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        Person p1 = new Person("Max", "Chloe");
        System.out.println(p1);
        Class c1 = p1.getClass();
//        System.out.println(c1.getName());
//
//        Method[] methods = c1.getDeclaredMethods();
//        Arrays.stream(methods).forEach(m -> System.out.println(m.getName()));
//
//        Constructor[] constructors = c1.getDeclaredConstructors();
//        Arrays.stream(constructors).forEach(c -> System.out.println(c.getName() + " " + Arrays.toString(c.getParameterTypes())));

        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
            field.setAccessible(true);
            try {
                field.set(p1, "Not max or chloe");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            field.setAccessible(false);
        }

        System.out.println(p1.getName());

    }
}
