import MusicShop.StockItems.Accessories.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {
    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks(3.22, 5.99, "BigStick", "5A");
    }

    @Test
    public void getBrand(){
        assertEquals("BigStick", drumsticks.getBrand() );
    }

    @Test
    public void getSize(){
        assertEquals("5A", drumsticks.getSize() );
    }

    @Test
    public void getBuyingPrice(){
        assertEquals(3.22, drumsticks.getBuyingPrice(), 0);
    }

    @Test
    public void getSellingPrice(){
        assertEquals(5.99, drumsticks.getSellingPrice(), 0);
    }

    @Test
    public void getMarkup(){
        assertEquals(2.77, drumsticks.calculateMarkUp(),0);
    }

}
