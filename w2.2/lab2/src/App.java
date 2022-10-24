import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class App {
    public static void main(String[] args) throws Exception { 
        Scanner sc = new Scanner(System.in);
        System.out.print("kilonuzu yaziniz: ");
        float weight = sc.nextFloat();
        System.out.print("\nboyunuzu metre olarak yaziniz: ");
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.print("\n kitle indeksi " + BMI);

        if( BMI < 18.5)
        {
            System.out.print(" zayif");
        }
        else if( BMI>18.6F && BMI<25)
        {
            System.out.print(" normal");
        }
        else if( BMI>24.9F && BMI<29.9F)
        {
            System.out.print(" sisman");
        }
        else
        System.out.print(" obez");
    }
}
