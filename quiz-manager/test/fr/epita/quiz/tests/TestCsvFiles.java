package fr.epita.quiz.tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;

public class TestCsvFiles {

    public static void main(String[] args) throws IOException {
        // given some context data
        String providedTextToWrite = "thomas;thomas@epita.fr";
        File file  = new File("./quiz-manager/test/students.csv");
        FileOutputStream outputStream = new FileOutputStream(file);
        PrintWriter pw = new PrintWriter(outputStream);


        // when we perform some action
        pw.println(providedTextToWrite);
        pw.flush();
        pw.close();




        // then we check if the result is as expected
        List<String> lines = Files.readAllLines(file.toPath());
        //TODO
        //extract the different parts of the students by using the split() method

        String line = lines.get(0);

        if (providedTextToWrite.equals(line)){
            System.out.println("success");
        } else {
            System.out.println("failure, expected: "+ providedTextToWrite + " got: " +line);
        }

        // cleanup
        file.delete();
    }
}
