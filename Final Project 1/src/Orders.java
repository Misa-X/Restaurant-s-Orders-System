import java.util.ArrayList;
import java.util.Random; // to choose a random number for a delivery guy of a particular order

public class Orders {

    //fields
    private static int orderNumber = 0; //static so all instances refer back to the variable
    private ArrayList<Items> orders = new ArrayList<Items>();

    //constructors
    public Orders() {
    }

    //accessors and mutators
    public Items getItem(int index) {  //get a particular item from order
        return orders.get(index);
    }

    public void addItem(Items item) { // add item to the order
        orders.add(item);
    }

    //methods
    public void clearOrder() {  //clear all the order
        orders.clear();
    }

    public void deleteItem(Items item) {  //delete a particular item from order by index
        orders.remove(item);
    }

    public int getSize() {  // gets number of items in order
        return orders.size();
    }

    public int getOrderNumber() {  // gets order number
        return orderNumber;
    }

    public void incrementOrderNumber() {  // increments order number
        orderNumber++;
    }

    //gets a random server
    public String getDeliveryGuy() {
        Random rand = new Random();
        int number = rand.nextInt(8) + 1;

        switch (number) {
            case 1:
                return "Steve";

            case 2:
                return "Jaden";

            case 3:
                return "Auman";

            case 4:
                return "Smith";

            case 5:
                return "Aurelio";

            case 6:
                return "James";

            case 7:
                return "John";

            case 8:
                return "Jacob";

            default:
                return "No Delivery Guy Available";
        }
    }

    public String toString() {
        String order = "";
        for (int i = 0; i < orders.size(); i++) {
            order += orders.get(i).toString() + "\n\n";
        }
        return order;
    }
}
