import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int buf = 10000;
      int i = 0;
      
      while(i != 5)
      {
        System.out.printf(num/buf+" ");
        num = num % buf;
        buf = buf/10;
        i++;
      }

    }
}
