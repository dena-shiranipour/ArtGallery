import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;


    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Louvre");
    }


  //methods
    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("Louvre");

    }

}
