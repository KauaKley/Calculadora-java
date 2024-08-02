import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um desses operadores: +, -, *, /");
        String operador = scan.nextLine();
        System.out.println("Digite dois numeros: ");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double resultado;

        switch (operador)
        {
            case "+":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = numero1 / numero2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Operador indisponivel");
        }
    }
}