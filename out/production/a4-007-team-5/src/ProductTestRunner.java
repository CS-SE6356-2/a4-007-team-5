import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ProductTestRunner
{
    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(ShoppingCartTest.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }

        if(result.wasSuccessful())
        {
            System.out.println();
            System.out.println("Testing was successful");
        }
        else
        {
            System.out.println("Testing produced one or more failures.");
        }
    }
}
