package test.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    private static Properties properties;

    public static Properties getProperties (){
        try {
            properties = new Properties();
            FileInputStream fileInput = new FileInputStream("src\\test\\resources\\config\\config.properties");
            properties.load(fileInput);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }

}
