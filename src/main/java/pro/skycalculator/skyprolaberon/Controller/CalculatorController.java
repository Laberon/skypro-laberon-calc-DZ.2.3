package pro.skycalculator.skyprolaberon.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/calculator")
    public String welcomeCalc() {
        return calculatorService.welcomeCalc();
    }

    @GetMapping(path = "/calculator/plus")
    public String calcPlus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calcPlus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calcMinus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calcMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calcMultiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calcMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calcDivide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.calcDivide(num1, num2);
    }

}