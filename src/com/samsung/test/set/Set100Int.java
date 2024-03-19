package com.samsung.test.set;

public class Set100Int {
    private boolean array[] = new boolean[100];

    public boolean add(int value) {
        if (value >= 0 && value < 100) {
            array[value] = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean remove(int value) {
        if (value >= 0 && value < 100) {
            array[value] = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(int value) {
        if (value >= 0 && value < 100) {
            return array[value];
        } else {
            return false;
        }
    }
}
