# ARR-MadLibs



<img width="747" height="723" alt="image" src="https://github.com/user-attachments/assets/397521f2-d3ae-40e0-a261-45b0cdf76f9a" />




<img width="815" height="390" alt="image" src="https://github.com/user-attachments/assets/390e99e4-8a3c-437a-b57b-ac6fbdcec4ca" />




<img width="740" height="521" alt="image" src="https://github.com/user-attachments/assets/0fc9632d-0519-4285-80b8-cc983fd6ce0b" />




This Read Me, was made by Rishab Trehan(ReadME+Slide Design for presentations), Arshan Avula(Coder 01), and Rohit Denduluri(Coder 02).


# Day 01
Day 01 was the introduction to this project. We were tasked with creating an input of any number and getting only ONE output. Similar to x = a number. So after we were introduced to this project, we had to brainstorm on how to solve this dilemma. This dilemma“ had easy solutions at first, but our teacher, Mr Baez, had limitations and requirements for this project, making them impossible. We had to use our prior skills to complete this project.


To begin with, we were learning and brainstorming how to structure this program. 


# Day 02
To begin with, we were learning and brainstorming how to structure this program. 




The first solution we thought of was being able to get the input using greater than or less than signs against zero to determine the input, for becoming a positive or negative integer(or doubles -> decimals). We can then determine the distance between the input number and the “goal” number. Now that we have this, we could use this information to calculate the distance number and the original number to get our “goal number”.
We also rejected the previous method
import java.util.Scanner;
public class Madlib {
    public static void main(String[] args) {


    String incomplete = "The (adjective) knight decided to (verb) the (noun), carefully (verb-ing) for danger while facing (number) locked doors.";
    Scanner sc = new Scanner(System.in);




    System.out.println("Enter an adjective:");
    String word1 = sc.nextLine();


    System.out.println("Enter a verb:");
    String word2 = sc.nextLine();


    System.out.println("Enter a noun:");
    String word3 = sc.nextLine();


    System.out.println("Enter a verb that ends with 'ing':");
    String word4 = sc.nextLine();


    System.out.println("Enter a whole number:");
    int word5 = sc.nextInt();


    System.out.println(incomplete.substring(0,4) + word1 + incomplete.substring(15,34) + word2);


    }
}


————————————————————————————————————————————————————————


# Day 03

We made the github repository














The Code

VVV

    import java.util.Scanner;
    public class Madlib {
    public static void main(String[] args) {

    String incomplete = "The (adjective) knight decided to (verb) the (noun), carefully (verb-ing) from danger while facing (number) locked doors.";
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter an adjective:");
    String word1 = sc.nextLine();

    System.out.println("Enter a verb:");
    String word2 = sc.nextLine();

    System.out.println("Enter a noun:");
    String word3 = sc.nextLine();

    System.out.println("Enter a verb that ends with 'ing':");
    String word4 = sc.nextLine();

    System.out.println("Enter a whole number:");
    int word5 = sc.nextInt();

    System.out.println(incomplete.substring(0,4) + word1 + incomplete.substring(15,34) + word2 + incomplete.substring(40,45) + word3 + incomplete.substring(51,63) + word4 + incomplete.substring(73,99) + word5 + incomplete.substring(107));

    }









# New Due Date(+1 Week) // DAY 03

>>> display the original story
>>> Tests with one MadLib(WE NEED THREE MADLIBS)
>>> Need 3 different MADLIBS
>>> Java program should be similar
VVVVVVVVVVVVVVVVVVVVVV

String Nightmare



------------------------------------------------------ 


(OUR RANT)
This task was so much harder….(Then it needed to be)


The original task was to have a SET made that we, the coding nerds(us duhhh) selected, and have SET positions for words(nouns, verbs, adj, etc), and that was it. BUT Mr Baez had realised he had portrayed our project wrong… He decided that we need to take a few steps back, and take on a (essentially)completely different challenge. Now instead of just the inputs we were using(the nouns, verbs, etc)… we now need to enter ANY MADLIB, NO MATTER HOW LONG SHORT OR THE VARYING AMOUNT OF BLANK WORDS!!!! This simple task grew exponentially harder, as now the code we used, we were using set pavements for the nouns, verbs, etc; but now it can vary any amount and can be anywhere in the sentence, obliterating out previous method. But not just that, we also needed a new input.. A MADLIB. Then Our Program should be able to scan this madlib and find where each (BLANK) space is!!!


<img width="883" height="219" alt="image" src="https://github.com/user-attachments/assets/9d5e3bbf-2dde-493f-8540-d122c103288a" />



# Starting from Square 01


Since we used set methods for the code, it would no longer apply for the new challenge, so we needed to start from square one.
