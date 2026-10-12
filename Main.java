public class Main {
    public static void main(String[] args) {

        // Create members
        Officer officer = new Officer(
                1,
                "France",
                "BSIT",
                2,
                "President"
        );

        RegularMember member1 = new RegularMember(
                2,
                "Aaron",
                "BSIT",
                2
        );

        RegularMember member2 = new RegularMember(
                3,
                "Khalil",
                "BSIT",
                2
        );

        // Display member details and demonstrate polymorphism
        System.out.println("===== MEMBER DETAILS =====");

        Member[] members = {officer, member1, member2};

        for (Member member : members) {
            member.displayDetails();
            System.out.println();
        }

        // Display total members created
        System.out.println("===== MEMBER COUNTER =====");
        System.out.println(
                "Total members created: " + Member.getTotalMembers()
        );


        // Create events
        AcademicEvent academicEvent = new AcademicEvent(
                101,
                "Java Programming Seminar",
                "2026-10-15",
                "Computer Laboratory",
                "Object-Oriented Programming"
        );

        SocialEvent socialEvent = new SocialEvent(
                102,
                "Welcome Party",
                "2026-10-20",
                "School Gymnasium",
                "Retro Night"
        );

        // Display event details
        System.out.println("\n===== EVENT DETAILS =====");

        academicEvent.displayDetails();

        System.out.println();
        socialEvent.displayDetails();


        // Create attendance for the academic event
        Attendance attendance = new Attendance(academicEvent);

        // Add members to attendance
        System.out.println("\n===== ADD ATTENDEES =====");

        attendance.addAttendee(officer);
        attendance.addAttendee(member1);
        attendance.addAttendee(member2);

        // Test duplicate attendance prevention
        System.out.println("\n===== DUPLICATE ATTENDANCE TEST =====");

        attendance.addAttendee(member1);


        // Display the complete attendance sheet
        System.out.println("\n===== ATTENDANCE DETAILS =====");
        attendance.displayDetails();


        // Check if a member is attending
        System.out.println("\n===== CHECK ATTENDANCE =====");

        System.out.println(
                "Is Aaron attending? " + attendance.isAttending(member1)
        );


        // Remove an attendee
        System.out.println("\n===== REMOVE ATTENDEE =====");

        attendance.removeAttendee(member2);

        // Display updated attendance
        System.out.println("\n===== UPDATED ATTENDANCE =====");
        attendance.displayDetails();


        // Test incomplete event validation
        System.out.println("\n===== INCOMPLETE EVENT TEST =====");

        AcademicEvent incompleteEvent = new AcademicEvent(
                103,
                "Upcoming Seminar"
        );

        try {
            Attendance invalidAttendance = new Attendance(incompleteEvent);

            System.out.println("Attendance created successfully.");

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Cannot create attendance: " + e.getMessage()
            );
        }
    }
}

