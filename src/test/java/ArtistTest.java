import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Leonardo davinci");
    }

    @Test
    public void canSetName(){
        String name = "Michaelangelo";
        artist.setName(name);
        assertThat(artist.getName()).isEqualTo("Michaelangelo");
    }

    @Test
    public void canGetName(){
        assertThat(artist.getName()).isEqualTo("Leonardo davinci");
    }

}
