public class Officer extends Member{
    private String position;

    public Officer(int memberID, String memberName,String course, int yearLevel, String position){
        super(memberID,memberName, course, yearLevel);
        setPosition(position);
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        if(position == null || position.isBlank()){
            throw new IllegalArgumentException("Position cannot be blank/null.");
        }
        this.position = position;
    }

    @Override
    public String getMemberType() {
        return "Officer";
    }
}