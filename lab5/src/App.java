
import java.util.*;
import java.lang.*;
public class App {
    public static void main(String[] args) throws Exception {
        for (int x = 0; x < 5; x++) {
            survey.answers[x] = new ArrayList<Integer>();
        }
        
        int temp;
        Character e = 'y';
        do {
            System.out.println("You can rate every question 1-10");
            Scanner sc = new Scanner(System.in);
            Scanner esc = new Scanner(System.in);
            for(int count = 0; count < 5; count++){
                System.out.println(survey.questions[count]);

                do {
                    temp = sc.nextInt();
                } while (temp<0 || temp>10);
                survey.answers[count].add(temp);
                }
                
            System.out.println("For ....,press y");
            e = esc.next().charAt(0);         
             
        } while (e.equals('y')|| e.equals('Y'));
        
        double av[] = new double[5];
        av = survey.getAvarage(survey.answers);

        //print in table
        survey.printArr(av);
        System.out.println("highest: " + survey.highest(av));
        System.out.println("lowest: " + survey.lowest(av));
        
       
    

        
        

        

        
        
    }
}

