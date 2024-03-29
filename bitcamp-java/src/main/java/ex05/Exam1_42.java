// 산술 연산자 : 연산의 결과 타입  
package ex05;

public class Exam1_42 {
  public static void main(String[] args) {
    // int와 int의 연산 결과는 int이다.
    // 다른 타입이 될 수 없다.
    // => 0111 1111 1111 1111 1111 1111 1111 1111 = Integer.MAX_VALUE
    // 
    float f1 =987.6543f;
    float f2 = 1.111111f;
    System.out.println(f1);
    System.out.println(f2);
     
    
    
     float r1 = f1 + f2;
     System.out.println(r1);
     //
     
     
     double r2 = f1 + f2;
     System.out.println(r2);
    
    
    
  

    
    // 출력이유?
    // float 값(988.7654...)을 
    // double 변수에 저장할 때 정확하게 저장되지 않는다.
    // IEEE 754의 이진수 변환 문제때문이다.

    double d1 = 987.6543;
    double d2 = 1.111111;
    double r5 = d1 + d2; // = 988.765411
    System.out.println(r5);
  }
}

// 정리!
// - int와 int의 연산 결과는 int이다.
// - float과 float의 연산 결과는 float이다.
// - 즉 연산 결과는 피연산자의 타입과 같다.
// - 그래서 두 값을 계산했을 때 결과 메모리를 초과할 경우
//   값이 짤릴 수 있다.
//   주의하라!
// - 코드를 작성할 때 피연산자의 계산 결과가 피연산자의 메모리 크기를
//   벗어날 가능성이 있다면,
//   처음부터 피연산자의 값을 더 큰 메모리에 담아서 연산을 수행하라!
//   
//
// 형변환(type casting=type conversion)?
// - 변수나 리터럴을 다른 타입의 값을 바꾸는 것이다.
// - 주의!
//   원래 변수의 타입을 바꾸는 것이 아니다.
//   내부적으로는 변수에 들어 있는 값을 꺼내 
//   지정된 타입의 임시 메모리를 만들어 저장한다.
//
// 결론!
// 1) 자바의 최소 연산 단위는 int이다.
//    따라서 int 보다 작은 크기의 메모리 값을 다룰 때는
//    내부적으로 int로 자동 형변환을 수행한 다음에 연산을 수행한다.
//    내부적으로 자동 형변환하는 것을 
//    "암시적 형변환(implicit type conversion)"이라 부른다.
// => byte + byte = int
// => short + short = int
// => byte + short = int
// 
// 2) 연산 결과는 항상 피연산자의 타입과 같다.
// => int + int = int
// => long + long = long
// => float + float = float
// => double + double = double
//
// 3) 다른 타입과 연산을 수행할 때는 
//    내부적으로 같은 타입으로 맞춘 다음에 실행한다.
//    Exam01_5.java를 보라!