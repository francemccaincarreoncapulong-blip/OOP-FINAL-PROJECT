
public class SocialEvent extends Event {

    private String eventTheme;

    // FULL CONSTRUCTOR
    public SocialEvent(int eventID, String eventName, String eventDate, String eventLocation, String eventTheme) {
        super(eventID, eventName, eventDate, eventLocation);
        setEventTheme(eventTheme);
    }

    // Constructor for a social event with incomplete details
    public SocialEvent(int eventID, String eventName) {
        super(eventID, eventName);
        setEventTheme("TBA");
    }

    // GETTER AND SETTER OF EVENT THEME
    public String getEventTheme() {
        return eventTheme;
    }

    public void setEventTheme(String eventTheme) {
        if (eventTheme == null || eventTheme.isBlank()) {
            throw new IllegalArgumentException("Event theme cannot be empty.");
        }

        this.eventTheme = eventTheme;
    }

    @Override
    public String getEventType() {
        return "Social Event";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Event Theme: " + eventTheme);
    }
}