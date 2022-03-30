package se.sti;

import org.junit.jupiter.api.*;

import static se.sti.ShoppingBasket.numberOfItems;
import static se.sti.ShoppingBasket.shoppingBasket;

public class ShoppingBasketTest {

    @DisplayName("Added dummy values to shoppingBasket")
    @BeforeEach
    public void addItemsToBasket(){
        Clothes clothing1 = new Shirt(200, "S", "red");
        Shirt clothing2 = new Shirt(300, "S", "red");
        Trousers clothing3 = new Trousers(500, "34", true);
        ShoppingBasket.addingItem(clothing1);
        ShoppingBasket.addingItem(clothing2);
        ShoppingBasket.addingItem(clothing3);
        Assertions.assertTrue(true);
    }
    @Test
    @DisplayName("Remove Item From Basket")
    public void removeItemFromBasket(){
        int itemsInbasket = shoppingBasket.size();
        ShoppingBasket.removeItem();
        System.out.println("Updated basket " + shoppingBasket.size() + " Items in Basket "+ itemsInbasket);
        Assertions.assertNotEquals(shoppingBasket.size(), itemsInbasket);
    }

    @Test
    @DisplayName("Remove all items from Basket")
    public void removeAllItemsFromBasket(){
        ShoppingBasket.removeAllItems();
        Assertions.assertEquals(0, shoppingBasket.size());
    }

    @DisplayName("Cleared shopping basket")
    @AfterEach
    public void emptyBasket(){
        shoppingBasket.clear();
    }

    @Test
    @DisplayName("Check number of items in shoppingBasket")
    public void numberOfItemsInBasket(){
        int expectedNumber = 3;
        System.out.println("Expected number of items: " + expectedNumber);
        System.out.println(shoppingBasket);
        Assertions.assertEquals(expectedNumber, numberOfItems());
    }




@Test
    public void doesConstructorWork() {
    Clothes clothes = new Shirt(150,"M","Red");
    Assertions.assertEquals(150, clothes.getPrice());

}

@Test
    public void doesConstructorWorkHere() {
    Clothes clothes = new Trousers(125, "38", true);
    Assertions.assertEquals(125, clothes.getPrice());



}





}
