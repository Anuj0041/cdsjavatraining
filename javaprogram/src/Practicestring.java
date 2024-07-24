import java.sql.SQLOutput;
import java.util.Scanner;

public class Practicestring {
    public static void main(String[] args) {
        String name = "Anuj patel";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("enter ur name");
        Scanner scanner = new Scanner(System.in);
        String sname = scanner.nextLine();
        if ("anuj patel" == sname)
        {
            System.out.println("all");

        }
        else{
            System.out.println("not");
        }

    }
}
