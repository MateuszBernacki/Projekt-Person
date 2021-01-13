package Main.Person;

import Main.Adress.Adress;

public class Person {

    private String name;
    private String surname;
    private int age;
    Adress adress;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public Person(String name, String surname, int age, String street, String city, String country, int flatNo, int homeNo) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        adress.setStreet(street);
        adress.setCity(city);
        adress.setCountry(country);
        adress.setFlatNo(flatNo);
        adress.setHomeNo(homeNo);
    }



    public Person() {
    }



    public static void Introduce(String name, String surname) {
        System.out.println(name + surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }
}

