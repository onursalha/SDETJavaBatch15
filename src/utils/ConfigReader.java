package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read () throws IOException {

        String path="Files/config.properties";

        //A class that helps us navigate to that folder where file is stored
        // if you face any issues hover your mouse and click on add exception to method signature
        FileInputStream fileInputStream=new FileInputStream(path);

        /*
        This Properties class will assist us to read and write data to properties files
         */
        Properties properties=new Properties();
        //Loads all of the data from file inside the above object "properties"
        properties.load(fileInputStream);
        return properties;
    }
}
