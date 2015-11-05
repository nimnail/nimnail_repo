package objects;

/**
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection<Unit> listUnit
 уровень(LEVEL) горнизона
 метод добавления Unit
 удаления из горнизона Unit
 повысить уровень
 понизить уровень горнизона
 */
public class Barracks {

    private int level;
    public Collection<Unit> listUnit = new ArrayList<Unit>();

    //СетерыГетеры
    public Collection<Unit> getListUnit() {
        return listUnit;
    }
    public void setListUnit(Collection<Unit> listUnit) {
        this.listUnit = listUnit;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    //Методы
    public void addUnit(Unit unit){
            listUnit.add(unit);
    }

    public void printAllBarracks(){
        for (Unit tempUnit : listUnit) {
            System.out.println(tempUnit.getName());
        }
    }

    public void removeUnit(Unit unit){
        listUnit.remove(unit);
    }

    public void upLevel(int upLevel){
        this.level = this.level + upLevel;
    }

    public void lowLevel(int lowLevel){
        this.level = this.level - lowLevel;
    }

}

