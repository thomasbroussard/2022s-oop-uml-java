package fr.epita.quiz.services.data;

import fr.epita.quiz.datamodel.Student;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class StudentCSVDAO {

    private File file =  new File("./quiz-manager/test/students.csv");


    public void create(Student student) throws FileNotFoundException {

        FileOutputStream outputStream = new FileOutputStream(file);
        PrintWriter pw = new PrintWriter(outputStream);

        String line = student.getName() + ";" + student.getId();

        pw.println(line);
        pw.flush();
        pw.close();
    }


    public List<Student> readAll() throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        List<Student> students = new ArrayList<>();
        for (String line : lines) {
            String[] lineParts = line.split(";");
            String linePart = lineParts[0];

            Student student = new Student(lineParts[1], lineParts[0]);
            students.add(student);
        }
        return students;
    }

}
