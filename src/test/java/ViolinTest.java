import MusicShop.StockItems.Enums.FamilyType;
import MusicShop.StockItems.Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin(84.50, 200, FamilyType.STRING_BOWED, "diddle-dee-dee", "Strad");
    }

    @Test
    public void getType(){
        assertEquals(FamilyType.STRING_BOWED, violin.getType());
    }
}
