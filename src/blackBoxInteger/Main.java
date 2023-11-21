package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<BlackBoxInt> classs = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = classs.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Field hiddenValue = classs.getDeclaredField("innerValue");
        hiddenValue.setAccessible(true);


        while(!"END".equals(command)) {
            String[] tokens = command.split("_");
            String methodName = tokens[0];
            int parameter = Integer.parseInt(tokens[1]);

            Method method = classs.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, parameter);

            System.out.println(hiddenValue.get(blackBoxInt));
            command = scanner.nextLine();
        }
    }
}
