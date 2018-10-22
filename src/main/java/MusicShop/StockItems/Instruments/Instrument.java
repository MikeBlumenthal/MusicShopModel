package MusicShop.StockItems.Instruments;

import MusicShop.Interfaces.Playable;
import MusicShop.StockItems.Enums.FamilyType;
import MusicShop.StockItems.StockItem;

public abstract class Instrument extends StockItem implements Playable{
    FamilyType type;
    String sound;

    public Instrument(double buyingPrice, double sellingPrice, FamilyType type, String sound){
        super(buyingPrice, sellingPrice);
        this.type = type;
        this.sound = sound;
    }

    public FamilyType getType() {
        return type;
    }

    @Override
    public String play() {
        return "Listen..." + sound;
    }

}
