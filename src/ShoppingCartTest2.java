import static org.junit.Assert.*;

public class ShoppingCartTest2
{

    //Method tests the removeItem method in the ShoppingCart class
    @org.junit.Test
    public void removeItems(  )
    {
        //Create instance of Shopping cart class
        //to add new items.
        ShoppingCart cart = new ShoppingCart();

        //Create instance of Product class, and assign a name and price.
        Product newProduct1 = new Product("chair", 5);

        Product newProduct2 = new Product("table", 5.6);

        //Add new products to cart.
        cart.addItem(newProduct1);
        cart.addItem(newProduct2);

        //Remove an item from the cart;
        try {
            cart.removeItem(newProduct2);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }

        //Check to see if item number has been decreased
        assertEquals(1, cart.getItemCount( ));






    }

}