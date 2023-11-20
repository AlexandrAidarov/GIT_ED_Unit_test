package SeminarThree.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Element elem;

    @BeforeEach
    void setup() {
        elem = new Element();
    }

    @Test
    void numberIsEven() {
        assertTrue(elem.evenOddNumber(2));
    }

    @Test
    void numberIsOdd() {
        assertFalse(elem.evenOddNumber(1));
    }

    @Test
    void numberIsInInterval() {
        for (int i = 26; i < 100; i++) {
            assertTrue(elem.numberInInterval(i));
        }
    }

    @Test
    void numberIsNotInInterval() {
        int[] numbers = new int[]{-30, 0, 25, 120};
        for (int number : numbers) {
            assertFalse(elem.numberInInterval(number));
        }
    }

}