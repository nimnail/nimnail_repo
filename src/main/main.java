package main;

import objects.*;

import java.util.Random;

/**
 *
 */
public class main {
    public static void main(String[] args){

        City city = new City("Москва");
        City city1 = new City("Зеленоград");
        City city2 = new City("Химки");
        City city3 = new City("Вашингтон");
        City city4 = new City("Чикаго");
        City city5 = new City("НьюМью");

        Country Russia = new Country(city, "Россия");
        Country USA = new Country(city3, "Вашингтон");

        Russia.addCity(city1);
        Russia.addCity(city3);

        USA.addCity(city4);
        USA.addCity(city5);

//        System.out.println(city1.getMyCountry().getName());

        System.out.println(city.getGold() + " " + city.getPopulation()+ "\n" + city1.getGold() + " "
                + city1.getPopulation()+ "\n" + city2.getGold() + " "
                + city2.getPopulation()+ "\n" + city3.getGold() + " "
                + city3.getPopulation());



//        barracks.printAllBarracks();

//        doctor.addHealth(12, archer);
//        doctor.reduceHealth(1, archer);

//        city.getBarracks().printAllBarracks();
//        System.out.println(archer.getHealth());

//        Russia.deleteCity(city2);

        Russia.showInfoCountry();
        USA.showInfoCountry();
    }
}
