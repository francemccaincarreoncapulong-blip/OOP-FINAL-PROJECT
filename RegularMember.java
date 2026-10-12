public class RegularMember extends Member{

    public RegularMember(int memberID, String memberName,String course, int yearLevel){
        super(memberID,memberName, course, yearLevel);
    }

    @Override
    public String getMemberType() {
        return "Regular Member";
    }
}
