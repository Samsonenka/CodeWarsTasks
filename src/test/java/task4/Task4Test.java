package task4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Task4Test {

    @Test
    public void checkSmallValues() {
        assertEquals(6, Task4.expressionsMatter(2, 1, 2));
        assertEquals(3, Task4.expressionsMatter(1, 1, 1));
        assertEquals(4, Task4.expressionsMatter(2, 1, 1));
        assertEquals(9, Task4.expressionsMatter(1, 2, 3));
        assertEquals(5, Task4.expressionsMatter(1, 3, 1));
        assertEquals(8, Task4.expressionsMatter(2, 2, 2));
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals( 20, Task4.expressionsMatter(5, 1, 3));
        assertEquals(105, Task4.expressionsMatter(3, 5, 7));
        assertEquals( 35, Task4.expressionsMatter(5, 6, 1));
        assertEquals(  8, Task4.expressionsMatter(1, 6, 1));
        assertEquals( 14, Task4.expressionsMatter(2, 6, 1));
        assertEquals( 48, Task4.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals( 60, Task4.expressionsMatter( 2, 10,  3));
        assertEquals( 27, Task4.expressionsMatter( 1,  8,  3));
        assertEquals(126, Task4.expressionsMatter( 9,  7,  2));
        assertEquals( 20, Task4.expressionsMatter( 1,  1, 10));
        assertEquals( 18, Task4.expressionsMatter( 9,  1,  1));
        assertEquals(300, Task4.expressionsMatter(10,  5,  6));
        assertEquals( 12, Task4.expressionsMatter( 1, 10,  1));
    }
}
