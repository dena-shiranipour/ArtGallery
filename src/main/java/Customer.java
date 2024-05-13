import java.util.ArrayList;

public class Customer {

//    class attributes
    private String name;
    private double wallet;
    private ArrayList<Artwork> customerCollection;

//    class constructor
//    default values - customer's collection starts as an empty array of Artwork objects
    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerCollection = new ArrayList<Artwork>();
    }

//    method for buying artwork
    public void buyArtwork(Artwork artwork, Gallery gallery){
//        remove artwork from gallery's arraylist
        gallery.stock.remove(artwork);
//        add the same artwork to the customer's arraylist
        customerCollection.add(artwork);
//        subtract the price of the artwork from the customer's wallet
        this.wallet -= artwork.getPrice();
//        add the price of the artwork to the gallery's till
        gallery.till += artwork.getPrice();
    }

//    name getter
    public String getName(){
        return this.name;
    }

//    name setter
    public void setName(String newName){
        this.name = newName;
    }

//    wallet getter
    public double getWallet(){
        return this.wallet;
    }

//    wallet setter
    public void setWallet(double amount){
        this.wallet = amount;
    }

//    customer's collection getter
    public ArrayList<Artwork> getCustomerCollection(){
        return this.customerCollection;
    }
}
