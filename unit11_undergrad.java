public class underGrad extends Student
{
    public underGrad(){
        super();
    }
    public underGrad(String studentName, int[] studentTests, String studentGrade){
        super(studentName, studentTests, studentGrade); 
    }
    public void updateGrade(){
        if (getAverage() >= 70){
            setGrade("Pass!");
        } else{
            setGrade("Fail :(");
        }
    }
}
