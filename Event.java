import java.util.Date;

public class Event{

    private final Date date;
    private final String eventName;
    private final int members;
    private final int locationID;
    private final String locationName;

    public Event(Date aDate, String anEventName, int aMembers, int aLocationID, String aLocationName)
    {
        //date = new Date(aDate);
        this.date = aDate;
        this.eventName = anEventName;
        this.members = aMembers;
        this.locationID = aLocationID;
        this.locationName = aLocationName;
    }


    public Date getDate() {
        return date;
    }

    public String getEventName() {
        return eventName;
    }

    public int getMembers() {
        return members;
    }

    public int getLocationID() {
        return locationID;
    }

    public String getLocationName() {
        return locationName;
    }
}
