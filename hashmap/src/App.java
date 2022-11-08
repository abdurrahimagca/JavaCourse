import java.util.Scanner;

public class App {

  
    public static void main(String[] args) throws Exception {
        int temp,counter = 0;
        Character e = 'y';

        do {
            System.out.println("You can rate every question 1-10");
            Scanner sc = new Scanner(System.in);
            Scanner esc = new Scanner(System.in);
            for(int count = 0; count < 5; count++){
                System.out.print(surveyhash.questions[count]);

                do {
                    temp = sc.nextInt();
                } while (temp<0 || temp>10);
                surveyhash.Survey.merge(count, temp, Integer::sum);
                }
                
            System.out.println("To re-do survey press y, otherwise press any key to exit");
            e = esc.next().charAt(0); 
            counter++;
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 
            
             
        } while (e.equals('y')|| e.equals('Y'));
        System.out.println(surveyhash.Survey);
        
        
        
    }
}
