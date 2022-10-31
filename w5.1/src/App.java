public class App {
    public static void main(String[] args) throws Exception {
        timeone time = new timeone();
        time.setTime(22, 45, 50);
        System.out.println(time.time());
        time.setTime(21, 45, 50);
        System.out.println(time.time());System.out.println(time.time());
        System.out.println("Set Count: " + timeone.getCount());
        //does not do anything try catch 
        try {
            time.setTime(99, 99, 99);
        } catch (Exception e) {
           System.out.println("Exeption " + e.getMessage());
        }
        System.out.println("------------------");
        timetwo timetwo =new timetwo();
        timetwo.setMin(21, 30);
        System.out.println(timetwo.time());

        timetwo timethree = new timetwo(3, 45, 55);
        System.out.println(timethree.time());

        
    }
}
