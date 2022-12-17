/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- if 문
	- if ~ else 문 실습
==============================================*/

//	1.	프로그램을 작성할 때 주어진 조건에 따라
//		분기 반향을정하기 위해 사용하는 제어문에는
//		if 문, if else 문, 조건 연산자, 복합 if 문(if문 중첩)
//		, switch 문이 있다.

//	2.	if 문은 if 다음의 조건이 참일 경우
//		특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner 를 활용하여 데이터를 입력받을 수 있도록 한다.

//실행 예)
// 임의의 정수 5개 입력(공백 구분) : 1 2 3 4 5
// >>짝수의 합은 6이고, 홀수의 합은 9입니다.
// 계속하려면 아무 키나 누르세요...
import	java.util.Scanner;
public class Test038
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		int tot1 = 0, tot2 = 0; // tot1는 홀수, tot2는 짝수
		
		System.out.print("임의의 정수 5개 입력(공백 구분) : "); 
		sc = new Scanner(sc.next())
		
		a =	sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		if (sc.nextInt() %2== 0) // 1 2 3 4 5 
		{
			tot1+=
		}
		else if ( sc.nextInt() %2 != 0)
		{
			tot2+=
		} 

		System.out.printf("짝수의 합은 %d이고, 홀수의 합은 %d 입니다. &n",tot1,tot2);
		*/

		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);

		//누적합 초기화
		int evenSum=0;	//짝수의 합을 담아낼 변수 선언(누적합)
		int oddSum=0;		//홀수의 합을 담아낼 변수 선언(누적합)
		int num1,num2,num3,num4,num5;

		//사용자로부터 입력받은 다섯 개의 정수를 담아낼 변수 선언

		// 연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백 구분) : "); // 1 2 3 4 5

		//스캐너는 정수형태로 읽어올 수 있다.
		//스캐너는 구분자 설정안해 줘도 공백 구분하여 입력받는다.
		num1 =	sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if(num1%2==0) //num1이 짝수일 때 → evenSum 을 num1 만큼 증가
			evenSum += num1; // evenSum 을 num1만큼 증가
		else
			oddSum += num1; // oddSum을 num1만큼 증가
		if(num2%2==0) 
			evenSum += num2; 
		else
			oddSum += num2; 
		if(num3%2==0) 
			evenSum += num3; 
		else
			oddSum += num3; 
		if(num4%2==0) 
			evenSum += num4; 
		else
			oddSum += num4; 
		if(num5%2==0) 
			evenSum += num5; 
		else
			oddSum += num5; 
		System.out.printf("짝수의 합은 %d이고, 홀수의 합은 %d 입니다. \n",evenSum,oddSum);



		

	}
}
//실행결과
/*
임의의 정수 5개 입력(공백 구분) : 1 2 3 4 5
짝수의 합은 6이고, 홀수의 합은 9 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/