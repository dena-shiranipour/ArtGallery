public class Artwork {

    // attributes
    String title;
    Artist artist;
    int price;

    // constructor
    public Artwork(String title, Artist artist, int price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }

    public Artist getArtist(){
        return this.artist;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

}
