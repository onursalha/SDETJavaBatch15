package Class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {

    public static void main(String[] args) throws IOException {

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
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();
    }
}
