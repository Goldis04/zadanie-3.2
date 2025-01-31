public class BMiService {

    public int calculate(double weight, double height) {
        double BmiIndex = weight / (height * height);
        return (int) BmiIndex;
    }

}