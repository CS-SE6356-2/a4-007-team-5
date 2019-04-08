import static org.junit.Assert.*;

public class ShoppingCartTest
{
    //Tests specification #1
    @org.junit.Test
    public void createdCartZeroItems()
    {
        //Initializes new ShoppingCart
        ShoppingCart newCart = new ShoppingCart();

        //Asserts for test that the cart should have zero items
        assertEquals(0, newCart.getItemCount());
    }

    //Tests specification #2
    @org.junit.Test
    public void emptyCartZeroItems()
    {
        //Initializes cart to be tested
        ShoppingCart emptyCart = new ShoppingCart();

        //Adds dummy product to shopping cart
        Product testProduct = new Product("Jeff", 0.0);
        emptyCart.addItem(testProduct);

        //Empties shopping cart
        emptyCart.empty();

        //Asserts that empty cart has zero items
        assertEquals(0, emptyCart.getItemCount());
    }
}