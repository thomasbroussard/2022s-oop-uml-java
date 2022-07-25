package fr.epita.tests;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.data.PassengerJDBCDAO;

public class TestJDB1 {

    public void test(){
        PassengerJDBCDAO passengerJDBCDAO = new PassengerJDBCDAO();
        passengerJDBCDAO.search(new Passenger("Allen", null, null, null, null));
    }
}
