package com.bitcamp.myproject;

import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    //이곳에 자신의 업무,업무별 지시기간 , 지시받은 날짜 출력하기
    
    Scanner keyboard = new Scanner(System.in);
    
     System.out.printf("1.현재 진행중인업무");
     System.out.printf("2.새로운 업무");
     System.out.printf("3.종료");
     
     System.out.println("작업하실 업무를 선택하세요: ");
     String no = keyboard.nextLine();
     
     
     if (no == 1;) {
    
       System.out.println("현재 진행중인 업무입니다");
       System.out.println("현재 진행중인 업무목록 출력될 곳");
       System.out.println("업무 유효기간이 출력될곳 ex)2019-12-10 ~ 2019-12-31");
       System.out.println("업무 지시받은 날짜");
    
     }if else(no == 2;) {
       System.out.println("새로운 업무입니다");
     }if else(no == 3;) {
       System.out.println("종료되었습니다");
     }else {
       System.out.println("잘못입력하셨습니다");
     }
    
   
    
    

  }







}
