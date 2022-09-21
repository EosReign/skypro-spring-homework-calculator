package pro.sky.skyprospringhomeworkcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {
    public static int plus(int num1, int num2) {
        return num1 + num2;
    }
    public static int minus(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
