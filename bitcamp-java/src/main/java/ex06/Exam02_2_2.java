// 흐름 제어문 - switch 사용 후
package ex06;

import java.util.Scanner;

public class Exam02_2_2 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("[지원부서]");
    System.out.println("1. S/W개발");
    System.out.println("2. 일반관리");
    System.out.println("3. 시설경비");
    System.out.print("지원 분야의 번호를 입력하세요? ");
    int no = keyScan.nextInt();

    System.out.println("제출하실 서류는 다음과 같습니다.");
    switch (no) {
      case 1:
        System.out.println("정보처리자격증");
        // no의 값이 case에 해당되는 경우
        // break 명령을 만날 때까지 아래로 계속 실행한다.
      case 2:
        System.out.println("졸업증명서");
      case 3:
        System.out.println("이력서");
        break; // 여기까지만 실행한다.
      default:
        System.out.println("올바른 번호를 입력하세요!");
    }
  }
}