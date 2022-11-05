
import java.util.*;
import java.lang.*;
public class App {
    public static void main(String[] args) throws Exception {
        for (int x = 0; x < 5; x++) {
            survey.answers[x] = new ArrayList<Integer>();
        }

        String q = "'s important level for me is ";
        int temp;
        Character e = 'y';
        do {
            System.out.println("You can rate every question 1-10");
            Scanner sc = new Scanner(System.in);
            Scanner esc = new Scanner(System.in);
            for(int count = 0; count < 5; count++){
                System.out.print(survey.questions[count] + q);

                do {
                    temp = sc.nextInt();
                } while (temp<0 || temp>10);
                survey.answers[count].add(temp);
                }
                
            System.out.println("To re-do survey press y, otherwise press any key to exit");
            e = esc.next().charAt(0); 
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        
             
        } while (e.equals('y')|| e.equals('Y'));
        
        double av[] = new double[5];
        av = survey.getAvarage(survey.answers);

       
        
        survey.printArr(av);
        System.out.println();
        survey.highest(av);
        survey.lowest(av);
   
    }
}

