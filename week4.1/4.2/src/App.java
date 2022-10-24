public class App {
    public static void modifyArray(int[] arr){
        for(int counter = 0; counter < arr.length; counter++){
            arr[counter] *= 2;
        }
    }
    public static void modifyElement(int element){
        element *= 2;
        System.out.println(element);

    }
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};

        for(int value : arr){
            System.out.printf("   %d", value);

        }
        System.out.println("");
        modifyArray(arr);
       for(int value : arr){
        System.out.printf("   %d", value);
        modifyElement(arr[1]);

    }
    
}
}
