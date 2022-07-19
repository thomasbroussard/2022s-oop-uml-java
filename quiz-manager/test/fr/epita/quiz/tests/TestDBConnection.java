package fr.epita.quiz.tests;

import java.sql.*;

public class TestDBConnection {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/northwind", "postgres","postgres");
        String schema = connection.getSchema();
        System.out.println(schema);

        String sqlQuery = "select * from customers";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getString("customer_id"));
        }

        connection.close();


    }
}
