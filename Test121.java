/*=============================================
	■■■ 클래스 고급 ■■■
	-인터페이스(Interface)
==============================================*/

// ○ 실습 문제
//	  성적 처리 프로그램을 구현한다.
//	  단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 11
// 인원 수 입력(1~10) : 0
// 인원 수 입력(1~10) : 2

// 1번째 학생의 학번 이름 입력(공백 구분) : 2207123 최동현
// 국어 영어 수학 점수 입력	  (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2208225 최나윤
// 국어 영어 수학 점수 입력	  (공백 구분) : 85 70 65

// 2207123 최동현 90 100  85		xxx		xx.xx
//				  수  수  우
// 2208225 최나윤 85  70  65		xxx		xx.xx
//				  우  미  양
//
// 계속하려면 아무 키나 누르세요...

// 속성만 존재하는 클래스 → 자료형 활용
import java.util.Scanner;

class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot;				//-- 총합
	double avg;				//-- 평균
}

//인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 세팅
	public void input();	//-- 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
			
		}
		while (inwon<1 || inwon>10);

		rec = new Record[inwon];

	}
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<inwon ;i++ )
		{
			rec[i] = new Record();
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ",(i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;

		}	
	}

	@Override
	public void print()
	{
		for (int i=0;i<inwon ;i++ )
		{
			System.out.printf("%s %s %d %3d %3d %3d %8.2f\n",rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%s %s %s\n",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		}
		
	}
	
	// 내부적으로 등급에 대한 판정을 수행할 메소드
	
	private String panjung(int score)
	{
		String result;
		/*
		switch (score)
		{
		case (score>89) : result ="수"; break;
		case (score>79) : result ="우"; break;
		case (score>69) : result ="미"; break;
		case (score>59) : result ="양"; break;
		default : result ="가"; break;
		}
		*/

		if (score>=90)
			result ="수";
		else if (score>=80)
			result ="우";
		else if (score>=70)
			result ="미";
		else if (score>=60)
			result ="양";
		else
			result ="가";
		
		return result;
		
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test121 
{
	public static void main(String[] args)
	{
		
		Sungjuk ob;
		
		// 문제 해결 과정에서 작성해야 할 ob 구성 및 객체 생성
		ob = new SungjukImpl();
		ob.set();
		ob.input();
		ob.print();
	}
}