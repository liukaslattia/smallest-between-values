import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestBetweenValuesTest {

    @Test
    void findSmallestBetweenValues() {
        int[] inputArray1 = {1,4,10};
        int[] inputArray2 = {4,10,1};
        int[] inputArray3 = {1,4,4};
        int[] inputArray4 = {1,3,5};

        assertAll(() -> assertEquals(2, SmallestBetweenValues.findSmallestBetweenValues(inputArray1)),
                () -> assertEquals(2, SmallestBetweenValues.findSmallestBetweenValues(inputArray2)),
                () -> assertEquals(2, SmallestBetweenValues.findSmallestBetweenValues(inputArray3)),
                () -> assertEquals(1, SmallestBetweenValues.findSmallestBetweenValues(inputArray4)));
    }
}