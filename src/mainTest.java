import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @org.junit.jupiter.api.Test
    void addition() {
        main mainTester = new main();

        Assertions.assertEquals(3, mainTester.addition(1,2));
    }

    @Test
    void subtraction() {
        main mainTester = new main();
        Assertions.assertEquals(5, mainTester.subtraction(7, 2));

    }
}