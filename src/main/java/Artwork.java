public class Artwork {

//    class attributes
    String title;
    Artist artist;
    int price;

//    class constructor
    public Artwork(String title, Artist artist, int price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

//    methods
//    title setter
    public void setTitle(String title){
        this.title = title;
    }

//    title getter
    public String getTitle(){
        return this.title;
    }

//    artist setter
    public void setArtist(Artist artist){
        this.artist = artist;
    }

//    artist getter
    public Artist getArtist(){
        return this.artist;
    }

//    price setter
    public void setPrice(int price){
        this.price = price;
    }

//    price getter
    public int getPrice(){
        return this.price;
    }

}
