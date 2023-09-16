package org.example.HW.MyExceptions;

public class MyArraySizeException extends MyException{


    private int xSize;
    private int ySize;

    public int getXSize() {
        return xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public MyArraySizeException(String message, int x, int y) {
        super(message);
        this.xSize = x;
        this.ySize = y;
    }
}
