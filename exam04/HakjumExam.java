package exam04;

public class HakjumExam {

    public static void main(String[] args) {
        int jumsu = 74; // 점수
        char grade;     // 학점 변수
        
        // 10으로 나누어 1의 자리 수를 추출 (예: 74 -> 7)
        int result = jumsu / 10;
        
        // 학점을 계산하는 switch문
        switch (result) {
            case 10:  // 100점
            case 9:   // 90~99점
                grade = 'A';
                break;
            case 8:   // 80~89점
                grade = 'B';
                break;
            case 7:   // 70~79점
                grade = 'C';
                break;
            case 6:   // 60~69점
                grade = 'D';
                break;
            default:   // 60점 미만
                grade = 'F';
                break;
        }
        
        // 결과 출력
        System.out.println("당신의 학점은 " + grade + " 입니다.");
    }
}
