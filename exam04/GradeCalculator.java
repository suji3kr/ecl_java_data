package exam04;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // 점수 입력 받기
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt(); // 정수로 점수 입력 받음
        
        // 학점 계산
        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
        
        scanner.close();  // Scanner 객체 닫기
    }
}
