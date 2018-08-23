/**
 * This program tells a little about me.
 * 
 * @author Anna Hughey
 * @version August 20, 2018
 */
public class Introduction
{
    public static void main(String[] args)
    {
        // here are some facts about me
        System.out.println("I was born in Greenville.");
        System.out.println("I went to Mauldin Middle.");
        System.out.println("I am in robotics club.");
        System.out.println("I have a twin sister and a little brother.");
        System.out.println("I like to read and listen to music.");
    
        // create variables and store values in them
        String name = "Anna";
        int birthYear = 2001;
        int currentYear = 2018;
    
        // What happens here?
        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);
    
        // Do some arithmetic
        int age = currentYear - birthYear;
    
        // Concatenate literal strings with variables
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
    
        /* You may notice that the age calculation is only correct if you've already had your birthday this year.
         * We can fix that using a boolean variable and some conditional logic.
         */
    
        // Change this value to false if you haven't had your birthday yet this year
        boolean hadBirthday = false;
    
        // Conditionally, subtract one from the age if the birthday hasn't occurred yet
        if (hadBirthday == false) {
            age -= 1;
        }
    
        //This output should always be correct
        System.out.println("My name is " + name + ", and I am " + age + " years old.");
   
    }
}  
    
  