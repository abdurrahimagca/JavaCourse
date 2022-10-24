import java.util.*;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        final double interestRate = 5/100;
        for(double i = 1; i < 11; i++)
        {
            double temp = money * Math.pow(1 + interestRate, i);
            System.out.println(i + ". yilda tutar: " + temp);
        } 
        
    }

}
