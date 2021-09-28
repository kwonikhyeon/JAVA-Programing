import java.util.Scanner;

public class Main2 {
  public static void main (String[] argv) {
    int [] unit = {50000, 10000, 1000, 500, 50, 10, 1};
    Scanner scanner = new Scanner(System.in);

    System.out.print("금액을 입력하시오 >>> ");
    int money = scanner.nextInt();
    int change;
  
    for(int i=0;i<unit.length;i++){
      change = money%unit[i];
      //System.out.println(change + "  " + money);
      System.out.println(unit[i] + "원 짜리 : "+ money/unit[i] + "개");
      money = change;
    }
    scanner.close();
  }
}

/* 자바에서 리스트를 다루는 새로운 방법(for-each)
(인덱스도 가능하지만 인덱스보다 쉬운 방법)
for(int x: unit){
  abcde
}
*/