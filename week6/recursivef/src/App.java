import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
public class App {
    public static int Fact(int n){
        if (n <= 1)
            return 1;
        else
            return n * Fact(n-1);
    }
    
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        int x,y;
        x = 3;
        y = Fact(x);
        System.out.println(y);*/
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter newDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(newDate);
        System.out.println("date format as dd-mm-yy: " + formattedDate);
    }
}
