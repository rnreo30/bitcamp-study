package com.eomcs.basic.ex03;

// 문자 리터럴
public class Exam41 {
  public static void main(String[] args) {
   
  //직접문자작성
  // '문자'
   System.out.println('A');
   System.out.println('가');
   
   // ucs-2 코드 값으로 문자를 지정가능
   // [\ u][UCS-2 코드]
   System.out.println('\u4eba');  
   System.out.println('\u0041');  //A 문자
   System.out.println('\u0030');  //0 문자
   System.out.println('\u0025');  //% 문자
   System.out.println('\uac00');  //가 문자

  //ASCII (7Bit)   ISO-8859-1(8Bit)    EUC-KR(16Bit)   
    
  }

}