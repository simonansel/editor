package org.ulco;

public class ID {
    private int ID = 0;
    private static ID instance = null;

    public static ID getInstance() {
        if (instance == null) {
            instance = new ID();
        }

        return instance;
    }

    public int GetID() {
        return ++ID;
    }

    public int GetLastID() {
        return ID;
    }

}