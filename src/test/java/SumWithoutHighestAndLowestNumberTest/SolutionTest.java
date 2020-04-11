package SumWithoutHighestAndLowestNumberTest;
import SumWithoutHighestAndLowestNumber.SumWithoutHighestAndLowestNumber;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutHighestAndLowestNumber.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
