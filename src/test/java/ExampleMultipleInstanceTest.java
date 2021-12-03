import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleMultipleInstanceTest {

    @Test
    void testMultipleInstances(){
        ExampleMultipleInstance firstInstance = new ExampleMultipleInstance();
        ExampleMultipleInstance secondInstance = new ExampleMultipleInstance();
        assertNotEquals(firstInstance,secondInstance);
    }

}