
/**
 * 여기에 Grade 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Grade
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int math;
    private int science;
    private int english;
    
    /**
     * Grade 클래스의 객체 생성자
     */
    public Grade(int math,int science,int english)
    {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public double average()
    {
        return ((double)math + (double)science + (double)english) / 3;
    }
}
