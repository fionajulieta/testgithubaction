package done;

import java.util.Random;

public class randomnumber {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1; /* will generate with max 6 values between 0-5,
        we add +1 to make the random number show number between 1-6*/
        System.out.println(x);

        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println(y);
        System.out.println(z);

    }
}
