/*
 *Java 1 Home Work 2
 * @author Gaponov Lavrenty
 * @version Date 17.08.2018
 */
import java.util.Arrays;

public class HomeWork_2 {
    public static void main(String arge[]){
    // 1
        int[] binary = {1,1,0,0,1,0,1,1,1};
        System.out.println(Arrays.toString(binary));
        for (int i = 0; i < binary.length; i++){
            if (binary[i] == 0){
                binary[i] = 1;
            }else if (binary[i] == 1){
                binary[i] = 0;
            }
        }
        System.out.println(Arrays.toString(binary));
    // 2
        int[] empty = new int[8];
        for (int i = 0, j=0; i < empty.length; i++, j=j+3){
            empty[i] = j;
        }
        System.out.println(Arrays.toString(empty));
    // 3
        int[] multiplication = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiplication));
        for (int i=0; i<multiplication.length; i++){
            if (multiplication[i] < 6){
                multiplication[i] = multiplication[i]*6;
            }
        }
        System.out.println(Arrays.toString(multiplication));
    // 4
        int[][] box = new int[7][7];
        for (int i = 0; i < box.length; i++) {
             for (int j = 0; j < box[i].length; j++) {
                 if(box[j] == box[i] || (i + j == 6)){
                     box[i][j]=1;
                 }
                 System.out.print(box[i][j]);
             }
              System.out.println();
        }


    //5
        int[] max = {1, 2, 3, 4, 5, 8, 6, 5, 2,};
        System.out.println(Arrays.toString(max));
        int a = 0;
        for (int i=0; i<max.length; i++){
            max[i] = i;
            if (max[i]>a){
                a = max[i];
            }
        }
        System.out.println("Максимальное число в массиве "+ a);
    }
}

