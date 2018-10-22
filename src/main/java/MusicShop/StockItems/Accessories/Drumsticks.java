package MusicShop.StockItems.Accessories;

public class Drumsticks extends Accessory{
    String brand;
    String size;

    public Drumsticks(double buyingPrice, double sellingPrice, String brand, String size){
        super(buyingPrice, sellingPrice);
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }
}
