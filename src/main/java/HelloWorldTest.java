
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;
import java.util.stream.LongStream;

public class HelloWorldTest {

    @Test
    public void testGetMessage() throws Throwable {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.getMessage());
    }

    @Test
    public void testGetMessage2() throws Throwable {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Jason!", hw.getMessage("Jason"));
    }

    @Test
    public void testGeneratePassword() throws Throwable{



//        Random rand = new Random();
//        Double testCompare = rand.nextDouble();
        //System.out.print(result);
        for(int i =0; i <10000; i++) {
            double result = (new GeneratePassword()).getPassword();
            assertTrue(result >= (10000));
            assertTrue(result <= (9999999999L));
        }
    }

}
