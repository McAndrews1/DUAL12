

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebaTest
{
    /**
     * Default constructor for test class pruebaTest
     */
    public pruebaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    

    @Test
    public void aProbar()
    {
        assertEquals(0, prueba.aProbar(-1));//Para valores de q menores que 0
        assertEquals(1, prueba.aProbar(1));//Para valores de q mayores o iguales que 0 y mientras que i sea menor que q
    }
}


