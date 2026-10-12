
public abstract class Member implements Displayable {

    // PRIVATE FIELDS
    private int memberID;
    private int yearLevel;
    private String memberName;
    private String course;
    private static int totalMembers = 0;


    // CONSTRUCTOR
    public Member(int memberID, String memberName, String course, int yearLevel) {
        setMemberID(memberID);
        setMemberName(memberName);
        setYearLevel(yearLevel);
        setCourse(course);

        totalMembers++;
    }

    // GETTER AND SETTER OF MEMBER ID
    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        if (memberID <= 0) {
            throw new IllegalArgumentException(
                    "Member ID cannot be 0. Got " + memberID + "."
            );
        }
        this.memberID = memberID;
    }

    // GETTER AND SETTER OF MEMBER NAME
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        if (memberName == null || memberName.isBlank()) {
            throw new IllegalArgumentException(
                    "Member Name cannot be blank/null."
            );
        }
        this.memberName = memberName;
    }

    // GETTER AND SETTER OF YEAR LEVEL
    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        if (yearLevel < 1 || yearLevel > 5) {
            throw new IllegalArgumentException(
                    "Year Level must be between 1 and 5."
            );
        }
        this.yearLevel = yearLevel;
    }

    // GETTER AND SETTER OF COURSE
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course == null || course.isBlank()) {
            throw new IllegalArgumentException(
                    "Course cannot be blank/null."
            );
        }
        this.course = course;
    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    // ABSTRACT METHODS
    public abstract String getMemberType();

    @Override
    public void displayDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + memberName);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Member Type: " + getMemberType());
    }
}