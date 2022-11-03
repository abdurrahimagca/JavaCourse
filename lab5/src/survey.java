import java.util.*;
public class survey {
    
    public static String questions[] = {"lorem", "ipsum", "sit", "amet", "consectetur"};
    //this should be private
    public static ArrayList<Integer>[] answers = new ArrayList[5];


    public static double[] getAvarage(ArrayList<Integer>[] answers){
        double total[] = new double[5];
        int counter;
        for(int i = 0; i < 5; i++){
            counter = 0;
            for(int j : answers[i]){
                total[i] += j;
                counter++;
            }
            total[i] /= counter;
        }
        return total;
    }

    public static void printHighLowest(double[] av){
        double h = av[1], l = av[1];
        for(double i : av){
            if(i > h)
                h = i;
            if(i < l)
                l = i;

        }
        System.out.println("highest is " + h);
        System.out.println("lowest is " + l);
    }

}
