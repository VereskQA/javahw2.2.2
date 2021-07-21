public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78; // Рост в метрах (например, 1.89)
        double weight = 60; // Вес в килограммах (например, 80)
        double imt = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + imt);
    }
}
