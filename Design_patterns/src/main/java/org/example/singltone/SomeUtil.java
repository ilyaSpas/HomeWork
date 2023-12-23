package org.example.singltone;

public class SomeUtil {
    private static final SomeUtil INSTANCE = new SomeUtil();

    private SomeUtil() {
    }

    public static SomeUtil getInstance() {
        return INSTANCE;
    }
}
