/**
 * Represents <what is this class?>
 * 
 * @author <name>
 *
 **/

/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
<data, i.e. variables>
-----------------------------------------
<actions, i.e. methods>
-----------------------------------------
*/
public class Washington {
  private String burgerName;
  private String ingredients1;
  private String ingredients2;
  private String ingredients3;
  private double price;
  
  //assigning price is not necessary to calculate the burger

  //setters & getters
  public void setBurgerName(String burgerName){
    this.burgerName = burgerName;
  }
  public void setIngredients(String ingredients1) {
    this.ingredients1 = ingredients1;
  }
  public void setIngredients2(String ingredients2) {
    this.ingredients2 = ingredients2;
  }
  public void setIngredients3(String ingredients3) {
    this.ingredients3 = ingredients3;
  }

public String getBurgerName(){
    return burgerName;
  }
  public String getIngredients() {
    return ingredients1;
  }
  public String getIngredients2() {
    return ingredients2;
  }
  public String getIngredients3() {
    return ingredients3;
  }
  
  Washington () {
    this.burgerName = "Null";
    this.ingredients1 = "Null";
    this.ingredients2 = "Null";
    this.ingredients3 = "Null";
    this.price = 0;
  }
  
  Washington (String burgerName, String ingredients1, String ingredients2, String ingredients3, double price) {
    this.burgerName = burgerName;
    this.ingredients1 = ingredients1;
    this.ingredients2 = ingredients2;
    this.ingredients3 = ingredients3;
    this.price = price;
  }
  
public String toString () {
    String menu;
    menu = "";
    menu += String.format("║%12s%-31s%12s║\n", "", "******************************", "");
    menu += String.format("║ %-29s%22s%.0f ║", burgerName, "", price);
    menu += String.format("\n║ %-54s║\n",ingredients1);
    menu += String.format("║ %-54s║\n",ingredients2);
    menu += String.format("║ %-54s║\n",ingredients3);
    menu += String.format("║%12s%-31s%12s║\n", "", "******************************", "");
    return menu;
  }
  
  public static void firstSpecial () {
    Washington theWhiteHouse = new Washington("The White House", "One 4 oz mahi mahi patty with havarti, lettuce,", "cherry tomatoes, and tartar sauce served", "on sourdough", 15);
    System.out.println(theWhiteHouse.toString());
    System.out.println();
  }
  public static void secondSpecial () {
    Washington theMountVernon = new Washington("The Mount Vernon", "One 8 oz beef patty with monterey jack, lettuce,", "cherry tomatoes, bacon and pickles served with dijon", "mustard on sourdough", 21);
    System.out.println(theMountVernon.toString());
    System.out.println();
  }
//****for the burgers
  public static double chooseSpecialty () {      //changed to double for cost
    double price = 0;
    int option = UtilityBelt.readInt("Option: ", 1, 2); 
    int quantity = UtilityBelt.readInt("How many burgers would you like? ", 1, 1000);
    char drink;
    char sides;
    
    switch (option) {
      case 1: 
        
        drink = UtilityBelt.readChar("\nWould you like a free drink (y/n)? ", "YyNn");
        if(drink == 'Y' || drink == 'y') {
      Washington.printDrinks("Water", "Iced lemonade", "Iced tea", "Coca Cola");
          }
        
        sides = UtilityBelt.readChar("Would you like a side for the White House Burger (y/n)?", "YyNn");
        if(sides == 'Y' || sides == 'y') {
          Washington.printSides("House fries", "Caesar salad", "Roasted potatoes", "No sides", 5,6,7,0);
        }






        
        price += 15 * quantity;
        break;
        
      case 2:
        
        drink = UtilityBelt.readChar("\nWould you like a free drink (y/n)? ", "YyNn");
        if(drink == 'Y' || drink == 'y') {
      Washington.printDrinks("Water", "Iced lemonade", "Iced tea", "Coca Cola");
          }
        
        sides = UtilityBelt.readChar("Would you like a side for the Mount Vernon Burger (y/n)?", "YyNn");
        if(sides == 'Y' || sides == 'y') {
          Washington.printSides("House fries", "Caesar salad", "Roasted potatoes", 5,6,7);
        }
     
        price += 21 * quantity;
        break;
        
      } 
    
    
    
    
    return price * 1.08;
    
    }

  public static void printSides (String side1, String side2, String side3, int p1, int p2, int p3) {
    
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
    System.out.printf("║ %-20s%d ║\n", side1, p1);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side2, p2);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side3, p3);
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
  }

  public static void printDrinks (String d1, String d2, String d3, String d4) {
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
    System.out.printf("║ %-22s ║\n", d1);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-22s ║\n", d2);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-22s ║\n", d3);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-22s ║\n", d4);
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
  }
  
}