package utilities;

import commons.GlobalConstants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesConfig {
    private final String propertyFilePath = GlobalConstants.ENVIRONMENT_CONFIG_PATH + "%s.properties";
    private Properties properties;

    public PropertiesConfig(String serverName) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(String.format(propertyFilePath, serverName)));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration properties not found at " + propertyFilePath);
        }
    }

    public static PropertiesConfig getProperties(String serverName) {
        return new PropertiesConfig(serverName);
    }

    public String getUrlRegister() {
        String url = properties.getProperty("App.UrlRegister");
        if (url != null)
            return url;
        else
            throw new RuntimeException("Url not specified in the properties file.");
    }

    public String getUrlLogin() {
        String url = properties.getProperty("App.UrlLogin");
        if (url != null)
            return url;
        else
            throw new RuntimeException("Url not specified in the properties file.");
    }
}