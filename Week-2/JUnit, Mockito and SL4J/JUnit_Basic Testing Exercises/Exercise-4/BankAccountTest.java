import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("Setting up BankAccount for testing...");
        account = new BankAccount("Lalith", 1000.0);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        account = null;
    }

    @Test
    public void testDeposit() {
        double newBalance = account.deposit(500.0);
        assertEquals(1500.0, newBalance, 0.001);
    }

    @Test
    public void testWithdraw() {
        double newBalance = account.withdraw(300.0);
        assertEquals(700.0, newBalance, 0.001);
    }

    @Test
    public void testOverWithdraw() {
        double result = account.withdraw(2000.0);
        assertEquals(1000.0, result, 0.001); // No change expected
    }
}
