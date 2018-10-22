package MusicShop.StockItems.Instruments;

import MusicShop.StockItems.Enums.FamilyType;

public class Violin extends Instrument{
    String brand;

    public Violin(double buyingPrice, double sellingPrice, FamilyType type, String sound, String brand){
        super(buyingPrice,sellingPrice, type, sound);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
