import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

//    declare object of type Artwork
    Artwork artwork;
    Artist artist;

//    initialize objects of type Artwork and Artist (as this is required by the Artwork object) in the setup method
    @BeforeEach
    public void setUp(){
        artist = new Artist("Davinci");
        artwork = new Artwork("Mona Lisa", artist, 100);
    }

//    test for setting title
    @Test
    public void canSetTitle(){
//        set title to test String
        artwork.setTitle("BLah");
//        check that the title is now equal to test
        assertThat(artwork.getTitle()).isEqualTo("BLah");
    }

//    test for getting title
    @Test
    public void canGetTitle(){
//      check that artwork's title is equal to the value passed in to it's constructor in the setup
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

//    test for setting artist
    @Test
    public void canSetArtist(){
//        set artist name to test String
        Artist testArtist = new Artist("Munch");
        artwork.setArtist(testArtist);
//        check if the artist's name is now equal to the test
        assertThat(artwork.getArtist()).isEqualTo(testArtist);
    }

//    test for getting artist
    @Test
    public void canGetArtist(){
//        
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

//    test for setting price
    @Test
    public void canSetPrice(){
        artwork.setPrice(200);
        assertThat(artwork.getPrice()).isEqualTo(200);
    }

//    test for getting price
    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(100);
    }
}
