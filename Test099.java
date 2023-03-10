/*======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스 설계
	- 배열의 활용
	- 접근제어지시자와 정보은닉
======================================*/

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(calender)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 잇또록 한다. (→ WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로...
// WeekDay 클래스 설계를 통해
// Test099 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 2022 7 15
// >> 2022년 7월 15 → 금요일
// 계속하려면 아무 키나 누르세요...

// ※ Hint
//	- 1년 1월 1일 → "월요일"
//	- 1년은 365일이 아니다
//	- 2월의 마지막 날짜가 29일 → 윤년
//	- 2월의 마지막 날짜가 28일 → 평년
//	- 윤년의 판별 조건
//		→ 년도가 4의 배수이면서 100의 배수가 아니거나, 400의 배수이면 윤년, 
//		   그 이외의 년도는 평년
/*
import java.util.Scanner;
class WeekDay
{
	//주요 변수
	private int y,m,d;

	void input()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	
	String week()
	{
		//
		String [] weekNames = {"일","월","화","수","목","금","토"};
		//2월은 if문에 의해 28or29로 대입
		int [] months={31,0,31,30,31,30,31,31,30,31,30,31};
		
		int totalDays,w;
		
		//년도가 4의 배수이면서 100의 배수가 아니거나, 400의 배수이면 윤년, 그 이외의 년도는 평년
		if (y%4==0 && y%100!=0 || y%400==0) // 윤년이면
		{	
			//2월의 마지막 날짜가 29일 
			months[1]=29;
			
		}
		else // 평년이면(윤년이 아니면)
		{
			//2월의 마지막 날짜가 28일 
			months[1]=28;
		}
		// 작년 총 일수
		totalDays = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		

		// 올해 저번달 총 일수 
		for (int i=0;i<(m-1) ;i++ )
		{	
			totalDays += months[i];
		}
		// 이번달 총 일수
		totalDays += d;
		
		w = totalDays%7;
		
		return weekNames[w];
		
	}
	
	void write(String day)
	{
		System.out.printf("%d년 %d월 %d → %s요일\n",y,m,d,day);
	}
	

}

public class Test099
{
	public static void main(String[] args)
	{
		//WeekDay 인스턴스 생성
		WeekDay ob = new WeekDay();
		//입력 메소드 호출
		ob.input();
		//
		String result=ob.week();
		// 출력 메소드 호출
		ob.write(result);
	}
}
*/
import java.util.Scanner;
class WeekDay
{
	// 주요 변수 선언 → 속성
	private int y, m, d;			// 사용자가 입력한 연, 월, 일을 담아낼 변수
	
	// 메소드 정의 → 기능 : 연, 월, 일 입력받기
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");	// 2022 7 15
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의 → 기능 : 요일 산출하기
	public String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		//테스트
		//System.out.println(months.length);
		
		// 각각 요일의 이름을 배열 형태로 구성
		String[] weekNames = {"일","월","화","수","목","금","토"};
		// 날 수를 종합할 변수
		int nalsu;

		// 윤년에 따른 2월의 날 수 계산
		// 입력 년도가 윤년이라면... 2월의 마지막 날짜를 29일로 설정
		// 입력 년도가 평년이라면... 2월의 마지막 날자를 28일로 설정
		if (y%4==0 && y%100!=0 || y%400==0)		// --입력년도가 윤년이라면...
		{
			//2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}
		//기본값을 28로 설정하거나 29로 설정하면 하나 생략이 가능하다.
		/*
		else									// --입력년도가 평년이라면...
		{
			//2월의 마지막 날자를 28일로 설정
			months[1] = 28;
		}
		*/

		// ① 1년 1월 1일부터 입력받은 년도의 이전 년도 12월 31일 까지의 날 수 계산
		//					  ---------------
		//							y
		//					  ----------------------------------------
		//													y-1

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		//		----------
		//		1년기본주기 --------
		//					4년마다+1 -----------
		//							 100년마다+1(x)----------
		//										   400년마다+1
		
		//테스트
		//System.out.println("날 수 :"+nalsu);
		// 년 월 일 입력(공백 구분) : 2022 7 15
		// 날 수 :738155
		//		  ------
		//			1년 1월 1일 ~ 2021년 12월 31일 까지의 날 수

		// ② 입력받은 월의 이전 월 까지의 날 수 계산 후 이 계산 결과를 1번 결과에 더하는 연산
		for (int i=0; i<(m-1) ;i++ )
		{
			nalsu += months[i];
		}
		// 테스트
		//System.out.println("날 수 :"+nalsu);
		// 년 월 일 입력(공백 구분) : 2022 7 15
		// 날 수 :738336
		//		  ------
		//			1년 1월 1일 ~ 2022년 6월 30일 까지의 총 날 수 
		
		
		
		// ③ 입력받은 일의 날짜만큼 날 수 계산 후 이 계산 결과를 2번 결과에 더하는 연산
		nalsu += d;
		//System.out.println("날 수 :"+nalsu);
		//년 월 일 입력(공백 구분) : 2022 7 15
		//날 수 :738351
		//		 -------
		//		1년 1월 1일 ~ 2022년 7월 15일 까지의 총 날 수

		//----------------------------------------------------------여기까지 수행하면 날 수 연산 끝~!!!
		
		// 무슨 요일인지 확인하기 위한 연산
		int w = nalsu % 7;		// 전체 날수 %7 == 0 → 일요일
								// 전체 날수 %7 == 1 → 월요일
								// 전체 날수 %7 == 2 → 화요일

		// 테스트
		// System.out.println("w :"+w);
		// 년 월 일 입력(공백 구분) : 2022 7 15

		return weekNames[w];
		
	}
	void print(String day)
	{
		System.out.printf(">> %d년 %d월 %d일 → %s요일\n",y,m,d,day);
	}

	// 메소드 정의 → 기능 : 결과 출력하기
}

public class Test099
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();
		wd.input();
		String result = wd.week();
		wd.print(result);
		
	}
}