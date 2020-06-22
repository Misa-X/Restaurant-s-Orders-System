import java.util.ArrayList;


public class Menu {

    //create arrays to store menu items
    private ArrayList<Items> appetizers = new ArrayList<Items>();
    private ArrayList<Items> mainDish = new ArrayList<Items>();
    private ArrayList<Items> dessert = new ArrayList<Items>();
    private ArrayList<Items> drinks = new ArrayList<Items>();
    
    
    //constructor
    public Menu(){
        createMenu();
    }

    public Items getAppetizer(int index){
        return appetizers.get(index);

    }

    //accessors
    public String getAppetizerSize(){       //get number of appetizers
        return "Number of Appetizers in the menu: " + appetizers.size();
    }
    public Items getMainDish(int index){    //get specif main dish by index
        return mainDish.get(index);
    }
    public String getMainDishSize(){        //get number of main dishes
        return "Number of Main Dishes in the menu: " + mainDish.size();
    }
    public Items getDessert(int index){     //get specif dessert by index
        return dessert.get(index);
    }
    public String getDessertSize(){        //get number of desserts
        return "Number of Desserts in the menu: " + dessert.size();
    }
    public Items getDrinks(int index){     //get specific drink by index
        return drinks.get(index);
    }
    public String getDrinksSize(){         //get number of drinks
        return "Number of Drinks in the menu: " + drinks.size();  //get number of drinks
    }

    //formats and returns appetizers menu
    public String getAppetizersMenu(){
        String app = "";
        app += "\t\t\t\tAppetizers\n";
        app += "==========================================\n";
        app += "\tName\t\t\t\t\t\t\t\t\t\tPrice\n";

        for(int i =0; i < appetizers.size(); i++){
            Items appItem = appetizers.get(i);
            app += ("A"+(i+1)) + " "+ String.format("%10s", appItem.getName())+ "\t\t\t\t\t\t\t"+String.format("|%5s", appItem.getPrice())+"\n";
          }

        return app;
    }

    //formats and returns main dish menu
    public String getMainDishMenu(){
        String main = "";   //string builder
        main +="\t\t\t\tMain Dish\n";
        main += "==========================================\n";
        main += "\tName\t\t\t\t\t\t\t\t\t\tPrice\n";

        for(int i =0; i < mainDish.size(); i++){
            Items mainItem = mainDish.get(i);
            main += ("M"+(i+1))+" "+ String.format("%10s", mainItem.getName())+"\t\t\t\t\t\t\t"+ String.format("|%5s", mainItem.getPrice()) + ("\n");
        }
        return main.toString();
    }

    //formats and returns dessert menu
    public String getDessertMenu(){
        String des = "";   //string builder
        des +="\t\t\t\tDessert\n";
        des += "==========================================\n";
        des += "\tName\t\t\t\t\t\t\t\t\t\tPrice\n";

        for(int i =0; i < dessert.size(); i++){
            Items desItem = dessert.get(i);
            des+= ("D"+(i+1))+" "+ String.format("%8s", desItem.getName())+ "\t\t\t\t\t\t\t"+ String.format("|%5s", desItem.getPrice() + ("\n"));
        }
        return des;
    }

    //formats and returns drinks menu
    public String getDrinksMenu(){
        String dri = "";   //string builder
        dri +="\t\t\t\tDrinks\n";
        dri += "==========================================\n";
        dri += "\tName\t\t\t\t\t\t\t\t\t\tPrice\n";

        for(int i =0; i < drinks.size(); i++){
            Items driItem = drinks.get(i);
            dri+=("B"+(i+1))+" "+ String.format("%-10s", driItem.getName())+ "\t\t\t\t\t\t\t"+ String.format("|%5s", driItem.getPrice()+("\n"));
        }
        return dri;
    }

    //toString to print the whole menu
    public String toString(){
        String menu  = " ";  //string builder

        menu +="\t\t\t\t\t\t\t\t\t\t\t\tMimmo's Restaurant\n";
        menu +="\t\t\t=====================================================================================\n\n";
        menu += getAppetizersMenu()+ "\n";
        menu += getMainDishMenu()+ "\n";
        menu += getDessertMenu()+ "\n";
        menu += getDrinksMenu()+ "\n";

        return menu;


    }

    //add items to the arrays
    private void createMenu() {


        //appetizers
        appetizers.add(new Items("Fresh Guacamole\t", "Appetizer", 4.0));
        appetizers.add(new Items("Boneless Wings\t", "Appetizer", 6.5));
        appetizers.add(new Items("Bone-in Wings\t", "Appetizer", 6.0));
        appetizers.add(new Items("Fried Pickles\t", "Appetizer", 4.0));
        appetizers.add(new Items("Chips and Salsa\t", "Appetizer", 2.35));
        appetizers.add(new Items("Nachos with Chicken", "Appetizer", 3.75));
        appetizers.add(new Items("Nachos with Beef\t", "Appetizer", 3.0));
        appetizers.add(new Items("Garlic Bread\t\t", "Appetizer", 5.0));

        //main dishes
        mainDish.add(new Items("Mushroom Burger\t", "Main Dish", 13.0));
        mainDish.add(new Items("Queso Burger\t\t", "Main Dish", 16.0));
        mainDish.add(new Items("Chili Burger\t\t", "Main Dish", 16.0));
        mainDish.add(new Items("Fish and Chips\t", "Main Dish", 11.0));
        mainDish.add(new Items("Ribs and Chips\t", "Main Dish", 13.25));
        mainDish.add(new Items("Spicy Shrimp Tacos", "Main Dish", 14.0));
        mainDish.add(new Items("Chicken Tacos\t", "Main Dish", 11.25));
        mainDish.add(new Items("Chicken Pasta\t", "Main Dish", 20.0));

        //desserts
        dessert.add(new Items("Banana Milk-Shake", "Dessert", 8.5));
        dessert.add(new Items("CheeseCake\t\t", "Dessert", 8.0));
        dessert.add(new Items("Apple Pie\t\t", "Dessert", 9.0));
        dessert.add(new Items("Chocolate Cake\t", "Dessert", 11.0));
        dessert.add(new Items("Caramel Ice-cream", "Dessert", 13.25));
        dessert.add(new Items("Vanilla Ice-cream", "Dessert", 7.0));
        dessert.add(new Items("Brownies\t\t\t", "Dessert", 7.0));
        dessert.add(new Items("Chocolate Milk-Shake", "Dessert", 15.0));

        //drinks
        drinks.add(new Items("Water\t\t\t", "Drinks", 5.0));
        drinks.add(new Items("Orange Juice\t\t", "Drinks", 6.0));
        drinks.add(new Items("Soft Drink\t\t", "Drinks", 7.0));
        drinks.add(new Items("Cocktail\t\t\t", "Drinks", 14.0));
        drinks.add(new Items("Red Wine\t\t\t", "Drinks", 15.0));
        drinks.add(new Items("Beer\t\t\t\t", "Drinks", 12.0));
        drinks.add(new Items("Tea\t\t\t", "Drinks", 5.0));
        drinks.add(new Items("Coffee\t\t\t", "Drinks", 7.0));



    }
}
