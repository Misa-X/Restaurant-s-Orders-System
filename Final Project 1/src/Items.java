public class Items {

    //fields
    private String name;
    private double price;
    private String category;

    //constructor
    public Items(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;

    }


    //accessors
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }

    //mutators
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCategory(String category){
        this.category = category;
    }


    @Override
    public String toString(){
        return String.format("%5s","Name: ")+ name+ String.format("%10s"," Category: "+ category)+ String.format("%18s"," Price: "+price);

    }






}
