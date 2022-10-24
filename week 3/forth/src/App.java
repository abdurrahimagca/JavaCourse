import java.util.*;
import java.lang.Math;
public class App {
    public static int check(Float checkGrade){
        if(checkGrade >= 90 && checkGrade<100)
            return 1;

        else if(checkGrade >= 85)
            return 2;
        
        else if(checkGrade >= 80)
            return 3;
        
        else if(checkGrade >= 75)
            return 4;
        
        else if(checkGrade >= 65)
            return 5;
        
        else if(checkGrade >= 60)
            return 6;
        
        else if(checkGrade >= 55)
            return 7;
        
        else if(checkGrade >= 50)
            return 8;
        
        else
            return 0;

    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //proje 30 vize 20 ders 10 final 40
        Float totalGrade = 0F;
        Float tempGrade = 0F;
        
        System.out.println("lutfen vize notunuzu giriniz: ");
        tempGrade = sc.nextFloat();
        totalGrade = totalGrade + tempGrade*(20/100);

        System.out.println("lutfen proje notunuzu giriniz: ");
        tempGrade = sc.nextFloat();
        totalGrade = totalGrade + tempGrade*(30/100);

        System.out.println("lutfen lab notunuzu giriniz: ");
        tempGrade = sc.nextFloat();
        totalGrade = totalGrade + tempGrade*(10/100);

        System.out.println("lutfen final notunuzu giriniz: ");
        tempGrade = sc.nextFloat();
        totalGrade = totalGrade + tempGrade*(40/100);
        System.out.println(totalGrade);


        switch(check(totalGrade)){

            case 1:
                System.out.println("A");
            case 0:
            System.out.println("definetly not zero");




        }

        




    }
}
