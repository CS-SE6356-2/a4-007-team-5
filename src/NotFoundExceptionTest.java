

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;
import static org.junit.Assert.fail;
/**
 *
 * @author quanicus
 */
public class NotFoundExceptionTest {
    
    @org.junit.Test
    public void NotFound() throws ProductNotFoundException {
    
        ShoppingCart cart = new ShoppingCart();
        Product cat = new Product("Cat", 1000);
        cart.addItem(new Product("Pen", 100));
        
        try{
            
            cart.removeItem(cat);
            fail();
        }
        catch(ProductNotFoundException e){
        }
    
    }
}
