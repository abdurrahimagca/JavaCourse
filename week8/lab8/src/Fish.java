public class Fish extends Animal implements Pet{
    public String name;
    public Fish(String name) {
        super(0);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public void play() {
       System.out.println("I am a fish I play glup!");
    }
    public void walk(){
        super.walk();
        System.out.println("I am a fish I cannot walk but swim, can you? !");
    }


    
    
}
