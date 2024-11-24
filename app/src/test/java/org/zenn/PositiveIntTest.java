package org.zenn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveIntTest {
    @Test
    public void testIsEven() {
        PositiveInt positiveInt = new PositiveInt(2);
        assertTrue(positiveInt.isEven());
    }
}