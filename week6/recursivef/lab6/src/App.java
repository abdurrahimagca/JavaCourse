public class App {
    public static void main(String[] args) throws Exception {
        String name = "Ali";
        String surname = "Veli";
        String brand = "Volvo";
        String model = "2022-0-55-66A";
        cars c  = new cars(brand, model);
        people p = new people(name, surname, c);
        p.setName(name);
        p.setSurname(surname);
        p.c.setBrand(brand);
        p.c.setModel(model);
        System.out.printf("%s %s'nin %s model %s marka araci vardir.\n", p.getName(), p.getSurname(),p.c.getModel(), p.c.getBrand());


    }
}
