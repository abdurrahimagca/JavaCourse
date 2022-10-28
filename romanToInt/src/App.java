import java.util.*;
public class App {
    public static void romanToInt(String roman){
        int total = 0;
        switch(roman.charAt(0)){
            case 'I': total+= 1;
            case 'V': total+= 5;
            case 'L': total+= 50;
            case 'C': total+= 100;
            case 'D': total+= 500;
            case 'M': total+= 1000;
        }
        System.out.println(total);
        
    }
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            romanToInt(input);
        }

    }
}
