package com.bitcamp.myproject;

import java.util.Date;
import java.util.Scanner;

public class App {
    
  public static void main(String[] args) {
    
    java.util.Date today = new java.util.Date();
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("아이디를 입력하세요:");
    String id = keyboard.nextLine();
    
    
    System.out.println("비밀번호를 입력하세요 : ");
    String passward = keyboard.nextLine();
    
    System.out.println();
    
    System.out.printf("로그인되었습니다.\n");
    System.out.printf("로그인시간: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today); // 2019-12-12 12:37:45
    System.out.printf("\n안녕하세요  %s 님", id);
    
    //1$tP
    
    keyboard.close();
  }
}





    
    
