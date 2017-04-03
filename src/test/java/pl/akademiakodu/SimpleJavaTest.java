package pl.akademiakodu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by OskarPraca on 2017-04-03.
 */
public class SimpleJavaTest {

    @Test
    public void diviseTester() {
        SimpleTest tester = new SimpleTest();

        ArithmeticException ex = null;
        try{
            assertEquals("Ten komunikat nie powinien się wyświetlić", 0, tester.divise(10, 0));
        }
        catch(ArithmeticException e){
            ex = e;
        }

        assertNotNull("Powinien wystąpić wyjątek", ex);



        assertEquals("Wynik ma być: 2", 2, tester.divise(10, 5));

    }
}
