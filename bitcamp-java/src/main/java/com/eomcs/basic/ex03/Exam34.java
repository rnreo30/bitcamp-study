package com.eomcs.basic.ex03;


public class Exam34 {
  public static void main(String[] args) {
   
    //8바이트
    System.out.println(Double.MAX_VALUE); 
    System.out.println(Double.MIN_VALUE); 
    
  
    //4바이트
    System.out.println(Float.MAX_VALUE); 
    System.out.println(Float.MIN_VALUE); 
    

    
    System.out.println(3.1415926535f);    
    System.out.println(3.141592f);
    System.out.println(314159.26f);

    //4바이트 메모리 저장 부동소수점은 소수점위치관계x 숫자 개수7 
    //정상적으로 넣고 꺼낼 수 있는 부동소수점의 숫자 개수를 유효자릿수 라고 부른다
    // 부동소수점은 메모리에서 꺼낸값을 내부의규칙을에따라 jvm이 보정해준다
    // 100%정확하게 꺼내지못하는이유는 부동소수점을 2진수로 바꿀때 IEEE 754 규칙에 따라 변경하는데
    // 이 규칙에서 일부 부동소수점은 2진수로 정확히 변경되지 못하는 문제가 있다.
    

    System.out.println(3.141592653589793);



    System.out.println((1.1f + 0.2f) == 1.3f);
  }

}
//부동 소수점을 2진수로 변환하는 규칙
// IEEE 754 