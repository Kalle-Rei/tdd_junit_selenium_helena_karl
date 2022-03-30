package se.sti;

import java.util.ArrayList;

public class ShoppingBasket
{
    public static ArrayList<Clothes> shoppingBasket = new ArrayList<>();

    public static void main( String[] args ) {

    }

    public void addingItem(Clothes item){
        shoppingBasket.add(item);
    }



}
