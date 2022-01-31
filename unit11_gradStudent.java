public class gradStudent extends Student{
    public gradStudent(){
        super();
    }
    public gradStudent(String studentName, int[] studentTests, String studentGrade){
        super(studentName, studentTests, studentGrade);
    }
    public void updateGrade(){
        super.updateGrade();
        if(getAverage() >=90){
            setGrade("WOAH SO GOOD! GOOD JOB!!!!!");
        }
    }
}
