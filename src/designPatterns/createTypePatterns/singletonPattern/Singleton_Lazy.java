package designPatterns.createTypePatterns.singletonPattern;

public class Singleton_Lazy {
    private static volatile Singleton_Lazy instance;

    private Singleton_Lazy(){
    }

    public static Singleton_Lazy getInstance(){
        synchronized (Singleton_Lazy.class) {
            if(instance == null){
                instance = new Singleton_Lazy();
            }
        }
        return instance;
    }

}
