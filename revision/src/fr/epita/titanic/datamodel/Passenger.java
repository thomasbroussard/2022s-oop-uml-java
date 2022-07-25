package fr.epita.titanic.datamodel;

public class Passenger {

    private String name;
    private String passengerClass;
    private Double age;
    private String sex;
    private Boolean survived;

    public Passenger(String name, String passengerClass, Double age, String sex, Boolean survived) {
        this.name = name;
        this.passengerClass = passengerClass;
        this.age = age;
        this.sex = sex;
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassengerClass() {
        return passengerClass;
    }

    public void setPassengerClass(String passengerClass) {
        this.passengerClass = passengerClass;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getSurvived() {
        return survived;
    }

    public void setSurvived(Boolean survived) {
        this.survived = survived;
    }

    @Override
    public String toString() {
        return "Passenger [name=" + this.name +" , survived=" + this.survived + "]";
    }
}
