package fr.epita.quiz.tests;

import fr.epita.quiz.datamodel.Student;
import fr.epita.quiz.services.data.StudentCSVDAO;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class TestCsvFiles {

    public static void main(String[] args) throws IOException {
        //testCsvWritingToFileThenReadingAsArray();
        //testCsvWritingToFileThenReadingAsStudentInstance();


    }



    private static void testDAO() throws IOException {
        //given
        Student student = new Student("charbel@epita.fr", "charbel");
        StudentCSVDAO dao = new StudentCSVDAO();

        dao.create(student);

        List<Student> students = dao.readAll();

        if (student.getId().equals(students.get(0).getId())){
            System.out.println("success");
        } else{
            System.out.println("error" + students.get(0));
        }


    }
    private static void testCsvWritingToFileThenReadingAsStudentInstance() throws IOException {
        // given some context data
        String expectedName = "thomas";
        String providedTextToWrite = expectedName + ";thomas@epita.fr"; //thomas;thomas@epita.fr
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
        String[] lineParts = line.split(";");
        String linePart = lineParts[0];

        Student student = new Student(lineParts[1], lineParts[0]);

        if (expectedName.equals(student.getName())){
            System.out.println("success");
        } else {
            System.out.println("failure, expected: "+ providedTextToWrite + " got: " +line);
        }

        // cleanup
        file.delete();
    }

    private static void testCsvWritingToFileThenReadingAsArray() throws IOException {
        // given some context data
        String name = "thomas";
        String providedTextToWrite = name + ";thomas@epita.fr";
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
        String[] lineParts = line.split(";");
        String linePart = lineParts[0];
        System.out.println(linePart);

        if (name.equals(lineParts[0])){
            System.out.println("success");
        } else {
            System.out.println("failure, expected: "+ providedTextToWrite + " got: " +line);
        }

        // cleanup
        file.delete();
    }
}
