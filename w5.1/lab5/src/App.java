import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int espace = 0;
            int temp;
            int index = 0;
            int countSize = 0;
            do{
            for(String s :  survey.Questions){
                System.out.println(s);
                temp = sc.nextInt();
                survey.arl.add(index, temp);
                index++;
                
                
            }
            countSize++;
            espace = sc.nextInt();
   }while(espace != -1);
            survey.printInfo(countSize);
        }
    }
}
