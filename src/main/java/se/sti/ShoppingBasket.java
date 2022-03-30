package se.sti;

import java.util.ArrayList;

public class ShoppingBasket {

    public static ArrayList<Clothes> shoppingBasket = new ArrayList<>();

    public static void main( String[] args ) {

    }

    public static void addingItem(Clothes item){
        shoppingBasket.add(item);
    }

    public static void removeItem(){
        shoppingBasket.remove(shoppingBasket.size()-1);
    }

}
