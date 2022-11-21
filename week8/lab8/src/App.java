public class App {
    public static void main(String[] args) throws Exception {
        Fish f = new Fish("turunc");
        Animal c = new Cat("Tekir");
        Animal f2 = new Fish("nemo");
        Cat c2 = new Cat("mirmir");
        Spider s = new Spider();

        s.spider();
        
        System.out.println("I am fish my name is " + f.getName());
        f.play();

        System.out.println("I am a cat my name is " + c2.getName());
        c2.eat();
        c2.walk();

    
       
        f2.walk();

        
    }
}
