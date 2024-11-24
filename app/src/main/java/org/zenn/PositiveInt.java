package org.zenn;

public class PositiveInt {
    private final int value;

    PositiveInt(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    boolean isEven() {
        return (value % 2 == 0);
    }
}
