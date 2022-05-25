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
public class Lincoln {
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
  public void setIngredients1(String ingredients1) {
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
  public String getIngredients1() {
    return ingredients1;
  }
  public String getIngredients2() {
    return ingredients2;
  }
  public String getIngredients3() {
    return ingredients3;
  }
  
  Lincoln () {
    this.burgerName = "Null";
    this.ingredients1 = "Null";
    this.ingredients2 = "Null";
    this.ingredients3 = "Null";
    this.price = 0;
  }
  Lincoln (String burgerName, String ingredients1, String ingredients2, String ingredients3, double price) {
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
    Lincoln theCivilWar = new Lincoln("The Civil War", "Three 8 oz Angus patties with pepper jack, red", "lettuce, cherry tomatoes, and Kentucky special sauce,", "with hickory smoked bacon served on whole wheat bun", 25);
    System.out.println(theCivilWar.toString());
    System.out.println();
  }
  public static void secondSpecial () {
    Lincoln theCabin = new Lincoln("The Old Cabin", "One 8 oz grilled beef patty with monterey jack,", "hickory smoked bacon, lettuce, grilled onions,", "and dijon mustard on a sesame bun", 18);
    System.out.println(theCabin.toString());
    System.out.println();
  }
//****for the burgers
  public static double chooseSpecialty () {      //changed to double for cost
    double price = 0;
    int option = UtilityBelt.readInt("Option: ", 1, 2); 
    int quantity = UtilityBelt.readInt("How many burgers would you like? ", 1, 1000);
    switch (option) {
      case 1: 
        System.out.println("\nPick a side for the Civil War burger: \n");
        price += 25 * quantity;
        
        break;
      case 2:
        System.out.println("\nPick a side for the Old Cabin burger: \n");
        price += 18 * quantity;
        break;
    }

    Lincoln.printSides("House fries", "Corned beef", "Roasted potatoes","No sides",5,4,7,0);
    
    int selection = UtilityBelt.readInt("\nOption: ", 1,4);

int quantity1;
    
    if (selection != 4) {
       quantity1 = UtilityBelt.readInt("\nHow many sides would you like? ", 1, 1000);
    } else {
      quantity1 = 0;
    }
    
    switch (selection) {
      case 1: 
        price += 5 * quantity1;
        break;
      case 2: 
        price += 4 * quantity1;
        break;
      case 3:
        price += 7 * quantity1;
        break;
      case 4:
        price += 0;
        break;
    }
    return price * 1.08;
    }

  public static void printSides (String side1, String side2, String side3, String side4, int p1, int p2, int p3, int p4) {
    
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
    System.out.printf("║ %-20s%d ║\n", side1, p1);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side2, p2);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side3, p3);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side4, p4);
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
  }
  
}
