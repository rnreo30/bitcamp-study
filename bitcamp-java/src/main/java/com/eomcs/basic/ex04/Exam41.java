package com.eomcs.basic.ex04;

  public class Exam41 {

    public static void main(String[] args) {
    
      //문자 변수

      short s;
      char c;

      s = -32768;
      s = 32767;

      c = 0;    //char은 음수가 안되고 양수만가능 
      c = 65535; //범위를 벗어나면 컴파일오류

      char c1 = 65;
      char c2 = 0x41;
      char c3 = 0b0100_0001;
      char c4 = 'A'; //여기서 c4는 문자를 저장하는게 아니라 문자 코드값을 리턴함

      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);  //문자의 코드값에 해당하는 문자를 출력함

      int i1 = 'A';
      i1 = i1 + 10;
      System.out.println((char)i1);

      for (int i = 65; i < 'A' + 26; i++) {
        System.out.print((char)i);
      }

    }
  }

      