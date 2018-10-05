
import java.util.Scanner;

/**
 * Java. Level 1. Lesson 7
 *
 * @author Sergey Iryupin
 * @version dated Oct 01, 2018
 */
class HomeWork_7 {
    public static void main(String[] args) {
     //  Cat cat = new Cat("Barsik", 10);
       // Cat cat1 = new Cat("Barsuk", 5);
        Cat[] catArry = {new Cat("Barsik", 10), new Cat("Vasa", 5),
                new Cat("Vova", 6),new Cat("Gena", 7)};
        Plate plate = new Plate(12);
        System.out.println(plate);
      for(int i = 0; i < catArry.length; i++) {
          catArry[i].eat(plate);
          System.out.println("Кот--" + catArry[i].getName() + "--сыт: " + catArry[i].getFull());
          System.out.println("\n-------------------------\n");
          //System.out.println(catArry[i]);
          System.out.println(plate);
      }
    }
}

class Cat {
    protected String name;
    protected int appetite;
    public boolean full = false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
    String getName()
    {
        return this.name;
    }
    boolean getFull()
    {
        return this.full;
    }

    void eat(Plate plate) {
       this.full = plate.dicreaseFood(appetite);
    }

   @Override
    public String toString() {
       return "Cat{" +
               "name='" + name + '\'' +
               ", appetite=" + appetite +
               ", full=" + full +
               '}';
   }
}
class Plate {
    private int food;
    private boolean full;

    Plate(int food) {
        this.food = food;
    }

    boolean dicreaseFood(int food) {
        if (this.food < food) {
            getPlatefood();
        }
        else if (this.food >= food) {
                this.food -= food;
                this.full = true;
                return this.full;
            }

        return full;
    }
    boolean getFull()
    {
        return this.full;
    }
    int getfood()
    {
        return this.food;
    }

    int getPlatefood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавить еды в тарелку? 1-да, 2-нет");
        int getPlateFood = scanner.nextInt();
        if (getPlateFood == 1) {

            this.food = this.food + 10;
        } else {
            return this.food;
        }
        return this.food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }

}



