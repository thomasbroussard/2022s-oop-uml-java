package fr.epita.tests;

import fr.epita.titanic.services.data.PassengerCSVDAO;

public class TestSER2 {

    public static void test(){
        PassengerCSVDAO passengerCSVDAO = new PassengerCSVDAO();
        passengerCSVDAO.readAll();
    }
}
