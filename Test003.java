/*=====================================
	■■■자바 기본 프로그래밍■■■
	-변수와 자료형
=====================================*/

public class Test003
{
	public static void main(String[] arg)
	{
		//main이름의 메서드 영역

		// 변수 선언
		int a;
		// 변수 a에 10의 값 저장, 대입(변수 초기화)
		a = 10;
		// 변수 선언 및 초기화(선언과 대입을 한번에 처리)
		int b = 20;
		
		//a = 30;

		int c;

		//System.out.println(c);
		//에러발생(컴파일 에러) 초기화x

		// 연산 및 처리

		c = a + b;
		System.out.println(c);
		// c = 10 + 20;
		// c = 30;
		// 변수 c에 30 대입해라.
		
		//System.out.println(a b c);
		//에러 발생(컴파일 에러)

		//※ 덧셈 연산자(+)
		// 피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
		// 산술연산자로써의 기능을 수행하는 것이 아니라
		// 문자열 결합 연산자로써의 기능을 수행하게 된다.

		// 결과출력		  ("10 20 30")
		System.out.println(a + " " + b + " " + c);

		System.out.println("a 의 값은 " + a + "입니다.");
		System.out.println("b 의 값은 " + b + "입니다.");
		System.out.println("c 의 값은 " + c + "입니다.");
		// 연산자를 사용하는 과정에서
		// 피연산자 중 문자열이 포함되어 있을 경우
		// 문자열 결합 연산자로 활용되며
		// 처리의 최종 결과는 문자열의 형태로 반환된다.

		System.out.println(1+2);	//산술연산자 +
		System.out.println("1"+2);	//문자열 결합연산자+
		System.out.println(1+"2");	//문자열 결합연산자+
		System.out.println("1"+"2");//문자열 결합연산자+
	}
}
