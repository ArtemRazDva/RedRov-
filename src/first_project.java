

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
