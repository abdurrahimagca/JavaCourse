import java.util.*;  
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter first number ");  
    int num1 = sc.nextInt(); 

    sc = new Scanner(System.in);  
    System.out.print("Enter sec number ");  
    int num2 = sc.nextInt();

    int result = num1 * num2;
    System.out.println("carpim: "+ result);

    result =  num1 - num2;
    System.out.println("fark: "+ result);

    float divide = (float) num1 / num2;
    System.out.println("bolum: "+ divide);

    result = num1 + num2;
    System.out.println("toplam: "+ result);

    }
}
