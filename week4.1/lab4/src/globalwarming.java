import java.util.*;
public class globalwarming {
    
    
  
    
    static int score = 0;

    static String question1 = "soru 1";
    static String question2 = "soru 2";
    static String question3 = "soru 3";
    static String question4 = "soru 4";
    static String question5 = "soru 5";

    static String options = "A B C D";

    public static void check(int questionNum, int answer){ 
        int[] answers = {1,2,3,4,1};
        if(answers[questionNum-1] == answer){
            score++;
        }
    }
    public static int charToInt(String Ans)
    {
        if(Ans.equals("A")){
            return 1;
        }
        else if(Ans.equals("B")){
            return 2;
        }
        else if(Ans.equals("C")){
            return 3;
        }
        else if(Ans.equals("D")){
            return 4;
        }
        else{
            return 0;
        }
    }
    public static void printStuation(){
        if(score==5){
            System.out.println("Mukemmel");
        }
        else if(score==4){
            System.out.println("Cok iyi");
        }
        else{
            System.out.println("Bilgilerinizi tazeleme zamani.");
        }
    
    }
}
    

