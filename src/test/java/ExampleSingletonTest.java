import org.junit.jupiter.api.Test;
import java.lang.ExceptionInInitializerError;

import static org.junit.jupiter.api.Assertions.*;

class ExampleSingletonTest {

    @Test
    void testExampleSingletonSame(){
        ExampleSingleton fistInstance = ExampleSingleton.getInstance();
        ExampleSingleton secondInstance = ExampleSingleton.getInstance();
        assertEquals(fistInstance,secondInstance);
    }




}