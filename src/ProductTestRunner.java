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
            System.out.println("Testing for first two bullet point specifications was successful");
        }
        else
        {
            System.out.println();
            System.out.println("Testing of first two bullet point specifications produced one or more failures.");
        }

        result = JUnitCore.runClasses(ProductTest.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println();
            System.out.println(failure.toString());
        }

        if(result.wasSuccessful())
        {
            System.out.println();
            System.out.println("Testing of third and fourth bullet point specification was successful");
        }
        else
        {
            System.out.println("Testing of third and fourth bullet point specification produced one or more failures.");
        }

        result = JUnitCore.runClasses(ShoppingCartTest2.class);
        for (Failure failure : result.getFailures())
        {
            System.out.println();
            System.out.println(failure.toString());
        }

        if(result.wasSuccessful())
        {
            System.out.println();
            System.out.println("Testing of fifth bullet point specifications was successful");
        }
        else
        {
            System.out.println();
            System.out.println("Testing of fifth bullet point specifications produced one or more failures.");
        }
    }
}
