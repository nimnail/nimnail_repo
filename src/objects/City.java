package objects;

/**
 * Created by Наиль on 28.10.2015.
 */

import java.util.Random;

/**
 * Имеет поля:
 Название (name),население, золото, площадь

 Имеет методы:
 изменить население, изменить колл. золота изменить имя , и гет методы сам подумай какие можно сделать
 */
public class City {

    private String name;
    private int population;
    private int gold;
    private double area;
    private Barracks barracks = new Barracks();
    private Country myCountry;

    //Конструкторы
    public City() {

    }
    public City(String name) {
        this.name = name;
    }
    public City(String name, double area) {
        this.name = name;
        this.area = area;
        this.gold = getRandom();
    }

    //СетерыГетеры
    public Country getMyCountry() {
        return myCountry;
    }
    public void setMyCountry(Country myCountry) {
        this.myCountry = myCountry;
    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public int getGold() {
        return gold;
    }
    public double getArea() {
        return area;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public Barracks getBarracks() {
        return barracks;
    }

    public int getRandom(){
        Random random = new Random();
        int newGold = random.nextInt(200) + 1;
        if (newGold > 150) {
            this.population = newGold * 5;
        } else {
            this.population = newGold * 2;
        }
        return newGold;
        }

}
