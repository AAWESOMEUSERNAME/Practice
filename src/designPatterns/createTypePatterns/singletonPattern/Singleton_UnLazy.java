package designPatterns.createTypePatterns.singletonPattern;

public class Singleton_UnLazy {
    private static Singleton_UnLazy instance = new Singleton_UnLazy();

    private Singleton_UnLazy(){
    }

    public static Singleton_UnLazy getInstance(){
        return instance;
    }
}
