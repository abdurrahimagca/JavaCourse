import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(globalwarming.question1);
        System.out.println(globalwarming.options);
        String tempAnswers = sc.nextLine();

        globalwarming.check(1,globalwarming.charToInt(tempAnswers));
        System.out.println(globalwarming.question2);
        System.out.println(globalwarming.options);

        tempAnswers = sc.nextLine();        
        globalwarming.check(2,globalwarming.charToInt(tempAnswers));
        System.out.println(globalwarming.question3);
        System.out.println(globalwarming.options);
        tempAnswers = sc.nextLine();        
        globalwarming.check(3,globalwarming.charToInt(tempAnswers));
        System.out.println(globalwarming.question4);
        System.out.println(globalwarming.options);
        tempAnswers = sc.nextLine();        
        globalwarming.check(4,globalwarming.charToInt(tempAnswers));
        System.out.println(globalwarming.question5);
        System.out.println(globalwarming.options);
        tempAnswers = sc.nextLine();        
        globalwarming.check(5,globalwarming.charToInt(tempAnswers));

        System.out.println(globalwarming.score);

        globalwarming.printStuation();

        

    }
}
