package designPatterns.structuralTypePatterns.facadePattern;

public class Facade {
    public void methodA(){
        new SubSysOne().method1();
        new SubSysTwo().method2();
    }

    public void methodB(){
        new SubSysThree().method3();
        new SubSysFour().method4();
    }
}
