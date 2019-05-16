package designPatterns.createTypePatterns.abstractFactoryPattern;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductA;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.ProductB;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.productAImpl.HMProductA;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.productAImpl.NikeProductA;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.productBImpl.HMProductB;
import designPatterns.createTypePatterns.abstractFactoryPattern.product.productBImpl.NikeProductB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Factory {
    private String brandA;
    private String brandB;
    public Factory() {
        try {
            URL resource = this.getClass().getResource("test.properties");
            InputStream in = new FileInputStream(new File(resource.getFile()));
            Properties properties = new Properties();
            properties.load(in);
            brandA = properties.getProperty("package.brandA");
            brandB = properties.getProperty("package.brandB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ProductA produceProductA() throws Exception{
        return (ProductA) Class.forName(brandA+"ProductA").newInstance();
    }
    public ProductB produceProductB() throws Exception{
        return (ProductB) Class.forName(brandB+"ProductB").newInstance();
    }
}
