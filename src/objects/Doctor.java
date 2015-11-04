package objects;

/**
 * Created by Наиль on 29.10.2015.
 */
    public class Doctor implements Unit {

    private String name;
    private int health;
    private int damage;
    private int speed;

    private boolean addOrReduce = false;

    //Конструктор
    public Doctor(String name, int health) {
        this.name = name;
        this.health = health;
    }

    //СетерыГетеры
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public int getSpeed() {
        return 0;
    }
    @Override
    public void setSpeed(int speed) {

    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public void setDamage(int damage) {

    }

    //Методы
    //Умею добавлять здоровье. Своим тоже.
    @Override
    public void addHealth(int num, Unit unit) {
        int newHealth = unit.getHealth() + num;
        unit.setHealth(newHealth);
    }

    //Умею отнимать здоровье. У своих тоже.
    @Override
    public void reduceHealth(int num, Unit unit) {
        int newHealth = unit.getHealth() - num;
        unit.setHealth(newHealth);
    }

    @Override
    public void reduceSpeed(int num, Unit unit) {

    }

    @Override
    public void damage(int num, Unit unit) {

    }
}
