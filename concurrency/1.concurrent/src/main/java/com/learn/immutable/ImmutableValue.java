package com.learn.immutable;

/**
 * Immutability : Once the object is created, it is not possible to alter the state of the object
 */
public class ImmutableValue {

    private int value;

    public ImmutableValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
