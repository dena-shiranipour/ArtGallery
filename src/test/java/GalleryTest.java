import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Davinci");
        gallery = new Gallery("Louvre");
        artwork = new Artwork("Mona Lisa", artist, 100);
    }


  //methods
    @Test
    public void canAddStock(){
        gallery.addStock(artwork);
//        check that the size of the gallery's stock arraylist changes from 0 to 1 after an artwork object is added
        assertThat(gallery.stock.size()).isEqualTo(1);
    }

    @Test
    public void canGetStock(){
        ArrayList<Artwork> test = new ArrayList<Artwork>();
        assertThat(gallery.getStock()).isEqualTo(test);
    }

    @Test
    public void canGetStockCount(){
        assertThat(gallery.getStockCount()).isEqualTo(0);
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(10000);
        assertThat(gallery.getTill()).isEqualTo(10000);
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

}
