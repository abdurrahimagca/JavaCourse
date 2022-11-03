import java.util.*;
public class survey {
    public static String[] Questions = {"lorem", "ipsum", "dolor", "sit", "amet"};

    public static ArrayList<Integer> arl=new ArrayList<Integer>();
    
    public static void printInfo(int person){
        
        for(String s:Questions){ 
                System.out.println(s);
                for(int j = 0 ; j < person; j++){
                    System.out.println(arl.get(j));

                }

        }

    }


}
