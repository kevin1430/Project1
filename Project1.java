
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class Project1 {

  
  public static void main(String[] args) {

    
    Scanner user_input = new Scanner(System.in);

    
    System.out.println("FBI Questionaire\n\n");

    System.out.println("Enter your first name and last name:");
    String name = user_input.nextLine();

    System.out.println("What are your top 3 strengths:");
    String threeStrengths = user_input.nextLine();

    System.out.println("What is your greatest weakness?");
    String greatestWeakness = user_input.nextLine();

    System.out.println("How will you handle the inevitable stress and pressure that comes with working for the FBI?");
    String handleStress = user_input.nextLine();

    System.out.println("\n\n\n\n");

    System.out.println("Name: " + name);
    System.out.println("Top Three Strengths: " + threeStrengths);
    System.out.println("Your Greatest Weakness: " + greatestWeakness);
    System.out.println("How you are able to handle stress and pressure: " + handleStress);
    



    System.out.println("Thank you for answering the questions.");
  }
}
