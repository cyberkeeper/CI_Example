package nclan.ac.ahart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RunMeTest {

    private RunMe app;

    @BeforeEach
    void setUp() {
        app = new RunMe();
    }

    @Test
    void testMakeName() {
        assertEquals("Alan Hart", app.makeName("Alan", "Hart"));
    }

    @Test
    void testCalculateValue() {
        assertEquals(378, app.calculateValue(123, 3));
    }
}