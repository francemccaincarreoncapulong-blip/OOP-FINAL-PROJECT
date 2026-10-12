
public class AcademicEvent extends Event {

    private String eventTopic;

    // FULL CONSTRUCTOR
    public AcademicEvent(int eventID, String eventName, String eventDate, String eventLocation, String eventTopic) {
        super(eventID, eventName, eventDate, eventLocation);
        setEventTopic(eventTopic);
    }

    // Constructor for an academic event with incomplete details
    public AcademicEvent(int eventID, String eventName) {
        super(eventID, eventName);
        setEventTopic("TBA");
    }

    // GETTER AND SETTER OF EVENT TOPIC
    public String getEventTopic() {
        return eventTopic;
    }

    public void setEventTopic(String eventTopic) {
        if (eventTopic == null || eventTopic.isBlank()) {
            throw new IllegalArgumentException("Event topic cannot be empty.");
        }

        this.eventTopic = eventTopic.trim();
    }

    @Override
    public String getEventType() {
        return "Academic Event";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Event Topic: " + eventTopic);
    }
}