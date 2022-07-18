package fr.epita.quiz.launcher;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        // authentication, it returns a boolean, true if the authentication succeeded
        Scanner scanner = new Scanner(System.in);
        Properties properties = getProperties();
        if (properties == null) return;

        String defaultUserName = properties.getProperty("userName");
        String defaultPassword = properties.getProperty("password");

        System.out.println("Welcome, please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("please enter your password: ");
        String password = scanner.nextLine();

        boolean authenticated = userName.equals(defaultUserName)
                && password.equals(defaultPassword);

        if (!authenticated) {
            // we leave
            System.out.println("not authenticated, bye!");
            scanner.close();
            //TODO check how to close the properties file
            return;
        }

        System.out.println("credentials ok, welcome!");

        String userResponse = "";
        while (!"q".equals(userResponse)) {
            System.out.println("What operation would you like to do?");
            System.out.println("c. create a student?");
            System.out.println("u. update a student?");
            System.out.println("d. delete a student?");
            System.out.println("q. quit");
            System.out.println("type your choice (c|u|d|q)");

            userResponse = scanner.nextLine();
            switch (userResponse) {
                case "c":
                    //create
                    break;
                case "u":
                    //update
                    break;
                case "d":
                    //delete
                    break;
                case "q":
                    //quit
                    break;
                default:
                    System.out.println("invalid option, retry");
                    break;
            }
        }


    }

    //TODO how to deal with resources in that method?
    private static Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./quiz-manager/credentials.properties"));
        } catch (IOException e) {
            System.out.println("Sorry, the program is not finding the required files, check your setup " +
                    "(authentication is not possible)");
            return null;
        }
        return properties;
    }
}
