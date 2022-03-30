package se.sti;

import org.junit.jupiter.api.*;

import static se.sti.ShoppingBasket.shoppingBasket;

public class ShoppingBasketTest {

    @DisplayName("Added dummy values to shoppingBasket")
    @BeforeEach
    public void addItemsToBasket(){
        Clothes clothing1 = new Shirt(200, "S", "red");
        Shirt clothing2 = new Shirt(300, "S", "red");
        Trousers clothing3 = new Trousers(500, "34", true);
        shoppingBasket.add(clothing1);
        shoppingBasket.add(clothing2);
        shoppingBasket.add(clothing3);
        Assertions.assertTrue(true);
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
        Assertions.assertEquals(expectedNumber, shoppingBasket.size());
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
