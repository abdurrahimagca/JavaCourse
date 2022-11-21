public class Cat extends Animal implements Pet {
    public Cat(int legs) {
        super(legs);
        //TODO Auto-generated constructor stub
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("I am a cat meow\n");
        
    }
    



    
    
}
