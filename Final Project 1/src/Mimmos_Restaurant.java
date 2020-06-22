import java.util.Scanner;


public class Mimmos_Restaurant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Orders orders1 = new Orders();
        Register reg = new Register(orders1);

        //welcome message
        System.out.println("\n\t\t\t\t\t\t\t\t*** Welcome to Mimmo's Restaurant ***");
        System.out.println("\t\t\t\t\t\t\t\t\tIt's our pleasure to serve you \n");
        System.out.println("\t\t\t\t\t\t\t******************************************** \n");


        System.out.println("Enter 'V' to view our menu!");
        String ans = input.next();

        //displays error message until customer enters the correct input
        while (!(ans.equalsIgnoreCase("V"))) {
            System.out.println("Invalid input. Please enter again: ");
            ans = input.next();
        }

        //if input = v display menu
        if (ans.equalsIgnoreCase("V")) {
            System.out.println(menu);

            //customer places order until he wishes to stop
            boolean bool = true;
            while (bool) {

                //customer enters id of the item and that item of the particular id entered is added to the orders array
                System.out.println("Enter ID of item to order: (Enter 'view' to view your orders list)");
                String itemId = input.next().toUpperCase();
                for (int i = 0; i < 10; i++) {
                    if (itemId.equals("A" + i)) {
                        orders1.addItem(menu.getAppetizer(i-1));      //adding chosen item from appetizers to orders array
                    }
                    if (itemId.equals("M" + i)) {
                        orders1.addItem(menu.getMainDish(i-1));      //adding chosen item from main dishes to orders array
                    }
                    if (itemId.equals("D" + i)) {
                        orders1.addItem(menu.getDessert(i-1));      //adding chosen item from desserts to orders array
                    }
                    if (itemId.equals("B" + i)) {
                        orders1.addItem(menu.getDrinks(i-1));       //adding chosen item from drinks to orders array
                    }

                }
                //prints the orders arrays after order has been placed by customer and asks if they need anything else
                if (itemId.equals("VIEW")) {
                    System.out.println("\n--------------------------------------------------------");
                    System.out.println(reg.orders);      //prints the orders arrays after order has been placed by customer
                    System.out.println("--------------------------------------------------------\n");
                    System.out.println("Anything else?");
                    System.out.println("1. Add item to order");
                    System.out.println("2. Cancel order");
                    System.out.println("3. Pay");
                    String edit = input.next();

                    //customer gets the chance to add item he might have forgotten
                    if(edit.equals("1")){
                        System.out.println("Enter ID of item to order: (Enter 'view' to finish order)");
                        itemId = input.next().toUpperCase();
                        for (int i = -1; i < 10; i++) {
                            if (itemId.equals("A" + i)) {
                                orders1.addItem(menu.getAppetizer(i-1));
                            }
                            if (itemId.equals("M" + i)) {
                                orders1.addItem(menu.getMainDish(i-1));
                            }
                            if (itemId.equals("D" + i)) {
                                orders1.addItem(menu.getDessert(i-1));
                            }
                            if (itemId.equals("B" + i)) {
                                orders1.addItem(menu.getDrinks(i-1));
                            }

                        }
                        //after item has been added this is printed
                        System.out.println("Item successfully added to order");
                        System.out.println(reg.toString());              //displays the payment receipt
                        System.out.println("Please enter amount to pay:");
                        double payment = input.nextDouble();
                        System.out.println(reg.checkPayment(payment));   // checks if payment is enough or too much
                        System.out.println("\nThe delivery guy will arrive in "+ reg.calculateTime(0) + " minutes!");      // calculates the time for delivery guy to arrive at customer's house

                        System.out.println("\n\t\t\t\t\t\t\t\t*** Thank you for choosing our services ***");
                    }

                    //clears orders arrays if customer decides to cancel order
                    if(edit.equals("2")){
                        orders1.clearOrder();
                        System.out.println("Order successfully canceled");
                        System.out.println("Thank you, hope to see you next time");
                    }

                    //displays payment receipt and checks if payment from customer is enough or too much
                    if(edit.equals("3")){
                        System.out.println(reg.toString());

                        System.out.println("Please enter amount to pay:");
                        double payment = input.nextDouble();
                        System.out.println(reg.checkPayment(payment));
                        System.out.println("\nThe delivery guy will arrive in "+ reg.calculateTime(0) + " minutes!");      // calculates the time for delivery guy to arrive at customer's house
                        System.out.println("\n\t\t\t\t\t\t\t\t*** Thank you for choosing our services ***");

                    }
                    bool = false;
                }
            }
        }else {

            System.out.println(("Invalid input. Please enter again: "));

        }
    }
}

    //end of program