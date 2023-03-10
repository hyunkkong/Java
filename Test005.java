/*==================================
	■■■자바의 개요 및 특징■■■
	-변수와 자료형
	-키워드 및 식별자
	-printf()
===================================*/

public class Test005
{
	public static void main(String[] args)
	{
		// 변수 선언(메모리 확보) 및 초기화(메모리에 값 할당)
		int a = 10, b = 5;

		//변수 선언
		int c, d;
		
		// 연산 및 처리
		c = a + b; // a + b 의 결과값을 변수 c에 대입하라.
		d = a - b; // a - b 의 결과값을 변수 d에 대입해라.
	
		// 결과 출력 10 + 5 = 15
		System.out.println(a + "+" + b + "=" + c);
		//				숫자 문자열 숫자 문자열 숫자

		// 자바에서는 서로 다른 자료형의 데이터들끼리도
		// + 연산이 가능하며
		// 다른 어떤 자료형과 문자열 데이터의 『+』 연산 결과는 문자열
		// 즉 문자열 결합 연산자로써 『+』
		
		

		// print() / println() / printf() / format()

		// printf() / format() - dk 1.5부터 지원되는 메소드
		// 『%d』 (10진수 정수형) 는 서식 지정 옵션
		System.out.printf("%d %d %d%n",10,20,30);
		//『"%n"』은 개행
		System.out.printf("%d + %d = %d\n",10,20,30);
		//문자열 영역 안에서 사용되는 『"\n"』은 개행
		
		//System.out.printf("○와 △ \n", 10, 3.14);
		
		//System.out.printf("%d와 %d \n", 10, 3.14);
		// 에러 발생(런타임 에러) 특히 조심해야하는 에러
		System.out.printf("%d와 %f \n", 10, 3.14);
		// 출력 값 10 와 3.140000
		// 『%f』 실수형 서식 지정 옵션


		System.out.printf("%d와 %.2f \n", 10, 3.14);
		// 출력 값 10 와 3.14
		// 『%.2f』 : 소수점 이하 두 번째 자리까지 표현

		System.out.printf("%f%n", 3.141592);
		// 3.141592
		System.out.printf("%.4f%n", 3.141592);
		// 3.1416
		// 『%.2f』 : 소수점 이하 네 번째 자리까지 표현
		//				(반올림 발생)

	}
}

//실행 결과

/*
10+5=15
10 20 30
10 + 20 = 30
10와 3.140000
10와 3.14
3.141592
3.1416
계속하려면 아무 키나 누르십시오 . . .
*/