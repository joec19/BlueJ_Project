// Lab08v100.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08v100
{
    public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   // used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        }
        while (notFinished);
    }
}



class Palindrome
{
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
     */
    public static boolean isPal(String s)
    {
        String rev = new String();
        int len = s.length();
        for(int i=len-1; i>=0; i--)
            rev+=s.substring(i,i+1);
        return rev.equals(s);
    }  
   
    /*
     * Precondition:  s is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static boolean isLetter(String letter)
    {
        return letter.toLowerCase().compareTo("a") >= 0 && letter.compareTo("z") <= 0;
    }
   
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static String purge(String s)
    {
        String purged = new String();
        String letter = new String();
        int len = s.length();
        for(int i=0; i<=len-1; i++)
            letter = s.substring(i,i+1);
            if(isLetter(letter))
                purged+=letter;
        return purged;        // This statement is provided to allow initial compiling.
    }
   
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        String newS = purge(s);
        newS.toLowerCase();
        
        String rev = new String();
        int len = newS.length();
        for(int i=len-1; i>=0; i--)
            rev+=newS.substring(i,i+1);
        return rev.equals(newS) && !isPal(s);
    }
}

