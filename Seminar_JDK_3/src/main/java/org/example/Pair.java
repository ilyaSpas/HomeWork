package org.example;

public class Pair <X,Y>{
    private X x;
    private Y y;

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }
    public X getFirst(){
        return x;
    }
    public Y getSecond(){
        return y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
