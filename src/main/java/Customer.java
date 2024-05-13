import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> customerCollection;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerCollection = new ArrayList<Artwork>();
    }

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

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void setWallet(double amount){
        this.wallet = amount;
    }

    public ArrayList<Artwork> getCustomerCollection(){
        return this.customerCollection;
    }
}
