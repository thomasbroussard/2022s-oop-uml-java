package fr.epita.quiz.services.data.dao;

import fr.epita.quiz.datamodel.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDBDAO {



    public void create(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz-manager-db", "postgres","postgres");
        String createTableQuery = "CREATE TABLE IF NOT EXISTS STUDENTS( id varchar(30), name varchar(255))";
        connection.prepareStatement(createTableQuery).execute();
        String insertQuery = "INSERT INTO STUDENTS(id, name) values (?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setString(1, student.getId());
        ps.setString(2, student.getName());
        ps.execute();
        connection.close();
    }

    public List<Student> readAll() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/northwind", "postgres","postgres");

        String sqlQuery = "select (id, name) from customers";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<Student> students = new ArrayList<>();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String id = resultSet.getString("id");;
            students.add(new Student(id, name));
        }

        return students;
    }
}
