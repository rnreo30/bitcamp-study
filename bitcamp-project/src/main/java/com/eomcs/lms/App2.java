package com.eomcs.lms;
import java.sql.Date;
import java.util.Scanner;

public class App2 { 
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    int no1 = 0, no2 = 0, no3 = 0;
    String name1 = "", name2 = "", name3 = "";
    String email1 = "", email2 = "", email3 = "";
    int tel1 = 0, tel2 = 0, tel3 = 0;
    int count1 = 0, count2 = 0, count3 = 0;
    int pwd1 = 0, pwd2 = 0, pwd3 = 0;
    String photo1 = "", photo2 = "", photo3 = "";
    String response; // 계속입력받을지 선택하는 변수 지정
    Date date1 = null, date2 = null, date3 = null;

    
    
    
    
    
    
    System.out.print("번호? ");  //입력받기
    no1 = keyboard.nextInt();  //처음입력받은 값은 no1 이다
    keyboard.nextLine();   //줄바꿈용
    
    date1 = new Date(System.currentTimeMillis());
    
    System.out.print("이름? ");
    name1 = keyboard.nextLine(); //nextLine은 자동줄바꿈

    System.out.print("이메일? ");
    email1 = keyboard.nextLine();

    System.out.print("암호?");
    pwd1 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("사진?");
    photo1 = keyboard.nextLine();

    System.out.print("전화?");
    tel1 = keyboard.nextInt();
    
    System.out.println();
    
    System.out.print("계속 입력하시겠습니까? (y/n)");
    response = keyboard.nextLine();  //y,n중 값 입력받기
    
    if (response.equalsIgnoreCase("y")) {  //equalsIgnoreCases는 대문자,소문자상관없이 비교하는 메서드
      
      System.out.print("번호? ");  //입력받기
      no2 = keyboard.nextInt();  //처음입력받은 값은 no1 이다
      keyboard.nextLine();   //줄바꿈용
      
      date2 = new Date(System.currentTimeMillis());
      
      System.out.print("이름? ");
      name2 = keyboard.nextLine(); //nextLine은 자동줄바꿈
      
      System.out.print("이메일? ");
      email2 = keyboard.nextLine();
      
      System.out.print("암호?");
      pwd2 = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("사진?");
      photo2 = keyboard.nextLine();
      
      System.out.print("전화?");
      tel2 = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      
      response = keyboard.nextLine();
    
      if (response.equalsIgnoreCase("y")) {
       
      }
        System.out.print("번호? ");
        no3 = keyboard.nextInt();
        keyboard.nextLine();  // 줄바꿈 기호 제거용
        
        date3 = new Date(System.currentTimeMillis());
        
        System.out.print("이름? ");
        name3 = keyboard.nextLine();
        
        System.out.print("이메일? ");
        email3 = keyboard.nextLine();
        
        System.out.print("암호? ");
        pwd3 = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("사진? ");
        photo3 = keyboard.nextLine();
        
        System.out.print("전화? ");
        tel3 = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println();
      
    keyboard.close();
    System.out.println();
    
      }
    }
    System.out.printf("%d,%s,%s,%d",no1,name1,email1,tel1);
    System.out.printf("%d,%s,%s,%d",no2,name2,email2,tel2);
    System.out.printf("%d,%s,%s,%d",no3,name3,email3,tel3);
    
    
    
  }
}













    

