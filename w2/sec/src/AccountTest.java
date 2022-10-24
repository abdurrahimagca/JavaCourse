
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) throws Exception {
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        Account myAccount = new Account();

        System.out.println("Adiniz" + name.getName());
    }
}
