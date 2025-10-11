# ARR-MadLibs


This Read Me was made by Rishab Trehan(ReadME+ ~~Slide Design for presentations~~), Arshan Avula(Coder 01), and Rohit Denduluri(Coder 02).


# Day 01 // Updated 
Day 01 was the introduction to this project. We were tasked with creating a Program that inputs verbs, adjectives, and nouns into a "random" Madlib! This random Madlib wasn't as random as it needed to be, but the amount of verbs/nouns/adjectives was spread out throughout the code. To begin with, we were learning and brainstorming how to structure this program. We were originally tasked with creating a different program, with a set Madlib... this meant we could use a method learnt in **1.1.7 (String Methods)**, so that we can replace a specific portion of the set string(Madlib) and replace it with whatever verbs/nouns/adjectives.***this original task lasted till the beginning of day three***


# Day 02 AND DAY THREE-ish


**Day Two**


We first worked on creating a basic layout for the *original task* and finished it. We then had to do a lot of guessing and checking to line up the **indices of the strings**. We finished the code when class ended, and just needed more guessing and checking. Rohit finished the index (the line-up) after school, which gave us a big head start by the beginning of day three.


**Day Three**


**We made the GitHub repository** but...


***New Due Date(+1 Week) // DAY 03 PART TWO + RISHAB's RANT***

- display the original story


- Tests with one MadLib(WE NEED THREE MADLIBS)


- *Need 3 different MADLIBS*


- The Java program should be similar


     VVVVVVVVVVVVVVVVVVVV
     

*This is essentially a* ***String Nightmare***


The original task was to create a set that we, the coding nerds (us, duh), selected, and to assign set positions to words (nouns, verbs, adjectives, etc.). That was it. But Mr Baez had realised he had portrayed our project wrong… He decided that we need to take a few steps back and take on a (essentially)completely different challenge. Now, instead of just the inputs we were using(the nouns, verbs, etc)… we now need to enter any MadLib, no matter how long, short, or the varying amount of blank words! This simple task grew exponentially harder, as now the code we used was using set pavements for nouns, verbs, etc., but now it can vary in any amount and can be anywhere in the sentence, obliterating our previous method. But not just that, we also needed a new input.. A Madlib. Then Our Program should be able to scan this madlib and find where each (BLANK) space is!!!


# Original Task Code


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



# Starting from Square 01 // DAY 4



Since we used set methods (specifically for the madlib and the verbs/adj/nouns) for the code, it would no longer apply for the new challenge, so we needed to start from square one. This was brutal, annoying, and frustrating, as we had no idea what to do. We did not know how to approach this new project/task. 


**Day 4**


We did the carnival that Mr. Baez had set up in class, so there was no actual progress on the Madlib. But we did agree to brainstorm for Day 5 on how to start the code. And Arhsan specifically studied Substring.


# Day 5 (Outside School)


Arshan and Rohit wrote code both inside and outside school to get ahead once again.


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



# Testing (with Mr. Baez)

"We can take a more **harder** approach and do that(he was pointing at the board and explaining what mr Baez explained to the class), our code fits all the requirements" -- Arshan


# TEST ONE


Given Madlib by Mr Baez, the code was successfully able to "transform" it into a ***completed*** madlib


<img width="1440" height="719" alt="Screenshot 2025-10-10 at 7 25 26 PM" src="https://github.com/user-attachments/assets/1f6e92d9-231e-4716-b1f2-eba3d8347331" />


# Test TWO


Given Madlib by Mr Baez, the code was successfully able to "transform" it into a ***completed*** madlib


<img width="1440" height="713" alt="Screenshot 2025-10-10 at 7 28 13 PM" src="https://github.com/user-attachments/assets/4721a61c-a42e-41d9-8602-b9ab4d1531cb" />


# Test THREE


This Madlib was created by Arshan and Rohit, it was tested by me, and it worked. Our Madlib worked accurately with any sentence structure.


<img width="1440" height="714" alt="Screenshot 2025-10-10 at 8 44 01 PM" src="https://github.com/user-attachments/assets/26ba90ef-fe83-44f6-9877-9be828023c70" />



# Relations!!!


***1.2.7 Honorable mention***


1.2.7 is an ***Honorable mention*** because of how it helped us with our previous code for our previous task. It allowed us to track the words in the Madlib set and gave us the ability to replace the verbs, adjectives, and nouns with the users' nouns, adjectives, and verbs. This gave us the ability to complete the code, which later had to be completely revamped with different methods


**1.2.9(the most obvious)**

1.2.9 introduced the scanner, which is, by the way, like 90% of the code. The scanner, in general, allowed us to get a user's input, find the placeholders in the sentence(s) (Nouns, Adjectives, Verbs). Then it scans the input sentence(Madlib) to separate the sections around the placeholders to insert the user’s words later. After the user's words had been input and "stored", it is then combined to make the completed madlib. 

**VVV These are all lines from the Code VVV**

    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
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
    String noun = sc.nextLine();
    String verb = sc.nextLine();
    String adjective = sc.nextLine();




**1.2.7 Part 2(Substrings)**


Substrings were another main part of our code, as they allowed us to clean up the code. Let me explain. The substrings were finding the sections in between the verbs, adjectives, and nouns. so it is something like this: **SUBSTRINGSUBSTRING** ***(noun)*** **SUBSTRINGSUBSTRING** ***(verb)*** **SUBSTRINGSUBSTRING** ***(adjective)*** **SUBSTRINGSUBSTRING** . Now this was able to clear the code. The substring(s) is present from ***lines 31 - 35***:


    int index1 = first.indexOf("(");
    first = first.substring(0, index1);                    // Line 31
    first = first.substring(0, first.length());            // Line 32
    second = second.substring(1, second.length() - 1);     // Line 33
    third = third.substring(1, third.length() - 1);        // Line 34
    fourth = fourth.substring(1);                          // Line 35

>>>
>>>
>>>


# Final CODE (with comments for each paragraph)


    public static void main(String[] args) {                       
    //Test Case: The (noun) (verb) up the (adjective) tree. 

    //Input user MadLib
    Scanner sc = new Scanner(System.in);                           
    System.out.println("Type your Madlib: ");    // asks the user(input) then is saved as the variable Madlib
    String madlib = sc.nextLine();                                 

    //Scan for noun inside madlib
    Scanner nounSC = new Scanner(madlib);                           
    nounSC.useDelimiter("(noun)");      // This part of the code is "scanning" for the noun placeholder by splitting the sentence into 2 parts, 
    String first = nounSC.next();       // (first and part 2) these parts are then saved(variables) to reconstruct the sentence LATER
    String part2 = nounSC.next();                                  

    //Scan for verb inside madlib
    Scanner verbSC = new Scanner(part2); // this is the same as the prevoius ^^^ explanation, just replaced using verb
    verbSC.useDelimiter("(verb)"); // This part of the code is "scanning" for the VERB placeholder by splitting the sentence into 2 parts, 
    String second = verbSC.next(); // (second and part 3)these parts are then saved(variables) to reconstruct the sentence LATER
    String part3 = verbSC.next();                                  

    
    Scanner adjectiveSC = new Scanner(part3); // this is the same as the prevoius two ^^^ explanations, just replaced using adjectives
    adjectiveSC.useDelimiter("(adjective)");  // This part of the code is "scanning" for the adjective placeholder by splitting the sentence into 2 parts, 
    String third = adjectiveSC.next();        // (third and fourth)these parts are then saved(variables) to reconstruct the sentence LATER
    String fourth = adjectiveSC.next();

    //Using String methods to find sections in between the noun, verb, and adjective
    int index1 = first.indexOf("(");
    first = first.substring(0, index1);
    first = first.substring(0, first.length());        // This part of the code removes extra characters like parentheses, using substring to keep 
    second = second.substring(1, second.length() - 1); // only the important parts of the code.
    third = third.substring(1, third.length() - 1);
    fourth = fourth.substring(1);
    
    //Asking User to input a noun, verb, and adjective
    System.out.println("Type a noun: ");
    String noun = sc.nextLine();
    System.out.println("Type a verb: ");                 // this code saves the inputs from the user for noun, verb, and adjective as variables for each other
    String verb = sc.nextLine();                         // for later use...
    System.out.println("Type a adjective: ");
    String adjective = sc.nextLine();
    
    //Printing out modified Madlib
    System.out.println(first + noun + second + verb + third + adjective + fourth);    // this is the completed sentence by combining the parts in between
    //                                                                                //  the sentences and also the input verbs, adjectives, and nouns


# CODE EXPLANATION


IN SUMMARY, the code asks the user to insert a madlib, and the code then proceeds to save this madlib for later use. Then the code uses scanners to look for nouns, verbs, and adjectives, and then splits the sentence between each placeholder. creating multiple halves for each placeholder. Then the code has a bunch of junk, which is then removed by the substring, and it makes sure to retain only the important parts of the code. Then the code is asking the user again for new inputs (verb, adjective, and nouns). The user finally answers the questions, and then the code prints out the halves combined to create a new sentence (which is now the completed madlib.


# Requirements (Completed)

- a class definition header that matches the file name (***Completed***)

- a main method for the program (***Completed***)

- the use of camelCase when appropriate (***Completed***)

- comments describing the algorithms (***Completed***)

- a variable containing the incomplete Mad Lib (***Completed***)

- only String methods defined in the AP CSA Java Quick Reference (***Completed***)

- algorithm(s) that process user input(***Completed***)

- algorithm(s) to parse for the parts of speech to replace (***Completed***)

- algorithm(s) to parse for sections of the Mad Lib to include (***Completed***)

- various prompts to keep the user on track (***Completed***)

- a final print statement to display the completed story (***Completed***)
