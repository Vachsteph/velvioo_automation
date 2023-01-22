package config;

import com.google.common.io.Resources;

import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public static final String ADMIN_URL;



    private static final Properties configs;
    static {
        configs = readFromFile("/config.properties");
        ADMIN_URL = getProperty("velvioo.url");
    }

    public static String getProperty(String key) {
        if (System.getProperty(key) == null || System.getProperty(key).isEmpty()) {
            String property = configs.getProperty(key);
            System.out.println("Getting property " + key + ": " + property);
            return property;
        } else {
            String property = System.getProperty(key);
            System.out.println("Getting property " + key + ": " + property);
            return property;
        }
    }

    private static Properties readFromFile(String path) {
        Properties properties = new Properties();
        try {
            properties.load(Resources.class.getResourceAsStream(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return properties;
    }

    private Configuration() {
    }

    public static Boolean isRemote = false;
}

