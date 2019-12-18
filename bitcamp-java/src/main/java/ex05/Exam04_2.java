// 비트 이동 연산자 : >>, >>>, << 
package ex05;

public class Exam04_2 {
    public static void main(String[] args) {
        int i = 0b01101001; // 105
        // >>비트 이동 연산자 사용법
        // 오른쪽으로 이동 후, 
        // 왼쪽 쪽 빈자리 : 원래 숫자와 같은 부로 값으로 채운다.
        //                  양수면 0, 음수면 1을 채운다.
        // 오른쪽 경계를 넘어간 비트 : 짜른다.
        

        System.out.println(i); 
        System.out.println(i >> 1); // 00110100|1 => 52
        System.out.println(i >> 2); // 00011010|0 => 26
        System.out.println(i >> 3); // 00001101|0 => 13
        System.out.println(i >> 4); // 00000110|1 => 6
        
        // 음수일 경우,
        i = 0b11111111_11111111_11111111_10101001; // -87
        System.out.println(i); 
        System.out.println(i >> 1); 
       

        System.out.println(i >> 2); 
        // 11_11111111_11111111_11111111_101010|01 => -22

        System.out.println(i >> 3); 
        // 111_11111111_11111111_11111111_10101|001 => -11
        
        System.out.println(i >> 4);
        // 1111_11111111_11111111_11111111_1010|1001 => -6
    }
}
