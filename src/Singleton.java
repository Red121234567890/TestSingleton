public class Singleton {

    private int nmbExecusion = 0;
    // - instance
    private static Singleton instance = null;

    // -Singleton

    private Singleton() {
        System.out.println("Constructeur singleton");


    }

    // + getInstance

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        System.out.println("getInstance singleton");
        return instance;
    }
}
