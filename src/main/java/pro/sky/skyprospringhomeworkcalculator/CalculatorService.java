package pro.sky.skyprospringhomeworkcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {
    public static String hello() {
        return "<span><b>Welcome to Calculator!</b><span><br>";
    }
    public static String plus(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        } else {
            return "Error";
        }
    }
    public static String minus(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        } else {
            return "Error";
        }
    }
    public static String multiply(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        } else {
            return "Error";
        }
    }
    public static String divide(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else {
            return "Error";
        }
    }
    //..


}
