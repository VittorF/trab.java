public class Calc {

    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Método para divisão
    public static double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Erro: Divisão por zero!");
        }
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        System.out.println("Adição: " + adicao(num1, num2));

        System.out.println("Subtração: " + subtracao(num1, num2));

        System.out.println("Multiplicação: " + multiplicacao(num1, num2));

        try {
            System.out.println("Divisão: " + divisao(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
