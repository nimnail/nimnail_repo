package objects;

/**
 * Created by Наиль on 29.10.2015.
 */

/**
 * Есть войска(Unit).
 Войска будут разные: лучники, доктор и пехотинец
 У каждого из них будут следующие поля:
 Health, Damage, Speed
 Каждый из них будет уметь делать разные вещи

 Доктор например добавлять здоровья своим:
 то есть метод прибавитьHealth и уменьшитьHealth
 Лучник уменьшать скорость у врагов
 Пехотинец отнимать урон вргам

 Но и все они будут уметь делать одинаковые вещи, например:
 Отнимать здоровье у врага
 Добавлять урон своему другу, но при этом уменьшая свой урон .
 */
public interface Unit {

    String getName();

    int getHealth();
    void setHealth(int health);

    int getSpeed();
    void setSpeed(int speed);

    int getDamage();
    void setDamage(int damage);

    void addHealth(int num, Unit unit);
    void reduceHealth(int num, Unit unit);
    void reduceSpeed(int num, Unit unit);
    void damage(int num, Unit unit);

}
