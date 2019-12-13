package com.eomcs.basic.ex04.assignment;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++) {
          
          int com = (int)(Math.random() * 10) % 3 + 1;
          
          int input;
          while(true) {
            System.out.println("입력[1:가위,2:바위,3:보] ");
              input = keyboard.nextInt();
              if(input >= 1 && input <= 3) break;
              System.out.println("잘못입력하셨습니다.");
          }
            System.out.println();
            
            if(com ==1) {System.out.println("컴퓨터 :가위");;
            }else if(com ==2) {System.out.println("컴퓨터 : 바위");
            }else System.out.println("컴퓨터 : 보");
            
            System.out.println("결과");
            if(com == input) {
              System.out.println("비겼습니다");
            } else if (com==1 && input ==2 || com==2 && input==3 ||com==3 && input==1) {
               System.out.println("이겼습니다");
            }else {
                System.out.println("졌습니다");
            }
              System.out.println("------");
          
        }
    
        keyboard.close();
    
    

    
    
    

  }
}









