import Excercise.MyCollection;
import objects.Person;
import objects.Employee;
import objects.Customer;
import objects.Animal;

public class Main {

        public static void main(String[] args) {
            // my first comment in this IT up skilling program :D

            /**             *
             * first multi-liner comment
             * if started with 2 asterisk
             *
            Hehehe

            **/

            /* TODO is to create an animal class with 3 properties(string, int and boolean) with getters and setter */

            /*byte byteVariable = 120;
            short mediumRangeDecimalVariable = 32767;
            int decimalVariable = 2147483647;
            long largeDecimalVariableForm = -9223372036854775808L;
            long largeDecimalVariableUpto = 9999999999L;
            float numberWithDecimalPlaces = 28.2f;
            double veryLargeNumberWithDecimalPlaces = 9999999.12445;
            boolean isTrueOrFalse = true;
            char singleCharacter = '\ufffd';

            String someText =  "h" ;


            largeDecimalVariableForm = decimalVariable;
         //   decimalVariable = largeDecimalVariableForm;


            System.out.println(someText);
            System.out.println(byteVariable);
            System.out.println(mediumRangeDecimalVariable);
            System.out.println(decimalVariable);
            System.out.println(largeDecimalVariableForm);
            System.out.println(largeDecimalVariableUpto);
            System.out.println(numberWithDecimalPlaces);
            System.out.println(veryLargeNumberWithDecimalPlaces);
            System.out.println(isTrueOrFalse);
            System.out.println(singleCharacter);*/


            /*Person person = new Person("Stephen", "Canono");
            person.setUserName("Peen");
//            person.setFirstName("Stephen");
//            person.setLastName("Canono");
            person.setEmailAddress("canono.stephen430@gmail.com");
            person.introduceYourself();

            String theFirstName = person.getFirstName();
            String theLastName = person.getLastName();
            String theUserName = person.getUserName();
            String theEmail = person.getEmailAddress();
            String theCompleteName = person.introduceYourself();*/

            int exGf = 10;

            Employee newbie = new Employee();
            newbie.setFirstName("Neep");
            newbie.setLastName("Noys");
            String theEmployeeFirstName = newbie.getFirstName();
            String theEmployeeLastname = newbie.getLastName();
            String theEmployeeCompleteName = newbie.introduceYourself();

            Customer customer = new Customer();
            customer.setFirstName("Peen");
            customer.setLastName("Cils");
            String theCustomerFirstName = customer.getFirstName();
            String theCustomerLastname = customer.getLastName();
            String theCustomerCompleteName = customer.introduceYourself("Pancakes");

            Animal animal = new Animal();
            animal.setAnimalName("Lion");
            animal.setLivingSpan(15);
            animal.setAbleToSwim(true);

            String theAnimalName = animal.getAnimalName();
            int theLivingSpan = animal.getLivingSpan();
            boolean isTheAnimalAbletoSwim = animal.isAbleToSwim();


           /* System.out.println("Firstname: " + theFirstName);
            System.out.println("Lastname: " + theLastName);
            System.out.println("Username: " + theUserName);
            System.out.println("Email: " + theEmail);
            System.out.println(theCompleteName);*/

            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("Employee Firstname: " + theEmployeeFirstName);
            System.out.println("Employee Lastname: " + theEmployeeLastname);
            System.out.println(theEmployeeCompleteName);

            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("Customer Firstname: " + theCustomerFirstName);
            System.out.println("Customer Lastname: " + theCustomerLastname);
            System.out.println(theCustomerCompleteName);

            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("Animal Name: " + theAnimalName);
            System.out.println("Living Span: " + theLivingSpan);
            System.out.println("Can swim: " + isTheAnimalAbletoSwim);

            /*
            * condition and loops
            */

            if (exGf != 5){
                System.out.println("exGf is not equals to 5!");
            }else if(exGf == 10){
                System.out.println("exGf is equals to 10!");
            }else if(exGf > 15){
                System.out.println("exGf is greater than 15!");
            }else if(exGf < 11){
                System.out.println("exGf is less than 10!");
            }else{
                System.out.println("exGf is nothing!");
            }

            /*WHILE*/

            int n = 1;

            while(n < 7 ){
                System.out.print("["+ n +"]");
                n++;
            }

            /* WHILE with a twist*/

            int y = 1;
            int sum = 0;
            while (y <= 6){
                sum += y;
                y++;
            }
            System.out.print("\n"+sum);

            /*DO WHILE*/

            int b = 1;
            System.out.println("");

            do{
                System.out.print("["+ b +"]");
                b++;
            }while(b < 7);

            /*FOR LOOP*/
            System.out.println("");

            int i;

            for(i = 1; i <= 6; i++){
                System.out.print("["+ i +"]");
            }

            int q;
            int sum2 = 0;

            for(q = 1; q <=6; q++){
                sum2 += q;
            }

            System.out.print("\n"+sum2);

            System.out.println("");
            System.out.println("");
            
            MyCollection.runPairer();




    }
}
