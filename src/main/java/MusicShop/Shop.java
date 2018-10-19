package MusicShop;

import MusicShop.Interfaces.Sellable;

import java.util.ArrayList;

public class Shop {
    String name;
    double till;
    ArrayList<Sellable> stock;

    public Shop(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addToStock(Sellable item){
        stock.add(item);
    }

    public void removeFromStock(Sellable item){
        stock.remove(item);
    }

    public void sellItem(Sellable item){
        removeFromStock(item);
        till += item.getSellingPrice();
    }

    public double getTotalProfit(){
        //iterate over the stock arraylist,
        //calling calculateMarkup on each element and
        // adding to a total profit variable which will be returned
        double totalProfit = 0;
        for (Sellable item:stock
             ) {
            totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }


}
