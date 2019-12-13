


import java.util.Scanner;

public class Test01 {

  public static void main(String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("계산할 첫번째 수를 입력하세요: ");

    int first = keyboard.nextInt();

    System.out.println("계산할 두번째 수를 입력하세요: ");

    int second = keyboard.nextInt();
    
    
    System.out.println("연산자를 선택하세요:\n+ = 1\n- = 2\n* = 3 \n/ = 4 \n ");
    
    int Operator = keyboard.nextInt();
    
    
    
    if (Operator == 1) {
      System.out.println(first+" 더하기 " + second +"값은" + first + second + "입니다");
    }else if(Operator == 2) {
      System.out.println(first+" 빼기 " + second +"값은" + (first + -second) + "입니다");
    }else if (Operator == 3) {
      System.out.println(first+" 곱하기 " + second +" 의 값은" + first * second + "입니다");
    }else if (Operator == 4) {
      System.out.println(first+" 나누기 " + second + " 의 값은 " + first / second + "입니다");
    }else {
      System.out.println("잘못입력하셨습니다.");
    }
      
    
    
    


  }

}











