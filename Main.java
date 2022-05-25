/********************************************
*	AUTHORS:	GIULIO VITTI, SAMUEL P
* COLLABORATORS: SABRINA BARRY, PROFESSOR ALOKA
*	LAST MODIFIED:	MAY 19, 2022
********************************************/

/********************************************
*	<TITLE OF PROGRAM>
PRESIDENTIAL BURGER
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <UML style list of static methods>
*********************************************
*	ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
*	<ex: Scanner= used for console input>
*********************************************/

// <IMPORTS GO HERE>

//This is where all the calling occurs from the PresidentialBurger class

public class Main 
{

  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    
   /***** INITIALIZATION SECTION *****/
    boolean greeting = true;
    final String INTRO = "Welcome to Presidential Burger!";
     final String START = "Choose a president to begin ordering!";
    char decision = 'Y';
    double price = 0;
   /***** DECLARATION SECTION *****/
    
     
    /***** INTRO SECTION *****/

    /***** INPUT SECTION *****/
   
    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
   
  /**** STATIC METHODS *****/  
do {
  if (greeting) {
      Main.printGreeting(INTRO, START);
    }
  greeting = false;
    
    System.out.println("\n\n1. George Washington\n");
    System.out.println("2. Abraham Lincoln\n");
    System.out.println("3. Franklin Delano Roosevelt\n");
    System.out.println("4. George W Bush\n");
    System.out.println("5. Donald Trump\n");   
  
   int option = UtilityBelt.readInt("Option: ", 1, 5);
       System.out.println("\nPick a specialty burger!\n");
    switch(option) {
      case 1: 
        //System.out.print("1. ");               
        Washington.firstSpecial();
        // System.out.print("2. ");
        Washington.secondSpecial();
        //this will total the cost of the 
        price += Washington.chooseSpecialty();       
        break;
      case 2: 
       // System.out.println("1. ");
        Lincoln.firstSpecial();
       // System.out.println("2. ");
        Lincoln.secondSpecial();
        price += Lincoln.chooseSpecialty ();
        break;
      case 3: 
        //System.out.println("1. ");
        Roosevelt.firstSpecial();
       // System.out.println("2. ");
        Roosevelt.secondSpecial();
        price += Roosevelt.chooseSpecialty();
        break;
      case 4: 
        //System.out.println("1. ");
        GeorgeWBush.firstSpecial();
       // System.out.println("2. ");
        GeorgeWBush.secondSpecial();
        price += GeorgeWBush.chooseSpecialty();
        break;
      case 5: 
        //System.out.print("1. ");
        Trump.firstSpecial();
      //  System.out.print("2. ");
        Trump.secondSpecial();
        price += Trump.chooseSpecialty();
        break;
    } 
       System.out.println();
       decision = UtilityBelt.readChar("Would you like to continue (y/n)? ", "YyNn");
    
     } while (decision == 'Y' || decision == 'y');
    
    System.out.printf("\nYour total is $%.2f! Have a great rest of your day!", price);
  }
public static void printGreeting (String INTRO, String START) {
  System.out.println();
System.out.printf("║%10s%-30s%10s║%n","", "******************************", "");
  System.out.printf("║%50s║","");
  System.out.printf("%n║ %-49s║%n", INTRO);
  System.out.printf("║%50s║","");
  System.out.printf("%n║ %-49s║%n", START);
  System.out.printf("║%50s║","");
System.out.printf("%n║%10s%-30s%10s║%n","", "******************************", "");
  System.out.println();
  }
  //for equals method compare two burgers 
  //with print statement you can always return false.
}