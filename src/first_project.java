import jdk.jfr.Label;
import org.w3c.dom.ls.LSOutput;

import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
//import java.time.temporal;

public class first_project {
    public static void main(String[] args) {
//        String stranger = "Who are you?";
//        int a;
//        a = 1;
//        int b = 4;
//        int c = b - a;
//        long f = 2147483646542123214L;
//        int h = 54365464;
//        String soul = "Шарик должен сдохнуть";
//        String box = "Шарик держись";
//        if (a > c) {
//            System.out.println(soul);
//        } else if (a < c) {
//            System.out.println(box);
//        }
//        for (int z = 4; z < 0; z++) {
//            System.out.println(soul);
//
//        }
//
//        int[] array = new int[100];//{10, 20, 54, 86};
//        array[98] = 3333;
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        int a = 10;
        int b = a;
        b = 20;
        System.out.println(b);

        int[] arr1 = {4, 5};
        int[] arr2 = {9, 7};
        int[] arr3 = arr1;
        arr2[0] = 8;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));




        int[] array = {1, 4, 4, 28, 3};
        int max  = 0;
        for (int i = 0; i < array.length; i++){
        //for (int i : array) {

                max = max + array[i];
                //System.out.print(" " + array);
        }
        System.out.println(max);
        //LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }


}
