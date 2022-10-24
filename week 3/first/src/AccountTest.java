public class AccountTest {
    public static void main(String[] args){
        String isim = "umit";
        String soyisim = "senturk";
        int yas = 20;

        Account person = new Account(isim, soyisim, yas);
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.setName("Hasan");
        person.setSurname("Yilmaz");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        System.out.println();
        
        Account person2 = new Account("Ali", "Veli", 35);
        System.out.println(person2.getName());
        System.out.println(person2.getSurname());
        System.out.println(person2.getAge());
        
    }

    
}
