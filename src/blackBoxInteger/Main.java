package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<BlackBoxInt> classs = BlackBoxInt.class; // get the class
        Constructor<BlackBoxInt> constructor = classs.getDeclaredConstructor(); // get the class constructor
        constructor.setAccessible(true); // make constructor accessible
        BlackBoxInt blackBoxInt = constructor.newInstance(); // instantiate the class/used constructor to create blackbox

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Field hiddenValue = classs.getDeclaredField("innerValue"); // get the private field innerValue;
        hiddenValue.setAccessible(true); // make the field accessible


        while(!"END".equals(command)) {
            String[] tokens = command.split("_");
            String methodName = tokens[0];
            int parameter = Integer.parseInt(tokens[1]);

            Method method = classs.getDeclaredMethod(methodName, int.class); // get the method equivalent to the command
            method.setAccessible(true); // make it accessible
            method.invoke(blackBoxInt, parameter); // call the method on blackbox (with a parameter)

            System.out.println(hiddenValue.get(blackBoxInt)); // print the value in the blackbox
            command = scanner.nextLine();
        }
    }
}
