package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz);
        // System.out.println(clazz.getTypeName());
        // System.out.println(clazz.getSimpleName());
        // System.out.println(clazz.getSuperclass().getSimpleName());
        System.out.println(clazz.getSuperclass());

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            // System.out.println(anInterface.getSimpleName());
            System.out.println(anInterface);
        }

        // Reflection reflection = new Reflection

        Constructor<Reflection> constructor = clazz.getConstructor();
        Reflection reflection = constructor.newInstance();
        System.out.println(reflection);
    }
}
