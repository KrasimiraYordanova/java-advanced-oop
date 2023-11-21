package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Class<RichSoilLand> classs = RichSoilLand.class;
		Field[] fields = classs.getDeclaredFields();

		// Consumer?
		Consumer<Field> printer = field -> System.out.printf(String.format(
				"%s %s %s%n",
				Modifier.toString(field.getModifiers()),
				field.getType().getSimpleName(),
				field.getName() ));

		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		while(!"HARVEST".equals(command)) {
			if(command.equals("public")){
				Arrays.stream(fields)
						.filter(field -> Modifier.isPublic(field.getModifiers()))
						.forEach(printer);
			} else if(command.equals("private")) {
				Arrays.stream(fields)
						.filter(field -> Modifier.isPrivate(field.getModifiers()))
						.forEach(printer);
			} else if(command.equals("protected")) {
				Arrays.stream(fields)
						.filter(field -> Modifier.isProtected(field.getModifiers()))
						.forEach(printer);
			} else if (command.equals("all")) {
				Arrays.stream(fields)
						.forEach(printer);
			}


			command = scanner.nextLine();
		}
	}
}
