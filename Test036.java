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

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 3
// 연산자 입력[+ - * /]

// >> 10 + 3 = 13
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String [] args)throws IOException
	{
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		 System.out.print("첫 번째 정수 입력 : ");
		 int num1 = Integer.parseInt(br.readLine());	//변수 선언 동시에 값 입력
		 System.out.print("두 번째 정수 입력 : ");
		 int num2 = Integer.parseInt(br.readLine());
		 System.out.print("연산자 입력[+ - * /] : ");
		 char opr = (char)System.in.read(); // (char)System.in.read() : 문자 입력

		 if (opr == '+')
		 {
			 System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		 }
		 else if (opr == '-')
		 {
			 System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
		 }
		 else if (opr == '*')
		 {
			 System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
		 }
		 else if (opr == '/')
		 {
			 System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
		 }
		 else
		{
			System.out.printf("오류가 발생합니다");
		}
		

		//방법 ①
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a, b;	// 첫 번째, 두 번째 정수
		char op;	//연산자

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" → Integer.parseInt() → 1234
		//"abcd" → Integer.parseInt() → (x)
		//Integer.parseInt()

		//System.in.read() 하나의 단일 문자를 int형 아스키값 코드로 변환
		//Integer.parseInt() (숫자모양의 문자열을 받음)
		
		System.out.print("연산자 입력[+ - * /] : ");
		//op = (char)Integer.parseInt(br.readLine()); 에러 발생
		op = (char)System.in.read();

		// 테스트 (확인)
		//System.out.println("입력한 연산자 +" + op);

		// 사용자가 입력한 연산자가 '+'라면
		// a와 b의 덧셈 연산 수행하여 출력
		// 사용자가 입력한 연산자가 '-'라면
		// a와 b의 뺄셈 연산 수행하여 출력

		//				:

		if (op == '+')
		{
			// a와 b의 덧셈 연산 수행하여 출력
			System.out.printf("\n>> %d + %d = %d%n",a,b,(a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d%n",a,b,(a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d%n",a,b,(a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d%n",a,b,(a/b));
		}
		else
		{
			System.out.println("\n>> 입력 과정에 오류가 존재합니다."); //지정 된 값 이외에 다른 값을 전달할 경우
		}
		*/

		//방법 ②
		/*BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a, b, op;	// 첫 번째, 두 번째 정수, 연산자

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		if (op == 43) // 사용자가 입력한 연산자가 '+'라면
		{
			// a와 b의 덧셈 연산 수행하여 출력
			System.out.printf("\n>> %d + %d = %d%n",a,b,(a+b));
		}
		else if (op == 45)
		{
			System.out.printf("\n>> %d - %d = %d%n",a,b,(a-b));
		}
		else if (op == 42)
		{
			System.out.printf("\n>> %d * %d = %d%n",a,b,(a*b));
		}
		else if (op == 47)
		{
			System.out.printf("\n>> %d / %d = %d%n",a,b,(a/b));
		}
		else
		{
			System.out.println("\n>> 입력 과정에 오류가 존재합니다."); //지정 된 값 이외에 다른 값을 전달할 경우
		}
		*/


		//방법 ③
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a, b, result=0; 
		char op;	

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();


		if (op == '+') // 사용자가 입력한 연산자가 '+'라면
			// a와 b의 덧셈 연산 수행하여 출력
			result = a+b;
		else if (op == '-')
			result = a=b;
		else if (op == '*')
			result = a*b;
		else if (op == '/')
			result = a/b;
		
		System.out.printf("%d %c %d = %d",a, op, b, result);
		*/
	}
}				
//실행 결과
/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
연산자 입력[+ - * /] : +
10 + 2 = 12
계속하려면 아무 키나 누르십시오 . . .
*/