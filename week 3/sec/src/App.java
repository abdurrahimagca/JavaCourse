import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do{
         System.out.println("toplam ders sayinizi giriniz");   
         count = sc.nextInt();
        }while(count <= 0);

        int i = 0;
        int tempGrade = 0;
        int totalGrade = 0;
        while(i < count){
            System.out.println("notunuzu giriniz"); 
            tempGrade = sc.nextInt();
            
            if(tempGrade < 0){
                System.out.println("hatali giris");                
            }
            else{
                totalGrade += tempGrade;
                i++;
            }
        }
        float ort = (float) totalGrade/count;
        System.out.println("ortalama: " + ort);
    }
}
