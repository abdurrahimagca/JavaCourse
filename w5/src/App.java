import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
     ArrayList<String> item = new ArrayList<String>();
     item.add("red");
     item.add("yellow");
     item.add(0,"green");
     for(String color :item){
        System.out.println(color);
     }
     item.remove("red");
     System.out.println();
     for(String color :item){
        System.out.println(color);
     }
     //System.out.print(item.get(1));
     System.out.println(item.contains("red") ? "red is an item" : "red is not an item, anymore");
     
    }
}
