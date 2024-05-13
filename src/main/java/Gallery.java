import java.util.ArrayList;

public class Gallery {

    //attributes
    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    //constructor

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();

    }

    //methods
    public void addStock(Artwork artwork){
        stock.add(artwork);
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(double amount){
        this.till = amount;
    }

    public String getName(){
        return this.name;
    }

//    public void setName(String name){
//        this.name = name;
//    }























}
