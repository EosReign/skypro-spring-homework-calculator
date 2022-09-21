package pro.sky.skyprospringhomeworkcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {
    public static String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    public static String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public static String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    public static String divide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
