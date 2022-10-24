public class HeartRate {
    private String name;
    private String surname;
    private int birthDate;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =  name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getbirthDate(){
        return birthDate;
    }
    public void setBirthDate(int birth){
        this.birthDate = birth;
    }

    public static int maxHeartRate(int birth){
        return 220-(2022-birth);
    }
    public static int targetHeartRate(int mhr){
        //round kullanılacak
        return mhr*85/100;
    }
    public static void show(String name, String Surname, int birth){
        System.out.println("isim: " + name);
        System.out.println("soyisim: " + Surname);
        System.out.println("yasiniz: " + (2022-birth));
        System.out.println("maksimum kalp atisi: " + maxHeartRate(birth));
        System.out.println("hedeflenen kalp atisi : " + targetHeartRate(maxHeartRate(birth)));
        

    }
    
}
