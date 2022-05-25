
public class Trump {
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
  public void setIngredients3 (String ingredients3) {
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
  
  Trump() {
    this.burgerName = "Null";
    this.ingredients1 = "Null";
    this.ingredients2 = "Null";
    this.ingredients3 = "Null";
    this.price = 0;
  }
  Trump (String burgerName, String ingredients1, String ingredients2, String ingredients3, double price) {
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
    Trump theMagaMachine = new Trump("The Maga Machine", "One 16 oz Kobe beef patty with American cheddar,", "lettuce, cherry tomatoes, and Thousand Island", "dressing, served on a sesame bun", 22);
    System.out.println(theMagaMachine.toString());
    System.out.println();
  }
  
  public static void secondSpecial () {
    Trump yourFired = new Trump("You're Fired", "One 16 oz beef patty with provolone, lettuce,", "cherry tomatoes, bacon and pickles served with", "Jalapeno on rye", 30);
    System.out.println(yourFired.toString());
    System.out.println();
  }
  public static double chooseSpecialty () {      //changed to double for cost
    double price = 0;
    int option = UtilityBelt.readInt("Option: ", 1, 2); 
    int quantity = UtilityBelt.readInt("\nHow many burgers would you like? ",1,1000);
    switch (option) {
      case 1:
        System.out.println("\nPick a side for the Maga Machine: \n");
        price += 22 * quantity;
        break;

      case 2: 
        System.out.println("\nPick a side for the Your're Fired burger: \n");
        price += 30 * quantity;
        break;
    }
    
    Trump.printSides("House fries", "Caesar salad", "Roasted potatoes", "Garlic chili fries", "No sides", 5,6,7,9,0);
    
    int selection = UtilityBelt.readInt("\nOption: ",1,5);
    int quantity1;
    if (selection != 5) {
       quantity1 = UtilityBelt.readInt("\nHow many sides would you like? ", 1, 1000);
    } else {
      quantity1 = 0;
    }
    
    switch (selection) {
      case 1:
        
        price += 5 * quantity1;
        break;

      case 2: 
        
        price += 6 * quantity1;
        break;
        
      case 3:
        
        price += 7 * quantity1;
        break;

      case 4:

        price += 9 * quantity1;
        break;
        
      case 5:
        price += 0;
        break;
    }
    return price * 1.08;
  }

  public static void printSides (String side1, String side2, String side3, String side4, String side5, int p1, int p2, int p3, int p4, int p5) {
    
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
    System.out.printf("║ %-20s%d ║\n", side1, p1);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side2, p2);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side3, p3);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side4, p4);
    System.out.printf("║%-22s ║\n","");
    System.out.printf("║ %-20s%d ║\n", side5, p5);
    System.out.printf("║%4s%-14s%4s ║\n", "","**********", "");
  }
  
}
