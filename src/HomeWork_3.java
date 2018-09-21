/*
 *Java 1 Home Work 2
 * @author Gaponov Lavrenty
 * @version Date 21.09.2018
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что будем угадывать: числа - 1 или слова - 2? ");
        int a = scanner.nextInt();
        if (a == 1) {
            PlayLevel1(a);
        } else if (a == 2) {
            PlayLevel_2(a);
        }
    }

    private static void PlayLevel1(int play) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numbr = (int) (random.nextInt(10));
        while (play == 1) {
            System.out.println("Угадайте число от 0 до 9 c 3-х попыток ");
            for (int i = 0; i < 3; i++) {
                int input_number = scanner.nextInt();
                if (input_number == numbr && i < 3) {
                    System.out.println("Вы угадали число");
                    System.out.println("Вы выйграли!!!!. СИГРАЕ ЕЩЁ (1)");
                    play = scanner.nextInt();
                    break;
                } else if ((input_number < numbr && i == 2) || (input_number > numbr && i == 2)) {
                    System.out.println("Вы использвали все попытки GAME OVER. СИГРАЕ ЕЩЁ (1)");
                    play = scanner.nextInt();
                    break;
                } else if (input_number > numbr && i < 3) {
                    System.out.println("Загаданное число меньше!");
                } else if (input_number < numbr && i < 3) {
                    System.out.println("Загаданное число больше!");
                }
            }
        }
    }

    public static void PlayLevel_2(int a) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple"/*, "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"*/};
        int b = random.nextInt(words.length);
        String word = words[b];
        while (true) {
            System.out.println("Угадайте слово:");
            String user_word = scanner.next();
            String s = "";
            if (word != user_word) {
                char good = '#';
                int i = 0;
                int j = 0;
                for (i = 0, j = 0; i <= word.charAt(i); i++, j++){ //i <= 15; не помогло
                char z = word.charAt(i);                  // Дальше ругается на то что нет нет 6 го элемента в слове apple
                char c = user_word.charAt(j);             // Можно ли сделать чтобы он накручивал s до 15
                if (z == c){                              // и заполнял # В ЭТОМ ЦИКЛЕ ? ИЛИ ЭТО НЕ ПРАВИЛЬНЫЙ
                    s = s + z;                            // подход?
                }else {
                    s = s + good;

                }
                }
                System.out.println("Вот буквы которые вы угадали:" + s);
            } else {
                System.out.println("Вы угадали слово");

            }
        }
    }
}


