import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int digit,num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i = 0;

        while(i!=5)
        {
            digit = num%10;
            System.out.print(digit);
            num = num/10;
            i++;
        }
    }
}
