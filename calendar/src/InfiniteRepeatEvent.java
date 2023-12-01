public class InfiniteRepeatEvent extends Event {
    private int period;
    public InfiniteRepeatEvent(int day, String description, String place, int period) {
        super(day, description, place);
        this.period = period;
    }
    public int getPeriod() {
        return period;
    }

    public int diff(int otherDay) {
        if(otherDay <= this.getDay()){
            return otherDay - this.getDay();
        }else {
            return period - ((otherDay - this.getDay()) % period);
        }
    }


}
