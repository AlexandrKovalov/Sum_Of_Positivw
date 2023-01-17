import java.util.Random;

public class ArrayUtils {
    static Random random = new Random();
    public static int [] arrayInit (int [] a) {   //create a method for initialize an array of random numbers from -100 to 100
        for (int i = 0; i < a.length ; i++) {
            a[i] = random.nextInt(200) - 100;
        }
        return a;
    }
    public static void arrayOut (int [] a) {     //create a method for outputting an array to the console
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
