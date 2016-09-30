package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public abstract class Person {

    private String userName;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int passWord;
    private int passWordAgain;

    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public void setPassWordAgain(int passWordAgain) {
        this.passWordAgain = passWordAgain;
    }



    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getPassWord() {
        return passWord;
    }

    public int getPassWordAgain() {
        return passWordAgain;
    }

    public String introduceYourself(){
        String sentence = "Hi I'm " + firstName + " " + lastName+ "!";
        return sentence;
    }
}
