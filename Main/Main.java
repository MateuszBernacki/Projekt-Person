package Main;
//2. Utwórz klasę Person posiadającą pola name, surname, age.
//        a. Utwórz konstruktor bezparametrowy.
//        b. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia
//        klasy Person.
//        c. Dodaj metodę introduce wyświetlającą na konsoli imię oraz nazwisko osoby.
//        d. Utwórz klasę Address. Dodaj do klasy pola street, city, country, flatNo, homeNo.
//        e. Utwórz konstruktor przyjmujący wszystkie możliwe parametry do ustawienia
//        klasy Address (street, city, country, flatNo, homeNo)
//        f. Rozbuduj klasę Person tak aby przechowywała klasę Address.
//        g. Utwórz nowy konstruktor przyjmujący wszystkie możliwe parametry do
//        ustawienia klasy Person (name, surname, age oraz Address)
//        h. Utwórz metody umożliwiające ustawienie każdego parametru/pola klasy Person
//        i. Utwórz metody umożliwiające ustawienie każdego parametry/pola klasy Address
//        j. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Person
//        k. Utwórz metody umożliwiające pobranie każdego parametru/pola klasy Address
//        W programie głównym, w metodzie main stwórz listę przechowujące obiekty Person.
//        Stwórz 3 obiekty Person (person1, person2, person3) i dodaj do listy.
//        Stwórz metodę wyświetlającą wszystkie osoby z listy ze wszystkimi danymi łącznie z adresami

import Main.Person.Person;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();

        Person person1 = new Person("Marek", "Nowak", 32, "Nowa", "Kraków", "PL", 4, 52);
        Person person2 = new Person("Grażyna", "Pietruszka", 34,"Sliczna","Olsztyn", "PL", 6,23);
        Person person3 = new Person("Kalina", "Gołąbska", 85, "Kwiatowa", "Warszawa", "PL", 2, 51);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for (Person person :
                persons) {
            System.out.println(person);
        }

    }
}

