package pro.sky.skyprospringhomeworkcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/calculator")
    public String hello() {
        return "<span><b>Welcome to Calculator!</b><span><br>";
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " + " + num2 + " = " + CalculatorService.plus(num1, num2);
        } else {
            return "Error";
        }
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " - " + num2 + " = " + CalculatorService.minus(num1, num2);
        } else {
            return "Error";
        }
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " * " + num2 + " = " + CalculatorService.multiply(num1, num2);
        } else {
            return "Error";
        }
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + " / " + num2 + " = " + CalculatorService.divide(num1, num2);
        } else {
            return "Error";
        }
    }
}
