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
        return CalculatorService.hello();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorService.plus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return CalculatorService.divide(num1, num2);
    }
    //..

}
