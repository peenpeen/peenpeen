package Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nxtlvl on 9/30/2016.
 */
public class MyCollection {

    public static void spacer(){
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }

    public static List<String> myFriends() {


//    String[] myInstructors = {"Neil", "Bert", "Amille"};
//
//    int allInstructor = myInstructors.length;
//    int startCount;
//
//            for(startCount = 0; startCount <= allInstructor; startCount++){
//        if(myInstructors[startCount].equals("Bert")){
//            myInstructors[startCount] = "Amante";
//        }
//        System.out.println("Instructor: " +myInstructors[startCount]);
//
//    }

    List<String> myFriends = new ArrayList<String>();

        myFriends.add("Aliparts");
        myFriends.add(1, "Arniel");
        myFriends.add(2, "Daniel April");
        myFriends.add(3, "Erana");
        myFriends.add(4, "Jeremiah");
        myFriends.add(5, "Jhon Mark");
        myFriends.add(6, "Loki");
        myFriends.add(7, "Mario");
        myFriends.add(8, "Peter Anthony");
        myFriends.add(9, "Rhaminne");
        myFriends.add(10, "Roden");
        myFriends.add(11, "Sol");

        /*int allFriends = myFriends.size();
            int startCount2;

        for(startCount2 = 0; startCount2 < allFriends; startCount2++){

            System.out.println("Friends: " +myFriends.get(startCount2));

        }*/

        return myFriends;
    }

    public static List<String> myGirlFriends(){
        List<String> myGirlFriends = new ArrayList<String>();
        myGirlFriends.add("Adele");
        myGirlFriends.add(1, "Aom Sushar Manaying");
        myGirlFriends.add(2, "Beyonce");
        myGirlFriends.add(3, "Lady Gaga");
        myGirlFriends.add(4, "Miley Cyrus");
        myGirlFriends.add(5, "Rihanna");
        myGirlFriends.add(6, "Selena Gomez");
        myGirlFriends.add(7, "Shakira");
        myGirlFriends.add(8, "Taylor Swift");



        /*int allGirlFriends = myGirlFriends.size();
        int startGFCounter;

        for(startGFCounter = 0; startGFCounter < allGirlFriends; startGFCounter++){

            System.out.println("GF" + startGFCounter + " : "  +myGirlFriends.get(startGFCounter));

        }*/

        return myGirlFriends;
    }

    public static List<String> relationship(){
        List<String> relation = new ArrayList<String>();

        relation.add(" is BestFriend of ");
        relation.add(" is Complicated with ");
        relation.add(" is Enemy of ");
        relation.add(" is Friend of ");
        relation.add(" was being Friendzoned by ");
        relation.add(" is a Follower of ");
        relation.add(" is the FUBU of ");
        relation.add(" is the Partner In Crimes of ");
        relation.add(" was being Seenzoned by ");
        relation.add(" is a Stalker of ");


        /*int allGirlFriends = myGirlFriends.size();
        int startGFCounter;

        for(startGFCounter = 0; startGFCounter < allGirlFriends; startGFCounter++){

            System.out.println("GF" + startGFCounter + " : "  +myGirlFriends.get(startGFCounter));

        }*/

        return relation;
    }

    public static String randomizer(List<String> toBeRandomized ){

        int max = toBeRandomized.size();

        Random rand = new Random();

        int  n = rand.nextInt(max) + 0;

        return toBeRandomized.get(n);

    }

    public static void runPairer(){
        String friend = randomizer(myFriends());
        String girlFriend = randomizer(myGirlFriends());
        String relationship = randomizer(relationship());

        String sentence = friend + relationship + girlFriend + "!";
        String sentenceAddedEmoticon;

        if(relationship == "is the FUBU of " || relationship == "is a Stalker of "){
            sentenceAddedEmoticon = sentence + " :O";
        }else if(relationship == "is Complicated with " || relationship == "was being Friendzoned by " || relationship == "was being Seenzoned by "){
            sentenceAddedEmoticon = sentence + " :'(";
        }else if(relationship == "is BestFriend of "){
            sentenceAddedEmoticon = sentence + " :D";
        }else if(relationship == "is Enemy of "){
            sentenceAddedEmoticon = sentence + " :X";
        }else if(relationship == "is the Partner In Crimes of "){
            sentenceAddedEmoticon = sentence + " >:D";
        }else{
            sentenceAddedEmoticon = sentence + " :)";
        }

        System.out.println(sentenceAddedEmoticon);

    }


}
