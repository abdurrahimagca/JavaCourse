import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];

        System.out.printf("%s%8%s%n", "Index", "Value");
        arr[1] = 1;

        for(int counter = 0; counter < Array.getLength(arr); counter++){
            System.out.printf("%5d%8d%n", counter, arr[counter]);
        }
        System.out.println("\n\n------w4.2-------\n\n");

        int[] arr2 = {32, 27, 64, 18, 55, 411, 98};

        for(int counter2 = 0; counter2 < Array.getLength(arr2); counter2++){
            System.out.printf("%5d%8d%n", counter2, arr2[counter2]);
        }
        System.out.println("\n\n---reversed---s\n\n");
        for(int counter3 = Array.getLength(arr2)-1; counter3 > 0; counter3--){
            System.out.printf("%5d%8d%n", counter3, arr2[counter3]);
        }
        

    }
}
