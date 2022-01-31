public class prepStudent extends Student{
    public prepStudent(){
        super();
    }
    public prepStudent(String studentName, int[] studentTests, String studentGrades){
        super(studentName, studentTests, studentGrades);
    }
    public void updateGrade(){
        super.updateGrade();
        if(getAverage() >= 85){
            setGrade("Above Average, girlboss!");
        }
    }
}
