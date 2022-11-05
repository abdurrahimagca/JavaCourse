import java.util.*;
public class survey {
    
    public static String questions[] = {"lorem", "ipsum", "sit", "amet", "consectetur"};
    // should be private
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
    
    public static void highest(double[] av){
        double h = av[0];
        int highestIndex = 0;
        for(int index = 0; index < av.length; index++){
            if(av[index] > h)
            {
                h = av[index];
                highestIndex = index;
            }
        }
        System.out.println(highestIndex);
        System.out.printf("%f %s", h, questions[highestIndex]);
    }
    public static void lowest(double[] av){
        double l = av[1];
        int lowestindex = 0;
        for(int index2 = 0; index2 < av.length; index2++){
            if(av[index2] < l)
            {
                l = av[index2];
                lowestindex = index2;
            }
        }
        System.out.println(lowestindex);
        System.out.printf("%f %s", l, questions[lowestindex]);
    }
    public static void printArr(double[] n){
        for(double i : n){
            System.out.printf(" %f", i);
        }
    }

}
