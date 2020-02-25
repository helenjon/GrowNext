package test.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    private static Properties properties;

    public static Properties getProperties (){
        try {
            properties = new Properties();
            FileInputStream fileinput = new FileInputStream("src\\test\\resources\\config\\config.properties");
            properties.load(fileinput);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }

}
