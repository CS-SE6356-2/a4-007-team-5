import org.junit.*;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {

    @org.junit.Test
    public void newProductAddedIncrement(){

        // Create an instance of shopping cart
        ShoppingCart s = new ShoppingCart();

        // Check number of items to make sure it is zero
        assertEquals(0, s.getItemCount());

        Product p = new Product("TestProduct", 100.00);

        s.addItem(p);

        assertEquals(1, s.getItemCount());
    }

    @org.junit.Test
    public void newProductAddedNewBalanceUpdate(){

        // Create shopping cart
        ShoppingCart s1 = new ShoppingCart();

        // Create and add products to cart
        Product p1 = new Product("TestProduct1", 50.00);
        Product p2 = new Product("TestProduct2", 100.00);

        // Add items to cart
        s1.addItem(p1);
        s1.addItem(p2);

        // Check initial balance
        assertEquals(150, s1.getBalance());

        // Create another product
        Product p3 = new Product("TestProduct3", 20.00);

        //Add to cart
        s1.addItem(p3);

        // Check if adding item updates cart balance correctly
        assertEquals(170, s1.getBalance());


    }


}