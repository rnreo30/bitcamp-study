package com.eomcs.basic.ex04;

  public class Exam151 {

    public static void main(String[] args) {
     // 변수 선언위치 ? 쓰기전에 준비
     //c++ 부터는 쓰기전에만 변수 선언하면됨
     int i;
     
     i = 100;
     
      System.out.println(i);

      int j;
      j = i;

      i = 100;
      // 200 = 300 ; 오류
      //200 = i; 오류

      j = 300; // 값
      j = i; //변수
      j = i * 3; // 표현식
      j = Math.abs(-200); //표현식
      j = (i > 100) ? 1: -1; //표현식
   // j = System.out.println(100);  그냥 문장이다. 표현식이 아니다

      // 문

     
      
  
    }
  }

      