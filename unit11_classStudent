public class Student{
    public int numTests = 3;
    public String name;
    public int[] tests;
    public String grade;
    public Student(){
        name = "";
        tests = new int[numTests];
        grade = "";
    }
    public Student(String studentName, int[] studentTests, String studentGrades){
       name = studentName;
       tests = studentTests;
       grade = studentGrades;
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String newGrade){
        grade = newGrade;
    }
    public void updateGrade(){
        if (name.equals("")){
            grade = "No Grade";
        } else if (getAverage() >= 65){
            grade = "Pass!";
        } else {
            grade = "Fail :(";
        }
    }
    public double getAverage(){
        double total = 0;
        for (int score : tests){
            total += score;
        }
        return total/numTests;
    }
}
