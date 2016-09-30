package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Customer extends Person {

    private String address;
    private int telephoneNumber;
    private int customerId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }



    public String introduceYourself(String wannaBuy){

        String sentence = "Hi I'm " + getFirstName() + " " + getLastName() + "! I want to buy " + wannaBuy + ".";
        return sentence;
    }

//    @Override
//    public String introduceYourself(){
//
//        String sentence = "Hi I'm " + getFirstName() + " " + getLastName() + "! Im a customer and want to buy notch.";
//        return sentence;
//    }

}
