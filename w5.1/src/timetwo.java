public class timetwo {
    private int hour;
    private int min;
    private int sec;
    
    public timetwo(){

    }
    
    public timetwo(int hour){
        this.hour = hour;
    }
    public timetwo(int hour, int min){
        this.min = min;
        this.hour = hour;
    }
    
    public timetwo(int hour, int min, int sec){
        this.min = min;
        this.hour = hour;
        this.sec = sec;

    }
    public void setHour(int hour){
        if((hour < 0 || hour > 23)){
            return;
        }
        this.hour = hour;
    }
    public void setMin(int hour, int min){
            if((hour < 0 || hour > 23) || (min < 0 || min > 59)){
                return;
            }
            this.hour = hour;
            this.min = min;

    }
    public void setTime(int hour, int min, int sec){
        if((hour < 0 || hour > 23) || (min < 0 || min > 59) || (sec < 0 || sec > 59)){
            return;
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public String time(){
        return String.format("%02d:%02d:%02d", hour,min,sec);
    }
}
