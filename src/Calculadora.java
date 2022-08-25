import java.util.Scanner;

public class Calculadora {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número (inteiro): ");
            int num1 = leitor.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = leitor.nextInt();

            System.out.println("Digite o operador (+, -, *, /): ");
            String operador = leitor.next();
            var resultado = 0;

            switch (operador) {
                
                case "+":
                    resultado = num1 + num2;
                    System.out.println("O resultado é" + resultado);
                break;

                case "-":
                    resultado = num1 - num2;
                    System.out.println("O resultado é: " + resultado);
                break;

                case "*":
                    resultado = num1 * num2;
                    System.out.println("O resultado é" + resultado);
                break;

                case "/":
                    resultado = num1 / num2;
                    System.out.println("O resultado é" + resultado);
                break;
            }
        }
    }
}
