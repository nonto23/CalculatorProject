import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    //Calculator calculator = new Calculator();
    @Test
    public void adding() {

        Assert.assertEquals(Calculator.add(2,2,34),38);
    }

    @Test
    public void Multiplication() {

        Assert.assertEquals(Calculator.Multiplication(1,2),2);
    }

}
