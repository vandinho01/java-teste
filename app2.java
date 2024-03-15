import java.util.Scanner;

public class app2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
    int number = scanner.nextInt();
    scanner.close();

    if (isInFibonacciSequence(number)) {
      System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
    }

  }

  public static boolean isInFibonacciSequence(int number) {
    int a = 0;
    int b = 1;

    while (a <= number) {
      if (a == number) {
        return true;
      }
      int temp = a + b;
      a = b;
      b = temp;
    }

    return false;
  }
}
