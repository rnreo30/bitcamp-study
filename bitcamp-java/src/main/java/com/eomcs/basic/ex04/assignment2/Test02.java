import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("값1?");
    int a = keyboard.nextInt();

    System.out.println("값2?");
    int b = keyboard.nextInt();

    System.out.println("연산자");
    String op = keyboard.next();

    keyboard.close();

    int result;

    if (op.equals("+")) {
      result = a + b;
    }else if(op.equals("-")) {
      result = a - b;
    }else if (op.equals("*")) {
      result = a * b;
    }else if (op.equals("/")) {
      result = a / b;
    }else {
      System.out.println("사용할 수 없는 연산자입니다.");
      ruturn;
    }
    System.out.printf(" => %d , %s ,%d = %d\n", a , op , b , result);
  }
}

    
