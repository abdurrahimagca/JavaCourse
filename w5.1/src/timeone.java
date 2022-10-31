public class timeone {
    private int hour;
    private int min;
    private int sec;
    public static int count = 0;

    public void setTime(int hour, int min, int sec){
        if((hour < 0 || hour > 23) || (min < 0 || min > 59) || (sec < 0 || sec > 59)){
            return;
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        count++;

    }
    
    public String time(){
        return String.format("%02d:%02d:%02d", hour,min,sec);
    }
    public static int getCount(){
        return count;
    }

    
}

