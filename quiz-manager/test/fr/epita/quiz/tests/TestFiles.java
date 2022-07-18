package fr.epita.quiz.tests;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class TestFiles {

    public static void main(String[] args) throws IOException {
        // given some context data
        String providedTextToWrite = "some text to write";
        File file  = new File("./quiz-manager/test/test.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        PrintWriter pw = new PrintWriter(outputStream);


        // when we perform some action
        pw.println(providedTextToWrite);
        pw.flush();
        pw.close();


        // then we check if the result is as expected
        List<String> lines = Files.readAllLines(file.toPath());
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
