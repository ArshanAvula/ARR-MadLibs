import java.util.Scanner;
public class Madlib {
    public static void main(String[] args) {
    //Test Case: The (noun) (verb) up the (adjective) tree.

    //Input user MadLib
    Scanner sc = new Scanner(System.in);
    System.out.println("Type your Madlib: ");
    String madlib = sc.nextLine();

    //Scan for noun inside madlib
    Scanner nounSC = new Scanner(madlib);
    nounSC.useDelimiter("(noun)");
    String first = nounSC.next();
    String part2 = nounSC.next();

    //Scan for verb inside madlib
    Scanner verbSC = new Scanner(part2);
    verbSC.useDelimiter("(verb)");
    String second = verbSC.next();
    String part3 = verbSC.next();

    //Scan for adjective inside madlib
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
    }
}
