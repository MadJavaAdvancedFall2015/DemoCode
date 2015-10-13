package java112.labs2;

import java.util.*;
import java.io.*;

public class PropertiesDemo {

    public static void main(String[] args) {
        PropertiesDemo demo = new PropertiesDemo();
        demo.run();

    }

    public void run() {
        Properties properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream("/demo.properties"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println(properties.getProperty("author"));
        Set<String> propertyNames = properties.stringPropertyNames();
        System.out.println("The array of property names" + propertyNames);
        for (String key: propertyNames) {
            String value = properties.getProperty(key);
            System.out.println(key + " => " + value);
        }

    }



}
