import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
public class Utilities {
    public static int GetIntegerFormConsole(Scanner scanner, String massage){
        System.out.print(massage);
        while (!scanner.hasNextInt()){
            System.out.print("Некоректный ввод!\nВведите целое число:");
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static float GetFloatFormConsole(Scanner scanner, String massage){
        System.out.print(massage);
        while (!scanner.hasNextInt()){
            System.out.print("Некоректный ввод!\nВведите число:");
            scanner.next();
        }

        return scanner.nextFloat();
    }
}
