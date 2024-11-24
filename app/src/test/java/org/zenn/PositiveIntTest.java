package org.zenn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveIntTest {
    @Test
    public void testIsEven() {
        PositiveInt two = new PositiveInt(2);
        assertTrue(two.isEven());

        PositiveInt one = new PositiveInt(1);
        assertFalse(one.isEven());
    }
}
