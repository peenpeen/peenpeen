package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Employee extends Person{

    private String department;
    private float payGrade;
    private int employeeId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(float payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }



    /*public String introduceYourself(String from){

        this.from = from;
        String sentence = "Hi I'm " + getFirstName() + " " + getLastName() + "! Im from " + from + " Class!";
        return sentence;
    }*/

    //@Override
    public String introduceYourself(){

        String sentence = "Hi I'm " + getFirstName() + " " + getLastName() + "! Im from Employee Class.";
        return sentence;
    }
}
