package assignment;

import java.util.Scanner;

//현재 과제와 가장 유사한 값을 내는 소스코드를 가져온다.
public class test03 {
  public static void main(String[] args ) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    
    int line = 0;
    while (line++ < width) {
      int x = 0;
      while (x++ <line) {
        System.out.print("*");
        
      }
      System.out.println();
    }
    keyScan.close();
  }
}
    
        
     
      
    
    
    
   






