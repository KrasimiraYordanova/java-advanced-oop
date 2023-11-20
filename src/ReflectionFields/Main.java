package ReflectionFields;

import javax.swing.event.MenuEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<Reflection> clazz = Reflection.class;
        Field[] fields = clazz.getDeclaredFields();

        Arrays.stream(fields).sorted(Comparator.comparing(Field::getName))
                .filter(field -> !Modifier.isPrivate(field.getModifiers()))
                .forEach(field -> System.out.println(field.getName() + " must be private!"));

        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods)
                .filter(method -> !method.getName().equals("toString"))
                .sorted(Comparator.comparing(Method::getName))
                .filter(Main::filterByType)
                .forEach(method -> System.out.println(formatPrint(method)));
    }

    private static String formatPrint(Method method) {
        String postfix = method.getName().startsWith("get") ? "public!" : "private!";
        return method.getName() + " have to be " + postfix;
    }

    private static boolean filterByType(Method method) {
        return (method.getName().startsWith("get") && !Modifier.isPublic(method.getModifiers()))
                || (method.getName().startsWith("set") && !Modifier.isPrivate(method.getModifiers()));
    }
}