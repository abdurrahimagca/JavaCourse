import java.util.*;
import java.util.Arrays;



public class surveyhash {
    public static String questions[] = {"Poverty and Homelessness ", "Climate Change ", "Overpopulation ", "Immigration Stresses ", "Gender Inequality "};

    public static HashMap<Integer, Integer> Survey = new HashMap<Integer, Integer>() {{
        put(0, 0);
        put(1, 0);
        put(2, 0);
        put(3, 0);
        put(4, 0);
        put(5, 0);
        
    }};

    public static double[] calcAv(HashMap<Integer, Integer> Data, int count){
        double av[] = {0,0,0,0,0};
        for (int i = 0; i < 5; i++){
            av[i] = ((double) Data.get(i))/count;   
        }
        return av;
    }
    
    public static void printHighLow(double[] data){
       
        int l = data.length;
        double highest = Arrays.stream(data).max().getAsDouble();
        double lowest = Arrays.stream(data).min().getAsDouble();
        for(int i = 0; i < l ; i++ ){
            if( data[i] == highest){
                System.out.printf("%s is the highest val with %.2f\n",questions[i], highest);

            }
               

            else if(data[i] == lowest){
                System.out.printf("%s is the lowest val with %.2f\n",questions[i], lowest);

            }
        }       
    }

    public static void printArr(double[] n){
        for(int index = 0; index < n.length; index++){
            System.out.printf("%s's average val: %.2f \n",questions[index], n[index]);
        }
    }

    };
    

