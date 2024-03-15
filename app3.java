import java.util.Scanner;

public class app3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma string para inverter: ");
    String input = scanner.nextLine();
    scanner.close();

    String reversedString = reverseString(input);

    System.out.println("String invertida: " + reversedString);
  }

  public static String reverseString(String input) {
    char[] chars = input.toCharArray();
    int left = 0;
    int right = chars.length - 1;

    while (left < right) {
      char temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;

      left++;
      right--;
    }

    return new String(chars);
  }
}