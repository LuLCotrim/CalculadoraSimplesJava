/**
 * Main
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float n1 = 0;
        float n2 = 0;
        float r = 0;
        String op = new String();
        Scanner s = new Scanner(System.in);

        System.out.println("Bem Vindo a Simples calculadora Java! Dois números e as quatro operações básicas suportadas.");
        
        System.out.println("Digite o primeiro número:");
        n1 = s.nextFloat();
        
        System.out.println("Digite a operacao (+, -, * ou /):");
        op = s.next();
        
        System.out.println("Digite o segundo número:");
        n2 = s.nextFloat();
        
        System.out.println("Calculando...");
        
        switch (op) {
            case "+":
                r = n1 + n2;
            break;
            case "-":
                r = n1 - n2;
            break;
            case "*":
                r = n1 * n2;
            break;
            case "/":
                r = n1 / n2;
            break;
            default:
                System.out.println("Simbolo da operacao nao reconhecida.");
                System.exit(0);
                break;
        }
        System.out.println("Resultado: " + r);
    }
    
}