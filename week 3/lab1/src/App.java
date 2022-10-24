import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        int birth = sc2.nextInt();

        HeartRate person = new HeartRate();
        person.setName(name);
        person.setSurname(surname);
        person.setBirthDate(birth);

        HeartRate.show(name, surname, birth);



       




    }
}
