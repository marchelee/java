import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    System.out.println("Input a value");
    System.out.println("\n");

    Scanner scanner = new Scanner(System.in);
    //int a = scanner.nextInt();
    char c = scanner.next().charAt(1);

    System.out.println("value: " + c);


  }
}