package Apps1;

import GeneralClasses.Calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("--- PRUEBAS DE MÉTODOS MATEMÁTICOS ---");

        // Test Factorial
        int nFact = 5;
        System.out.println("Factorial de " + nFact + ": " + Calculator.calculaFactorial(nFact));

        // Test MCD (Máximo Común Divisor)
        int a = 105, b = 45;
        System.out.println("MCD de " + a + " y " + b + ": " + Calculator.MCD(a, b));

        // Test Sucesión de Ullman
        System.out.println("Sucesión de Ullman para 7: " + Calculator.calculaUllman(7));

        // Test Fibonacci
        System.out.println("Serie Fibonacci (10 términos): " + Calculator.generaSerieFibonacci(10));

        // Test Divisibilidad por 11
        int num11 = 1331;
        System.out.println("¿El número " + num11 + " es divisible por 11?: " + Calculator.esDivisiblePor11(num11));

        // Test Cubos de Nicómaco
        System.out.println("\nCubos de Nicómaco para n=4:");
        System.out.println(Calculator.generaCubosNicomaco2(4));
    }
}
