package fr.epita.quiz.tests;

import fr.epita.quiz.datamodel.Student;
import fr.epita.quiz.services.data.dao.StudentDBDAO;

import java.sql.SQLException;
import java.util.List;

public class TestStudentDBDAO {


    public static void main(String[] args) throws SQLException {
        //given
        StudentDBDAO dao = new StudentDBDAO();
        Student referenceStudent = new Student("charbel@epita.fr", "charbel");

        //when
        dao.create(referenceStudent);

        //then
        List<Student> students = dao.readAll();
        Student foundStudent = students.get(0);
        if(referenceStudent.getId().equals(foundStudent.getId())){
            System.out.println("success");
        } else {
            System.out.println("error! expected : " + referenceStudent + " but got :" + foundStudent);
        }

        //cleanup
        dao.delete(referenceStudent);
    }
}
