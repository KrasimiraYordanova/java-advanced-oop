package Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // Class<Reflection> clazz = Reflection.class;

        // System.out.println(clazz);
        // // System.out.println(clazz.getTypeName());
        // // System.out.println(clazz.getSimpleName());
        // // System.out.println(clazz.getSuperclass().getSimpleName());
        // System.out.println(clazz.getSuperclass());

        // Class<?>[] interfaces = clazz.getInterfaces();
        //for (Class<?> anInterface : interfaces) {
            // // System.out.println(anInterface.getSimpleName());
            // System.out.println(anInterface);
        // }

        // // Reflection reflection = new Reflection

        // // constructors
        // Constructor<?> declaredConstructors = clazz.getDeclaredConstructor();
        // Field[] declaredFields = clazz.getDeclaredFields();
        // Method[] declaredMethods = clazz.getDeclaredMethods();

        // // fields
        // Field webAddress = clazz.getDeclaredField("webAddress");
        // webAddress.setAccessible(true);
        // // why can't wa directly say to that field to be set to the given value?
        // // - Because those are only mata data.
        // // - The field object is just mata data for the field I have in the reflection class. It cannot hold the value of the field in itself.
        // // - And also the field can be instantiated. Who hold the information about the value of the field? In our case is the Reflection class
        // // webAddress.set("pesho@gmail.com");

        // // methods
        // // we can call them with their parameters and their(methods) characteristics like, param types, types of arguments of the methods
        // // the return type and we can call the method with method.invoke(null; "args"); "null" for static methods
        // Method method = clazz.getMethod("getName");

        // Constructor<Reflection> constructor = clazz.getConstructor();
        // Reflection reflection = constructor.newInstance();
        // System.out.println(reflection);

        // // for this field of the instance of the Reflection class I want to set the given value
        // webAddress.set(reflection, "pesho@gmail.com");
        // // getting the field of the instance reflection
        // webAddress.get(reflection);
        // System.out.println(reflection);

        // getters and setters
        Class<Reflection> clazz2 = Reflection.class;

        Method[] methods = clazz2.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(m->!m.getName().equals("toString"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(formatMethodInfo(m)));
    }

    public static String formatMethodInfo(Method method) {
        if(method.getName().startsWith("get")) {
            return String.format("%s will return class %s", method.getName(), method.getReturnType().getName());
        }
        return String.format("%s and will set field of class %s", method.getName(), method.getParameterTypes()[0].getName());
    }
}
