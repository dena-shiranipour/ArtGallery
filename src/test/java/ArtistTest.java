import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
//    declare object of type Artist
    Artist artist;

//    create a new object in the set up
    @BeforeEach
    public void setUp(){
        artist = new Artist("Leonardo davinci");
    }

//    test for setting the name
    @Test
    public void canSetName(){
//        create a test String and set the name to this
        String name = "Michaelangelo";
        artist.setName(name);
//        use getter to check if the artist's name is now equal to the test String
        assertThat(artist.getName()).isEqualTo("Michaelangelo");
    }

//    test for getting name
    @Test
    public void canGetName(){
//        use getter to check if this is equal to value passed into the artist object in the set up
        assertThat(artist.getName()).isEqualTo("Leonardo davinci");
    }

}
