package exam_2;

import java.util.Scanner;

public class NumberCheck {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("입력한 숫자 양수");
        } else if (number < 0) {
            System.out.println("입력한 숫자 음수");
        } else {
            System.out.println("입력한 숫자는 0");
        }
        
        scanner.close();
    }
}