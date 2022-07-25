package fr.epita.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TestSER1 {

    public static void test() throws IOException {
        //one liner solution to read all the lines from the file
        List<String> lines = Files.readAllLines(new File("revision/data.csv").toPath());
        //remove the headers
        lines.remove(0);

        //display the second line
        System.out.println(lines.get(0));
    }

}
