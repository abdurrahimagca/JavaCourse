
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        for (int x = 0; x < 5; x++) {
            survey.answers[x] = new ArrayList<Integer>();
        }
        
        int temp, esc=0;
        do {
            Scanner sc = new Scanner(System.in);
            for(int count = 0; count < 5; count++){
                System.out.println(survey.questions[count]);
                temp = sc.nextInt();
                survey.answers[count].add(temp);
                }
            System.out.println("For exit,press -1");
            esc = sc.nextInt();    
            
        } while (esc!=-1);
        
        double av[] = new double[5];
        av = survey.getAvarage(survey.answers);
        for(double i : av){
            System.out.println(i);
        }
        survey.printHighLowest(av);

        //print in table
        

        

        
        
    }
}

