package designPatterns.createTypePatterns.singletonPattern;

public class Main {
    public static void  main(String[] args){
        Thread thread01 = new Thread(() -> {
            System.out.println("thread01   " + Singleton_Lazy.getInstance().hashCode());
        });

        Thread thread02 = new Thread(() -> {
            System.out.println("thread02    " + Singleton_Lazy.getInstance().hashCode());
        });

        Thread thread03 = new Thread(() -> {
            System.out.println("thread03    " + Singleton_UnLazy.getInstance().hashCode());
        });

        Thread thread04 = new Thread(() -> {
            System.out.println("thread04    " + Singleton_UnLazy.getInstance().hashCode());
        });

        thread01.run();
        thread02.run();
        thread03.run();
        thread04.run();

    }
}
