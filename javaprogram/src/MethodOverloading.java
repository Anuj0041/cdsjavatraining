import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter the today earning and expense");
        Scanner scanner = new Scanner(System.in);
        int earning = Integer.parseInt(scanner.next());
        int expense = scanner.nextInt();
        int saving = todaySavings(earning,expense);
        System.out.println("Saving is: "+ saving);


    }

    private static int todaySavings(int earning, int expense) {
      }
}
