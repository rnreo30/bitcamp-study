package assignment;

import java.util.Scanner;

//
public class test031 {
  public static void main(String[] args ) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    
    int line = 0;
    while (line++ < width) {
      if (line % 2== 0) {   //2로 나뉠경우
        continue;           //만 실행하게 해서 2칸씩 실행하게만듬ㅂ
      }
      int x = 0;
      while (x++ <line) {
        System.out.print("*");
        
      }
      System.out.println();
    }
    keyScan.close();
  }
}
    
        
     
      
    
    
    
   






