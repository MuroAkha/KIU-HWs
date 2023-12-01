import java.util.ArrayList;
import java.util.List;

public class Calendar {
        public EventList events;
         public Calendar(){
             this.events = null;
         }
        public void addNewEvent(Event event){
            if (events == null){
                events = new EventList(event);
            }else {
                events = events.add(event);
            }
        }

        public Event[] eventsAt(int day) {
            int count = 0;
            for (EventList current = events; current != null; current = current.getNext()) {

                if (current.getEvent().getDay() == day) {
                    count++;
                }

            }
            Event[] eventsOnDay = new Event[count];
            int index = 0;
            for (EventList current = events; current != null; current = current.getNext()) {
                if (current.getEvent().getDay() == day) {
                    eventsOnDay[index++] = current.getEvent();
                }
            }
            return eventsOnDay;
        }
        public Event nextEvent(int day){
             EventList current = events;
             Event nextEvent = null;
             while(current != null){
                 Event currentEvent = current.getEvent();
                 if(currentEvent.getDay() >= day){
                     if(nextEvent == null || currentEvent.getDay() < nextEvent.getDay()){
                         nextEvent = currentEvent;
                     }
                 }
                 current = current.getNext();
             }
             return nextEvent;
        }

}
