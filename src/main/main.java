package main;

import objects.*;

import java.util.Random;

/**
 *
 */
public class main {
    public static void main(String[] args){

//        Unit doctor = new Doctor("Доктор", 3);
//        Unit archer = new Archer("Лучник", 13);

//        Barracks barracks = new Barracks("Barracks");
//        barracks.addUnit(doctor);
//        barracks.addUnit(archer);

        City city = new City("Москва", 2111.11);
        City city1 = new City("Зеленоград", 111.12);
        City city2 = new City("Чикаго", 121.22);
        City city3 = new City("Вашингтон", 1111.11);
        City city4 = new City("Зеленоград", 111.12);
        /**
         * убери эти значения
         * сделай везде пока что 1000
         * потом уже придумаем
         * когда сделаешь юнитов
         */

        Country Russia = new Country(city, "Россия");
        Country USA = new Country(city3, "США");

        Russia.addCity(city1);
        Russia.addCity(city2);
//        Russia.addCity(city4);

        Russia.deleteCity(city4);

        System.out.println(city1.getMyCountry().getName());

        System.out.println(city.getGold() + " " + city.getPopulation()+ "\n" + city1.getGold() + " "
                + city1.getPopulation()+ "\n" + city2.getGold() + " "
                + city2.getPopulation());

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
