public class Main {
    public static void main(String[] args) {
        // Singleton kullanımı
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton: " + (singleton1 == singleton2)); // true, aynı örneği paylaşıyorlar

        // Builder kullanımı
        Product product = new Product.Builder()
                .part1("Part 1")
                .part2("Part 2")
                .build();

        System.out.println("Part 1: " + product.getPart1());
        System.out.println("Part 2: " + product.getPart2());
    }
}
