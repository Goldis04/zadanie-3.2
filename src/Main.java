import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BMiService bmiservice = new BMiService();
        int BmiIndex = bmiservice.calculate (98, 1.87); // должно получиться 28
        System.out.println("Индекс массы тела (BMI):" + BmiIndex);

    }
}