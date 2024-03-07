import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;

public class first_project {

    public static void main(String[] args) {


        int[] bob = {1, -4, 4, -28, 3};
        int max  = 0;
        for (int i = 0; i < bob.length; i++) {
            if(bob[i] > max) {
                max = bob[i];
            }

        }
        System.out.println(max);

    }
}
