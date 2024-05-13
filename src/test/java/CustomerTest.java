import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork artwork;
    Gallery gallery;
    Artist artist;

//    in the setup, we need to create all four objects since they are required to test all methods
//    buyArtwork requires objects of type Artwork (which requires an Artist object) and Gallery
//    a Customer object is also needed to test it's own methods
    @BeforeEach
    public void setUp(){
        customer = new Customer("Robbie", 1000);
        artist = new Artist("Davinci");
        artwork = new Artwork("Mona Lisa", artist, 100);
        gallery = new Gallery("Louvre");
    }

    // check if the value of the wallet is decreased by the price of the artwork
    @Test
    public void doesBuyingArtWorkChangeCustomersWallet(){
        customer.buyArtwork(artwork, gallery);
        assertThat(customer.getWallet()).isEqualTo(900);
    }

    // check if the value of the till has increased by the price of the artwork
    @Test
    public void doesBuyingArtWorkChangeGallerysTill(){
//        call the buy artwork method on customer
        customer.buyArtwork(artwork, gallery);
//        check if till is now equal to the price of the artwork declared in the setup
        assertThat(gallery.getTill()).isEqualTo(100);
    }

    // check if the customer's collection is no longer an empty array after buying artwork
    @Test
    public void doesBuyingArtWorkChangeCustomersCollection(){
//        create empty arraylist, as this is the default customer collection
        ArrayList<Artwork> test = new ArrayList<Artwork>();
//        call the buy artwork method on customer
        customer.buyArtwork(artwork, gallery);
//        check if the customer collection is not the same as the empty arraylist
        assertThat(customer.getCustomerCollection()).isNotSameAs(test);
    }

    // check if artwork is removed from the gallery stock
    @Test
    public void canRemoveItemFromGalleryStock(){
//        create empty arraylist
//        as the gallery's arraylist will be empty after a purchase is made
        ArrayList<Artwork> test = new ArrayList<Artwork>();
//        call the buy artwork method on customer
        customer.buyArtwork(artwork, gallery);
        assertThat(gallery.getStock()).isEqualTo(test);
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Robbie");
    }

    @Test
    public void canSetName(){
        customer.setName("Dena");
        assertThat(customer.getName()).isEqualTo("Dena");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(2000);
        assertThat(customer.getWallet()).isEqualTo(2000);
    }

    @Test
    public void canGetCustomerCollection(){
        ArrayList<Artwork> test = new ArrayList<Artwork>();
        assertThat(customer.getCustomerCollection()).isEqualTo(test);
    }
}
