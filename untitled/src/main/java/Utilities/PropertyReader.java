package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public PropertyReader()
    {
        loadProperties();
    }
    public static Properties properties;

    public void loadProperties()
    {
        properties = new Properties();
        try {
            String path ="./Configs/Config.properties";
            properties.load(new FileInputStream(path));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static String ReadItem(String pName)
    {
        return properties.getProperty(pName);
    }
}
