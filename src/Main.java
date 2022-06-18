public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.73; //Рост в метрах
        double weight = 57.4; //Вес в килограммах
        double index = service.calculate(height, weight);
        System.out.println("Индкс массы тела: " + index);

    }
}

