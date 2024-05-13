import java.util.ArrayList;

public class Gallery {

//    class attributes
    private String name;
    public double till;
    public ArrayList<Artwork> stock;

//    class constructor
//    default values - till starts at zero and stock starts as an empty array of Artwork objects
    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }

//    methods
//    adding artwork to gallery's stock
    public void addStock(Artwork artwork){
        stock.add(artwork);
    }

//    counting stock
    public int getStockCount(){
        return this.stock.size();
    }

//    stock getter
    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

//    till getter
    public double getTill(){
        return this.till;
    }

//    till setter
    public void setTill(double amount){
        this.till = amount;
    }

//    name getter
    public String getName(){
        return this.name;
    }

//    public void setName(String name){
//        this.name = name;
//    }























}
