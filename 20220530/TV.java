
/**
 * 여기에 TV 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class TV
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private String name;
    private int year;
    private int inch;

    /**
     * TV 클래스의 객체 생성자
     */
    public TV(String name, int year, int inch)
    {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public void show()
    {
        System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }
}
