import java.util.ArrayList;

public class Attendance implements Displayable{

    private Event event;
    private ArrayList<Member> attendees;

    public Attendance(Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Event cannot be null.");
        }
        if ("TBA".equalsIgnoreCase(event.getEventDate())
                || "TBA".equalsIgnoreCase(event.getEventLocation())) {
            throw new IllegalArgumentException(
                    "Event details must be complete before attendance can be created."
            );
        }

        this.event = event;
        this.attendees = new ArrayList<>();
    }

    public Event getEvent() {
        return event;
    }

    public ArrayList<Member> getAttendees() {
        return new ArrayList<>(attendees);
    }

    public void addAttendee(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null.");
        }

        for (Member attendee : attendees) {
            if (attendee.getMemberID() == member.getMemberID()) {
                System.out.println(member.getMemberName() + " is already attending.");
                return;
            }
        }
        attendees.add(member);
    }

    public void removeAttendee(Member member) {
        attendees.remove(member);
    }

    public boolean isAttending(Member member) {
        return attendees.contains(member);
    }

    public int getAttendanceCount() {
        return attendees.size();
    }

    @Override
    public void displayDetails() {
        System.out.println("\n===== EVENT DETAILS =====");

        event.displayDetails();

        System.out.println("\n===== ATTENDEES =====");

        if (attendees.isEmpty()) {
            System.out.println("No attendees recorded.");
        } else {
            for (int i = 0; i < attendees.size(); i++) {
                System.out.println("\nAttendee #" + (i + 1));
                attendees.get(i).displayDetails();
            }
        }

        System.out.println("\nTotal Attendees: " + getAttendanceCount());
    }
}