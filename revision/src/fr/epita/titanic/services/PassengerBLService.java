package fr.epita.titanic.services;

import fr.epita.titanic.datamodel.Passenger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PassengerBLService {

    public Map<String, Double> calculateAgeDistribution(List<Passenger> passengers){
        int size = passengers.size();
        Map<String, Double> distribution = new LinkedHashMap<>();
        for (Passenger p : passengers){
            String ageAsString = String.valueOf(p.getAge());
            Double aDouble = distribution.get(ageAsString);
            if (aDouble == null){
                distribution.put(ageAsString, 100.0 / size);
            } else{
                distribution.put(ageAsString, aDouble + 100.0/ size);
            }
        }
        return distribution;


    }
}
