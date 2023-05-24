public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.bmi(95, 1.85);
        System.out.println("ИМТ = " + myBmi);
    }

}
