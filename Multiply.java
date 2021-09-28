import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while(true){
      System.out.print("곱하고자 하는 두 수 입력 >>");
      try {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(n + "x" + m + "=" + n*m);
        break;
      }
      catch(InputMismatchException e) {
        System.out.println("입력한 수가 정수가 아닙니다.");
        scanner.nextLine(); //버퍼 비워주기
      }
    }
    scanner.close();
  }
}