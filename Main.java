import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Postfix postfix = new Postfix();

        // Solicitar la expresión al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una expresión en notación postfija:");
        String expression = scanner.nextLine();
        System.out.println("Expresion ingresada: '" + expression + "'");
        // Operar la expresión
        int result = postfix.operate(expression);

        // Mostrar el resultado
        System.out.println("Resultado de la expresión postfija: " + result);
        scanner.close();
    }
}