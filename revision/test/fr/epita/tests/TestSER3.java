package fr.epita.tests;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.data.PassengerCSVDAO;

import java.util.List;

public class TestSER3 {

    public static void test(){
        PassengerCSVDAO passengerCSVDAO = new PassengerCSVDAO();
        List<Passenger> passengers = passengerCSVDAO.readAll();
        passengerCSVDAO.writeAll(passengers);
    }
}
