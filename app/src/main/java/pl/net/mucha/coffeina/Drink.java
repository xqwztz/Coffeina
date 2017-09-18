package pl.net.mucha.coffeina;

/**
 * Created by xqwztz on 10.09.17.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    private double price;

    //drinks to tablica obiektów klasy Drink
    public static final Drink[] drinks = {
        new Drink("Latte", "Czarne espresso z gorącym mlekiem i mleczą pianką.",R.drawable.latte, 10),
        new Drink("Cappuccino", "Czarne espresso z dużą ilością spienionego mleka.", R.drawable.cappuccino,15),
        new Drink("Espresso", "Czarna kawa ze świeżo mielonych ziaren najwyższej jakości.", R.drawable.filter,35)
    };

    //każdy drink ma nazwę, opis i zasób graficzny
    private Drink(String name, String description, int imageResourceId, double price){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public  int getImageResourceId(){
        return imageResourceId;
    }
    public double getPrice() { return price;}
    public String toString(){
        return this.name;
    }
}
