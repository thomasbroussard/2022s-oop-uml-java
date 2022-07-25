package fr.epita.tests;

import fr.epita.titanic.datamodel.Passenger;

public class TestDMO2 {


    public static void test(){
        Passenger passenger = new Passenger("Abbing, Mr Anthony"
                ,null
                ,null
                ,null
                , true);

        System.out.println(passenger);
    }

}
