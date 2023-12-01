public class RepeatEvent extends  InfiniteRepeatEvent {
    private int end;

    public RepeatEvent(int day, String description, String place, int period, int end) {
        super(day, description, place, period);
        this.end = end;
    }

    public int getEnd() {
        return end;
    }
    public int diff(int otherDay){
        if (otherDay <= this.getDay()){
            return otherDay - this.getDay();
        }else if(otherDay >= end){
            return end - otherDay;
        }else{
            int days = otherDay - getDay();
            return getPeriod() - days % getPeriod();
        }
    }
}
