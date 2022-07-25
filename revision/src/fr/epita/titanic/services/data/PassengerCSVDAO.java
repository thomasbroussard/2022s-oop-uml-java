package fr.epita.titanic.services.data;

import fr.epita.titanic.datamodel.Passenger;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PassengerCSVDAO {

    public List<Passenger> readAll(){
        List<Passenger> passengers = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(new File("revision/data.csv").toPath());
            //remove the headers
            lines.remove(0);
            for (String line : lines){
                //map the line to a passenger instance
                try {
                    String[] parts = line.split(";");
                    String name = parts[0].trim();
                    String pClass = parts[1].trim();
                    Double age = Double.parseDouble(parts[2].trim());
                    String sex = parts[3].trim();
                    Boolean survived = Boolean.parseBoolean(parts[4].trim());
                    Passenger passenger = new Passenger(name, pClass, age, sex, survived);
                    passengers.add(passenger);
                }catch (Exception e){
                    System.out.println("there was an exception ("+e.getMessage() +") while reading the following line:");
                    System.out.println(line);
                    System.out.println();
                }
            }
        }catch (Exception e){
            System.out.println("there was an error while reading from the file");
            e.printStackTrace();
        }
        Collections.sort(passengers, new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                return o2.getAge().compareTo(o1.getAge());
            }
        });
        return passengers;
    }


    public void writeAll(List<Passenger> passengers){
        File outputFile = new File("revision/data_output.csv");
        try (PrintWriter writer = new PrintWriter(outputFile)){

            //remove the headers
            for (Passenger passenger : passengers){
                //map the line to a passenger instance
                    //PClass    ;Name  ;Sex ;Age   ;Survived
                    String result = passenger.getPassengerClass() + ";"
                            + passenger.getName() + ";"
                            + passenger.getSex() + ";"
                            + passenger.getAge() + ";"
                            + passenger.getSurvived();

                    writer.println(result);
            }
        }catch (Exception e){
            System.out.println("there was an error while writing to the file");
            e.printStackTrace();
        }
    }


}
