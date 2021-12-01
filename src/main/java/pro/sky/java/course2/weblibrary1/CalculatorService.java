package pro.sky.java.course2.weblibrary1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    static int value1 = 5;
    static int value2 = 5;

    public static String plus() {
        int num3 = value1 + value2;
        return String.valueOf(num3);
    }

    public static String minus() {
        int num3 = value1 - value2;
        return String.valueOf(num3);
    }

    public static String multiply() {
        int num3 = value1 * value2;
        return String.valueOf(num3);
    }

    public static String divide() {
        int num3 = value1 / value2;
        return String.valueOf(num3);
    }
}
