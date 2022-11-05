import java.util.*;
public class survey {
    
    public static String questions[] = {"Poverty and Homelessness", "Climate Change", "Overpopulation", "Immigration Stresses", "Gender Inequality"};
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
        System.out.printf("%s is the highest val with %.2f\n",questions[highestIndex], h);
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
        System.out.printf("%s is the highest val with %.2f\n",questions[lowestindex], l);
    }
    public static void printArr(double[] n){
        for(int index = 0; index < n.length; index++){
            System.out.printf("%s's average val: %.2f \n",questions[index], n[index]);
        }
    }

}
