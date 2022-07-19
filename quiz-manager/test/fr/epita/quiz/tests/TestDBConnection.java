package fr.epita.quiz.tests;

import java.sql.*;

public class TestDBConnection {

    public static void main(String[] args) throws SQLException {
       // testSimpleConnectionAndSelect();

        // when
        /*?currentSchema=public to be appended to the connection url to specify the schema*/
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz-manager-db", "postgres","postgres");



        String createTableQuery = "CREATE TABLE STUDENTS( id varchar(30), name varchar(255))";

        connection.prepareStatement(createTableQuery).execute();

        String insertQuery = "INSERT INTO STUDENTS(id, name) values ('thomas@epita.fr', 'thomas')";

        connection.prepareStatement(insertQuery).execute();
        connection.close();

    }

    private static void testSimpleConnectionAndSelect() throws SQLException {
        //given


        // when
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/northwind", "postgres","postgres");
        String schema = connection.getSchema();
        System.out.println(schema);

        String sqlQuery = "select * from customers";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getString("customer_id"));
        }

        //then

        //cleanup
        connection.close();
    }
}
