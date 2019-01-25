package edu.gatech.oad.antlab.person;
import java.util.Random;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Clair Ozburn
 * @version 1.2
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person2(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        //Person 2 put your implementation here
        Random indexGen = new Random();
        char[] outputArr = new char[input.length()];
        char[] inputArr = input.toCharArray();
        int inputLength = input.length();
        int remainingLength = inputLength;
        for(int i = 0; i < inputLength; i++) {
            int randIndex = indexGen.nextInt(remainingLength);
            outputArr[i] = inputArr[randIndex];
            remainingLength--;
        }
        System.out.println(outputArr[0]);
        return (new String(outputArr));
    }
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }
}