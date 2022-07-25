package fr.epita.titanic.services.data;

import fr.epita.titanic.datamodel.Passenger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerJDBCDAO {

    public void create(Passenger passenger) throws SQLException {

        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgresql"
                        , "postgres"
                        , "postgres");
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PASSENGERS(name, survived) VALUES (?,?)");
        ) {
            preparedStatement.setString(1, passenger.getName());
            preparedStatement.setBoolean(2, passenger.getSurvived());
            preparedStatement.execute();
        }


    }

    public List<Passenger> search(Passenger criteria) {
        List<Passenger> resultList = new ArrayList<>();
        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgresql"
                        , "postgres"
                        , "postgres");
        ) {
            String query = "SELECT name, survived FROM PASSENGERS" +
                    " WHERE " +
                    "     (? is null or name like ?) and (? is null or survived = ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,  criteria.getName());
            preparedStatement.setString(2, criteria.getName());
            preparedStatement.setBoolean(3, criteria.getSurvived());
            preparedStatement.setBoolean(4, criteria.getSurvived());

            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                String name = resultSet.getString("name");
                boolean survived = resultSet.getBoolean("survived");
                //Passenger passenger = new Passenger(name, survived);
                //resultList.add(passenger);
            }


        } catch (SQLException e) {

        }
        return resultList;
    }

}
