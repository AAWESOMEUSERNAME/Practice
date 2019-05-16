package designPatterns.createTypePatterns.simpleFactoryPattern;

import designPatterns.createTypePatterns.simpleFactoryPattern.operatorImpl.OperatorAdd;
import designPatterns.createTypePatterns.simpleFactoryPattern.operatorImpl.OperatorMinus;

public class SimpleFactory {
    public static Operator createOperate(String operate){
        switch (operate){
            case "+" : return new OperatorAdd();
            case "-" : return new OperatorMinus();
            default: return null;
        }
    }
}
