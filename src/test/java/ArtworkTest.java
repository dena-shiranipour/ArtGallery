import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    // declare artwork object
    Artwork artwork;
    Artist artist;

    // intialise artwork object in the setup method
    @BeforeEach
    public void setUp(){
        artist = new Artist("Davinci");
        artwork = new Artwork("Mona Lisa", artist, 100);
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("BLah");
        assertThat(artwork.getTitle()).isEqualTo("BLah");
    }

    @Test
    public void canGetTitle(){
        String title = artwork.getTitle();
        assertThat(title).isEqualTo("Mona Lisa");
    }

    @Test
    public void canSetArtist(){
        Artist testArtist = new Artist("Munch");
        artwork.setArtist(testArtist);
        assertThat(artwork.getArtist()).isEqualTo(testArtist);
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(200);
        assertThat(artwork.getPrice()).isEqualTo(200);
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(100);
    }
}
