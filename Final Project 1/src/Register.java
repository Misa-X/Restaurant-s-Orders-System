import java.text.NumberFormat;

public class Register {

    private final double tax = 0.06;
    private double subtotal;
    private double total;
    private double clientMoney = 500.0;
    private NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    Orders orders = new Orders();

    public Register(Orders orders) {
        this.orders = orders;
        orders.incrementOrderNumber();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }


    public double calculateSubtotal() {
        for (int i = 0; i < orders.getSize(); i++) {
            Items items = orders.getItem(i);
            subtotal += items.getPrice();
        }
        return subtotal;
    }

    public double calculateTax() {  //calculates the tax
        return subtotal * tax;
    }

    public double calculateTotal() {  //calculates total amount of payment
        total = subtotal + calculateTax();
        return total;
    }

    // calculates the time for delivery guy to arrive at customer's house
    public int calculateTime(int time){
        for(int i = 0; time < orders.getSize(); i++){

            if(orders.getSize() == i){
                time += i*5 ;
            }
        }
        return time;
    }


    public void clearPayment() {
        subtotal = 0;
        total = 0;
    }

    //checks if payment is sufficient or too much
    public String checkPayment(double payment) {
        if (payment == total) {
            return "Payment is enough.";
        } else if (payment > total) {
            return "Your Change: " + numberFormat.format(payment - total);
        } else{
            return "Please pay " + numberFormat.format(total - payment) + "more.";
        }

    }

    public String toString(){
        String reg = "";
        reg += "\t\t\t\t\t\t\t\t\tMimmo's Restaurant\n";
        reg += "=====================================================================================\n\n";
        reg += "Order No. "+ orders.getOrderNumber() + "\n";
        reg += "Delivery Guy: "+ orders.getDeliveryGuy()+ "\n";
        reg += "=====================================================================================\n\n";
        reg += orders.toString();
        reg += "=====================================================================================\n\n";
        reg += "Subtotal:\t\t" + numberFormat.format((calculateSubtotal()));
        reg += "\nTax:\t\t\t" + numberFormat.format(calculateTax());
        reg += "\nTotal:\t\t\t" + numberFormat.format(calculateTotal());
        reg += "\n=====================================================================================\n\n";

        return reg;
    }
}
