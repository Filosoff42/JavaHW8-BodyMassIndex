public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 82.3;
        double heightCm = 192.5;
        double bmi = service.calculate(weightKg, heightCm);
        System.out.println("Масса тела (кг): " + weightKg);
        System.out.println("Рост (см): " + heightCm);
        System.out.printf("Индекс массы тела: %.1f", bmi);
    }
}
