package org.example;

public class Arrays {
    public static <T> boolean compareArrays(T[] t1Array, T[] t2Array) {
        for (int i = 0; i < t1Array.length; i++){
            if (!t1Array[i].equals(t2Array[i])){
                return false;
            }
        }
        return true;
    }

}
