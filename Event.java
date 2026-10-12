public abstract class Event implements Displayable{

    // FIELDS
    private int eventID;
    private String eventName;
    private String eventDate;
    private String eventLocation;


    // FULL CONSTRUCTOR
    public Event(int eventID, String eventName,
                 String eventDate, String eventLocation) {

        setEventID(eventID);
        setEventName(eventName);
        setEventDate(eventDate);
        setEventLocation(eventLocation);
    }

    // Constructor for events with incomplete details
    public Event(int eventID, String eventName) {
        this(eventID, eventName, "TBA", "TBA");
    }

    // GETTER AND SETTER OF EVENT ID
    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        if (eventID <= 0) {
            throw new IllegalArgumentException("Event ID must be greater than 0.");
        }
        this.eventID = eventID;
    }

    // GETTER AND SETTER OF EVENT NAME
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        if (eventName == null || eventName.isBlank()) {
            throw new IllegalArgumentException("Event name cannot be empty.");
        }
        this.eventName = eventName;
    }

    // GETTER AND SETTER OF EVENT DATE
    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        if (eventDate == null || eventDate.isBlank()) {
            throw new IllegalArgumentException("Event date cannot be empty.");
        }
        this.eventDate = eventDate;
    }


    // GETTER AND SETTER OF EVENT LOCATION
    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        if (eventLocation == null || eventLocation.isBlank()) {
            throw new IllegalArgumentException("Event location cannot be empty.");
        }
        this.eventLocation = eventLocation;
    }

    // ABSTRACT METHOD
    public abstract String getEventType();

    @Override
    public void displayDetails() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Type: " + getEventType());
        System.out.println("Date: " + eventDate);
        System.out.println("Location: " + eventLocation);
    }
}