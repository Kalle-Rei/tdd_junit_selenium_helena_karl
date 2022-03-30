package se.sti;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingBasketTest {

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
