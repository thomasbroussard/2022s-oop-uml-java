package fr.epita.geometry.launchers;

import fr.epita.geometry.datamodel.Circle;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LauncherWithUserInteraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the radius of the circle");
        double radius;
        try {
           radius = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            scanner.close();
            return;
        }

        Circle circle = new Circle(radius);
        System.out.println(circle);

        scanner.close();
    }

    private static void regexMatch(String line) {
        String regexForIntegers = "[0-9]+";
        boolean matches = Pattern.compile(regexForIntegers)
                .matcher(line)
                .matches();
    }
}
