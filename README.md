# ARR-MadLibs


<img width="747" height="723" alt="image" src="https://github.com/user-attachments/assets/397521f2-d3ae-40e0-a261-45b0cdf76f9a" />




<img width="815" height="390" alt="image" src="https://github.com/user-attachments/assets/390e99e4-8a3c-437a-b57b-ac6fbdcec4ca" />




<img width="740" height="521" alt="image" src="https://github.com/user-attachments/assets/0fc9632d-0519-4285-80b8-cc983fd6ce0b" />




This Read Me was made by Rishab Trehan(ReadME+ ~~Slide Design for presentations~~), Arshan Avula(Coder 01), and Rohit Denduluri(Coder 02).


# Day 01 // Updated 
Day 01 was the introduction to this project. We were tasked with creating a Program that inputs verbs, adjectives, and nouns into a "random" Madlib! This random Madlib wasn't as random as it needed to be, but the amount of verbs/nouns/adjectives was spread out throughout the code. To begin with, we were learning and brainstorming how to structure this program. We were originally tasked with creating a different program, with a set Madlib... this meant we could use a method learnt in **1.1.7 (String Methods)**, so that we can replace a specific portion of the set string(Madlib) and replace it with whatever verbs/nouns/adjectives.***this original task lasted till the beginning of day three***


# Day 02 AND DAY THREE-ish


**Day Two**


We first worked on creating a basic layout for the *original task* and finished it. We then had to do a lot of guessing and checking to line up the **indices of the strings**. We finished the code when class ended, and just needed more guessing and checking. Rohit finished the index (the line up) after school, which gave us a big head start by the beginning of day three.


**Day Three**


**We made the GitHub repository** but...


***New Due Date(+1 Week) // DAY 03 PART TWO + RISHAB's RANT***

- display the original story


- Tests with one MadLib(WE NEED THREE MADLIBS)


- *Need 3 different MADLIBS*


- The Java program should be similar


     VVVVVVVVVVVVVVVVVVVV
     

*This is essentially a* ***String Nightmare***


This task was so much harder….(Then it needed to be)


***Rishab's Rant***


The original task was to have a SET made that we, the coding nerds(us duhhh) selected, and have SET positions for words(nouns, verbs, adj, etc), and that was it. BUT Mr Baez had realised he had portrayed our project wrong… He decided that we need to take a few steps back and take on a (essentially)completely different challenge. Now, instead of just the inputs we were using(the nouns, verbs, etc)… we now need to enter ANY MADLIB, NO MATTER HOW LONG, SHORT, OR THE VARYING AMOUNT OF BLANK WORDS!!!! This simple task grew exponentially harder, as now the code we used, we were using set pavements for the nouns, verbs, etc, but now it can vary any amount and can be anywhere in the sentence, obliterating our previous method. But not just that, we also needed a new input.. A MADLIB. Then Our Program should be able to scan this madlib and find where each (BLANK) space is!!!



# WRONG CODE BTW


# WRONG CODE VVV


# WRONG CODE VVV



**VVVV**


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


# ABOVE CODE IS NOT OUR FINALIZED CODE(THIS IS JUST TO SHOW YOU THAT WE DID WORK)




# Image Below is the Testing Values (Graded Table)


<img width="883" height="219" alt="image" src="https://github.com/user-attachments/assets/9d5e3bbf-2dde-493f-8540-d122c103288a" />




# Starting from Square 01 // DAY 4



Since we used set methods (specifically for the madlib and the verbs/adj/nouns) for the code, it would no longer apply for the new challenge, so we needed to start from square one. This was brutal, annoying, and frustrating as we had no idea what to do. We did not know how to approach this new project/task. 


**Day 4**


We did the carnival that Mr. Baez had set up in class, so there was no actual progress on the Madlib. But we did agree to brainstorm for Day 5 on how to start the code.


# Day 5 (Outside School)


    Scanner sc = new Scanner(System.in);
    System.out.println("Type your Madlib: ");
    String madlib = sc.nextLine();

    Scanner nounSC = new Scanner(madlib);
    nounSC.useDelimiter("(noun)");
    String first = nounSC.next();
    String part2 = nounSC.next();

    Scanner verbSC = new Scanner(part2);
    verbSC.useDelimiter("(verb)");
    String second = verbSC.next();
    String part3 = verbSC.next();

    Scanner adjectiveSC = new Scanner(part3);
    adjectiveSC.useDelimiter("(adjective)");
    String third = adjectiveSC.next();
    String fourth = adjectiveSC.next();
    
    int index1 = first.indexOf("(");
    first = first.substring(0, index1);
    first = first.substring(0, first.length() -1);
    // remove the surrounding parentheses/spaces from the second piece
    second = second.substring(1, second.length() - 1);
    third = third.substring(1, third.length() - 1);
    fourth = fourth.substring(1);
    
    
    String Madlibtemplate = first + " " + second + " " + third + " " + fourth;
    System.out.println(Madlibtemplate);
    }












# Final Code


    public static void main(String[] args) {                       // The code doesn't start here but the syntax is weird when copying and pasting it from the file so live with it
    //Test Case: The (noun) (verb) up the (adjective) tree.        

    //Input user MadLib
    Scanner sc = new Scanner(System.in);                           // Scanner class >>>   declares a variable named sc of the type Scanner , creates a new object (an instance) , Standard input stream
    System.out.println("Type your Madlib: ");                      // printing "Type your Madlib: "
    String madlib = sc.nextLine();                                 // The line of code reads an entire line of text entered by a user (the Madlib) and stores it in a variable called madlib

    //Scan for noun inside madlib
    Scanner nounSC = new Scanner(madlib);                          // 
    nounSC.useDelimiter("(noun)");                                 //
    String first = nounSC.next();                                  //
    String part2 = nounSC.next();                                  //

    //Scan for verb inside madlib
    Scanner verbSC = new Scanner(part2);                           //
    verbSC.useDelimiter("(verb)");                                 //
    String second = verbSC.next();                                 //
    String part3 = verbSC.next();                                  //

    
    Scanner adjectiveSC = new Scanner(part3);
    adjectiveSC.useDelimiter("(adjective)");
    String third = adjectiveSC.next();
    String fourth = adjectiveSC.next();

    //Using String methods to find sections in between the noun, verb, and adjective
    int index1 = first.indexOf("(");
    first = first.substring(0, index1);
    first = first.substring(0, first.length());
    second = second.substring(1, second.length() - 1);
    third = third.substring(1, third.length() - 1);
    fourth = fourth.substring(1);
    
    //Asking User to input a noun, verb, and adjective
    System.out.println("Type a noun: ");
    String noun = sc.nextLine();
    System.out.println("Type a verb: ");
    String verb = sc.nextLine();
    System.out.println("Type a adjective: ");
    String adjective = sc.nextLine();
    
    //Printing out modified Madlib
    System.out.println(first + noun + second + verb + third + adjective + fourth);




# Testing (with Mr. Baez)

"We can take a more **harder** approach and do that(he was pointing at the board and explaining what mr Baez explained to the class), our code fits all the requirements" -- ArshanthegGoat


# TEST ONE


<img width="1440" height="719" alt="Screenshot 2025-10-10 at 7 25 26 PM" src="https://github.com/user-attachments/assets/1f6e92d9-231e-4716-b1f2-eba3d8347331" />


# Test TWO


<img width="1440" height="713" alt="Screenshot 2025-10-10 at 7 28 13 PM" src="https://github.com/user-attachments/assets/4721a61c-a42e-41d9-8602-b9ab4d1531cb" />


# Test THREE


<img width="1440" height="714" alt="Screenshot 2025-10-10 at 7 30 22 PM" src="https://github.com/user-attachments/assets/1fb00077-f4b7-4afe-a64f-ce8db1317c86" />



# Summary







