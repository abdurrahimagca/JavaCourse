public class people {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    private String surname;
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    cars c;
    public people(String name, String surname, cars c) {
        this.name = name;
        this.surname = surname;
        this.c = c;
    }
}
