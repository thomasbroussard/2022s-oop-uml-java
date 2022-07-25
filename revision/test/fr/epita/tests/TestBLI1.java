package fr.epita.tests;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerBLService;
import fr.epita.titanic.services.data.PassengerCSVDAO;

import java.util.List;
import java.util.Map;

public class TestBLI1 {

    public static void test() {
        PassengerCSVDAO dao = new PassengerCSVDAO();
        List<Passenger> passengers = dao.readAll();
        PassengerBLService service = new PassengerBLService();
        Map<String, Double> ageDistribution = service.calculateAgeDistribution(passengers);
        System.out.println(ageDistribution);
    }


}
