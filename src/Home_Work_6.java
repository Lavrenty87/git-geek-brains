/*
 *Java 1 Home Work 5 ООП
 * @author Gaponov Lavrenty
 * @version Date 01.10.2018
 */

public class Home_Work_6 {
    public static void main(String[] agrs){
        IAnimals[] animals = {new Cat1("Vasa", 5),
                new Dog("Frend", 3), new Cat1("Barsik", 6)};
        for(IAnimals animal : animals)
            System.out.println(animal + " Прыжки " + animal.jump(0.5)+ " Плаванье "
                    + animal.swim(5)+ " Бег " + animal.run(5));
        }
    }

class Cat1 extends Animals {
    Cat1(String name, int age) {
        super(name, age);
    }
    public boolean run(int dist_run) {
        if (dist_run <= 200) return true;
        return false;
    }
    public boolean swim(int dist_swim){
        if (dist_swim == 0) return true;
        return false;
    }
    public boolean jump(double h){
        if (h <= 2)return true;
        return false;
    }
}

class Dog extends Animals {
        Dog(String name, int age) {
            super(name, age);
        }
    public boolean run(int dist_run){
        if (dist_run <= 500) return true;
        return false;
    }
    public boolean swim(int dist_swim){
        if (dist_swim <= 10) return true;
        return false;
    }
    public boolean jump(double h){
        if (h <= 0.5) return true;
        return false;
    }
}

interface IAnimals{
    boolean run(int dist_run);
    boolean swim(int dist_swim);
    boolean jump(double h);
}

  abstract class Animals implements IAnimals {
    protected String name;
    protected int age;
    Animals(String name, int age ) {
        this.name = name;
        this.age = age;
  }
    public String toString() {
        return getClass().getName()+ "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

