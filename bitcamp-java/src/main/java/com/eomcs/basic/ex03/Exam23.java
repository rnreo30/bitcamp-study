package com.eomcs.basic.ex03;


public class Exam23 {
  public static void main(String[] args) {
   //메모리 크기 유효값 범위

    
    System.out.println(-2147483648); // -2**31   : 4바이트 최소 음수값
    System.out.println(2147483647); // 2**31 - 1 : 4바이트 최대 양수값

    //System.out.println(-2147483649); // 4바이트 메모리 크기 초과
    //System.out.println(2147483648); // 4바이트 메모리 크기 초과
    

    System.out.println(-9_223_372_036_854_775_808L);
    System.out.println(-9_223_372_036_854_775_808l);
    System.out.println(-9_223_372_036_854_775_807L);
    System.out.println(-9_223_372_036_854_775_801l);
    
    System.out.println(100);   //4바이트 정수   
    System.out.println(100L);  //8바이트 정수는 L이라는 접미사를붙임
    
    System.out.println(Integer.MAX_VALUE);  
    System.out.println(Integer.MIN_VALUE);
    
    System.out.println(Long.MAX_VALUE);  
    System.out.println(Long.MIN_VALUE);
  }

}