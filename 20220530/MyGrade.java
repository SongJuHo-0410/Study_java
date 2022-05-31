import java.util.Scanner;
/**
 * 여기에 Grade 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyGrade
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scan.nextInt();
        int science = scan.nextInt();
        int english = scan.nextInt();
        Grade me = new Grade(math,science,english);
        System.out.println("평균은 " + me.average());

        scan.close();
    }
}
