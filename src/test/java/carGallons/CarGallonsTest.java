package carGallons;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CarGallonsTest {

    @Test
    public void carGallonsTest(){

        assertTrue(CarGallons.goCar(50, 25, 2));
        assertFalse(CarGallons.goCar(100, 50, 1));
    }
}
