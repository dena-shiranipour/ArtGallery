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
//    a Customer object is also needed to test its own methods
    @BeforeEach
    public void setUp(){
        customer = new Customer("Robbie", 1000);
        artist = new Artist("Davinci");
        artwork = new Artwork("Mona Lisa", artist, 100);
        gallery = new Gallery("Louvre");
    }

//    test for changes to customer's wallet
    @Test
    public void doesBuyingArtWorkChangeCustomersWallet(){
//        check if the value of the wallet is decreased by the price of the artwork
//        call buyArtwork method
        customer.buyArtwork(artwork, gallery);
//        check that the price of the artwork has been subtracted from the customer's wallet
        assertThat(customer.getWallet()).isEqualTo(900);
    }

//    test for changes to gallery's till
    @Test
    public void doesBuyingArtWorkChangeGallerysTill(){
//        check if the value of the till has increased by the price of the artwork
//        call buyArtwork method
        customer.buyArtwork(artwork, gallery);
//        check if till is now equal to the price of the artwork declared in the setup
        assertThat(gallery.getTill()).isEqualTo(100);
    }

//    test for changes to customer's collection
    @Test
    public void doesBuyingArtWorkChangeCustomersCollection(){
//        check if the customer's collection is no longer an empty array after buying artwork
//        create empty arraylist, as this is the default customer collection
        ArrayList<Artwork> test = new ArrayList<Artwork>();
//        call the buy artwork method on customer
        customer.buyArtwork(artwork, gallery);
//        check if the customer collection is not the same as the empty arraylist
        assertThat(customer.getCustomerCollection()).isNotSameAs(test);
    }

    // test for removing from the gallery stock
    @Test
    public void canRemoveItemFromGalleryStock(){
//        create empty arraylist
//        as the gallery's arraylist will be empty after a purchase is made
        ArrayList<Artwork> test = new ArrayList<Artwork>();
//        call the buy artwork method on customer
        customer.buyArtwork(artwork, gallery);
        assertThat(gallery.getStock()).isEqualTo(test);
    }

//    test for getting name
    @Test
    public void canGetName(){
//        use getter to check if this is equal to the name passed into the customer object in the set up
        assertThat(customer.getName()).isEqualTo("Robbie");
    }

//    test for setting name
    @Test
    public void canSetName(){
//        set name to new String
        customer.setName("Dena");
//        use the getter to check that the name is now equal to the new String
        assertThat(customer.getName()).isEqualTo("Dena");
    }

//    test for getting wallet
    @Test
    public void canGetWallet(){
//        check that this is equal to the values passed in during set up
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

//    test for setting wallet
    @Test
    public void canSetWallet(){
//        set wallet to new value
        customer.setWallet(2000);
//        check that wallet is now equal to this value
        assertThat(customer.getWallet()).isEqualTo(2000);
    }

//    test for getting customer collection
    @Test
    public void canGetCustomerCollection(){
//        since default value is an empty array list of Artwork objects, we need to recreate this as a test variable
        ArrayList<Artwork> test = new ArrayList<Artwork>();
//        use getter to check equality of these two
        assertThat(customer.getCustomerCollection()).isEqualTo(test);
    }
}
