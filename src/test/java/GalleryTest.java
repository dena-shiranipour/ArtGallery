import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

//    declare objects of type Gallery, Artwork and Artist
    Gallery gallery;
    Artwork artwork;
    Artist artist;

//    initialize these objects in the setup method
    @BeforeEach
    public void setUp(){
        artist = new Artist("Davinci");
        gallery = new Gallery("Louvre");
        artwork = new Artwork("Mona Lisa", artist, 100);
    }


  //methods
//    test for adding stock
    @Test
    public void canAddStock(){
        gallery.addStock(artwork);
//        check that the size of the gallery's stock arraylist changes from 0 to 1 after an artwork object is added
        assertThat(gallery.stock.size()).isEqualTo(1);
    }

//    test for getting stock
    @Test
    public void canGetStock(){
//        create a new empty array
        ArrayList<Artwork> test = new ArrayList<Artwork>();
//        check that the gallery's stock, which by default is an empty array, is equal to the test array above
        assertThat(gallery.getStock()).isEqualTo(test);
    }

//    test for counting stock
    @Test
    public void canGetStockCount(){
//        use size(), which gives us the length of the arraylist to check the number of items
        assertThat(gallery.getStockCount()).isEqualTo(0);
    }

//    test for getting the amount of money in the till
    @Test
    public void canGetTill(){
//        using the getter method, we can check that this is equal to its default value of zero
        assertThat(gallery.getTill()).isEqualTo(0);
    }

//    test for setting the money in the till
    @Test
    public void canSetTill(){
//        set this to test value
        gallery.setTill(10000);
//        use getter to check if this is now equal to the test value
        assertThat(gallery.getTill()).isEqualTo(10000);
    }

//    test for getting the name
    @Test
    public void canGetName(){
//        check that this is equal to the String passed into the Gallery's arguments in the setup
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

}
