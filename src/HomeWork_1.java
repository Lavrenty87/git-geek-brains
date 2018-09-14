/*
*Java 1 Home Work 1
* @author Gaponov Lavrenty
* @version Date 13.08.2018
 */

public class HomeWork_1 {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float i = 4.2f;
        double f = 4.5;
        char g = 'Э';
        boolean h = true;
        System.out.println(formula(4,5,4,2));
        System.out.println(really_or_not(5,6));
        true_or_false(-5);
        System.out.println(negative(5));
        name("Rostov-on-Don");
        year(2000);
    }

    private static int formula(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    private static boolean really_or_not(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20){
            return true;
        }else {
            return false;
        }
    }
    private static void true_or_false(int a){
        System.out.println((a < 0)? "Отрицательное" : "Положительное или 0");
    }
    public static boolean negative(int a){
        if (a<0){
            return true;
        }
        return false;
    }
    public static void name(String a){
        System.out.println("Hello " + a + "!!!)");
    }
    public static void year(int a){
        double x = (double) a / 4;
        double y = (double) a / 100;
        double z = (double) a /400;
        if ((x%1 == 0 && y%1 != 0) || (y%1 == 0 && z%1 == 0)){
            System.out.println("Высокосный 366 дней.");
        }else if ((x%1 != 0) || (y%1 == 0 && z%1 != 0)){
            System.out.println("Обычный 365 дней.");

        }
    }
}
