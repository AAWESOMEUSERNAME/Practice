package designPatterns.createTypePatterns.builderPattern;

import com.sun.javafx.logging.PulseLogger;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private Map<String,String> properties = new HashMap<>();

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public void show(){
        properties.forEach((key,value) -> {
            System.out.println(key + "  :  " + value);
        });
    }
}
