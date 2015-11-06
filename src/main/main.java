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
        City city2 = new City("Чикаго");
        City city3 = new City("Вашингтон");
        City city4 = new City("Зеленоград");

        Country Russia = new Country(city, "Россия");

        Russia.addCity(city1);
        Russia.addCity(city2);
        Russia.addCity(city3);
//        Russia.addCity(city4);

//        System.out.println(city1.getMyCountry().getName());

        System.out.println(city.getGold() + " " + city.getPopulation()+ "\n" + city1.getGold() + " "
                + city1.getPopulation()+ "\n" + city2.getGold() + " "
                + city2.getPopulation()+ "\n" + city3.getGold() + " "
                + city3.getPopulation());

//        USA.addCity(city2);

//        barracks.printAllBarracks();

//        doctor.addHealth(12, archer);
//        doctor.reduceHealth(1, archer);

//        city.getBarracks().printAllBarracks();
//        System.out.println(archer.getHealth());

//        Russia.deleteCity(city2);

        Russia.showInfoCountry();
    }
}
