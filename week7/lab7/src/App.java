public class App {
    public static void main(String[] args) throws Exception {

      hourlyEmployee mehmet = new hourlyEmployee("Ahmet ", "Mehmet ", "1156-55-98-55", 8,20);
      
      System.out.println(mehmet.name + mehmet.surname + mehmet.ID);
      hourlyEmployee.printIncome();

    }
}
