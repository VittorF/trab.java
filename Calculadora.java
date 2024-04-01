import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Insira a operação desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                realizarAdicao();
                break;
            case 2:
                realizarSubtracao();
                break;
            case 3:
                realizarMultiplicacao();
                break;
            case 4:
                realizarDivisao();
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
    
    public static void realizarAdicao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        double resultado = numero1 + numero2;
        System.out.println("O resultado da adição é: " + resultado);
        
        scanner.close();
    }
    
    public static void realizarSubtracao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        double resultado = numero1 - numero2;
        System.out.println("O resultado da subtração é: " + resultado);
        
        scanner.close();
    }
    
    public static void realizarMultiplicacao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        double resultado = numero1 * numero2;
        System.out.println("O resultado da multiplicação é: " + resultado);
        
        scanner.close();
    }
    
    public static void realizarDivisao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o dividendo:");
        double dividendo = scanner.nextDouble();
        System.out.println("Digite o divisor:");
        double divisor = scanner.nextDouble();
        
        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Erro: divisão por zero!");
        }
        
        scanner.close();
    }
}
