package org.example.util;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@UtilityClass
public final class PropertiesUtil {
    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }


    private static void loadProperties() {
        try (InputStream resourceAsStream = PropertiesUtil.class.getClassLoader()
                .getResourceAsStream("application.properties")) {
            PROPERTIES.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
