package exam01;

import java.util.Scanner;

public class NumMunja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // 하나의 문자만 입력받기
        System.out.print("하나의 문자만 입력: ");
        String input = scanner.nextLine();
        
        // 첫 번째 문자를 가져옴
        char inData = input.charAt(0);
        
        // 숫자(0~9) 판별
        if (inData >= '0' && inData <= '9') {
            System.out.println("입력한 문자는 숫자입니다: " + inData);
        }
        // 알파벳 대문자(A~Z) 또는 소문자(a~z) 판별
        else if ((inData >= 'A' && inData <= 'Z') || (inData >= 'a' && inData <= 'z')) {
            System.out.println("입력한 문자는 알파벳입니다: " + inData);
        }
        // 숫자나 알파벳이 아닌 경우
        else {
            System.out.println("입력한 문자는 숫자나 알파벳이 아닙니다.");
        }

        scanner.close();
    }
}
