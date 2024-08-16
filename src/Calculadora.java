import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um desses operadores: +, -, *, /");
        String operador = scan.next();
        System.out.println("Digite dois numeros: ");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double resultado = 0;

        switch (operador)
        {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operador indisponivel");
        }
        System.out.println(resultado);
    }
}