package com.eomcs.basic.ex99;

  public class Exam23 {

    public static void main(String[] args) {
     // 키보드 정보를 가져온다.

     
     java.util.Scanner scanner = new java.util.Scanner(System.in);
    
     System.out.print("입력>");
     int i1 =scanner.nextInt();
     int i2 =scanner.nextInt();
     String s = scanner.nextLine();

     System.out.println("-------------------------");


     System.out.println(i1);
     System.out.println(i2);
     System.out.println(s);

     // nextInt()   은 값을 만날때까지   nextLine()은 새로운 라인을 만나면 리턴  
     // => space, tab ,new line 기호를 만나면 그 앞까지 읽은 읿력 값을
     // int로 만들어 리턴한다.
     // => 현재 커서의 위치는 공백(white space; space/tab/whitespace);
     // 읽고 난후 공백을 제거하지않음
     // => 그래서 다음 메서드는 공백부터 읽게 된다.
     // => nextInt()는 앞에 공백이 있으면 무시한다.
     // 다음 공백을 만날 때까지 읽는다.
     // 
     // 결론은 
     // => nextInt()는 nextLine()을 만날떄
     //  nextLine()은 nextInt 가 읽은 값 다음부터 읽기때문에
     // 기대하지않는 값이 나온다.

     
      
    }
  }

      
      
      
            
          
      
            


