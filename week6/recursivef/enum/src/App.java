import java.util.HashMap;
import java.util.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("mercedes");
        cars.add(0, "fiat");
        System.out.println(cars);
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Ahmet", 22);
        people.put("Mehmet", 24);
        people.put("G", 25);
        for(String i : people.keySet()){
            System.out.println(i +" " + people.get(i));
        }
        System.out.println(cars.get(0).hashCode());
        System.out.println(cars.get(1).hashCode());
        String a = (String) cars.get(1);
        System.out.println(a.hashCode());
        String i = "volvo";
        System.out.println(i.hashCode());

        if(a == "Volvo")
            System.out.println("ddd");
        
        Iterator<String> it = cars.iterator();
    
        while(it.hasNext()){
            System.out.println(it.next());
        }


        
    }
}

