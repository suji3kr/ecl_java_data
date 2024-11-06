ppackage exam05;

public class Factorial {

    // 재귀 호출을 이용한 팩토리얼 계산
    public static int factorial(int n) {
        // 종료 조건: n이 0일 때 1을 반환
        if (n == 0) {
            return 1;
        }
        // 재귀 호출: n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;  // 예시로 5!을 계산
        
        // 팩토리얼 계산 결과 출력
        System.out.println(number + "의 팩토리얼은 " + factorial(number) + "입니다.");
    }
}
