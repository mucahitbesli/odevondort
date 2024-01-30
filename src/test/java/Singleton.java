public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // İstediğiniz kurulum kodları buraya gelebilir
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
