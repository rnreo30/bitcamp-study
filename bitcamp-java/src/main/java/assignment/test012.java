package assignment;

import java.util.Scanner;

public class test012 {
  public static void main(String[] args ) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    
    int i = 0;
    while (i < width) {
      System.out.println("*");
      i++;
    }
      
    
    keyScan.close();
    
    
   
  }
}






