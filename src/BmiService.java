public class BmiService {
    public double bmi(double weight, double height) {

        double result;

        result = weight / (height * height);
        return result;

    }


}
