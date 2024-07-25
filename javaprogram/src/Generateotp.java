import java.util.Random;

public class Generateotp {
    public static void main(String[] args) {
        Random random = new Random();
        //to store the random number
        int myOTP = random.nextInt(67);
        System.out.println("your OTP is:"+myOTP);
    }
}
