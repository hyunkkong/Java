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

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 753
// 두 번째 정수 입력 : 42
// 세 번째 정수 입력 : 127

// >> 정렬 결과 : 42 127 753
// 계속하려면 아무 키나 누르세요...




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*int num1,num2,num3;
		
		System.out.printf("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.printf("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.printf("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());
		*/
		
		//테스트
		/*
		System.out.printf("%d %d %d",num1,num2,num3);
		*/

	
		/*
		if (num1 > num2 && num2 > num3)
		{
			System.out.printf(">>정렬결과 : %d %d %d%n",num3,num2,num1);
		}
		else if (num1 > num3 && num3 > num2)
		{
			System.out.printf(">>정렬결과 : %d %d %d%n",num2,num3,num1);
		}	
		else if (num2 > num1 && num1 > num3)
		{
			System.out.printf(">>정렬결과 : %d %d %d%n",num3,num1,num1);
		}
		else if (num2 > num3 && num3 > num1)
		{
			System.out.printf(">>정렬결과 : %d %d %d%n",num1,num3,num2);
		}
		else if (num3 > num1 && num1 > num2)
		{
			System.out.printf(">>정렬결과 : %d %d %d%n",num2,num1,num3);
		}
		else if (num3 > num2 && num2 > num1)
		{
			System.out.printf(">>정렬결과 : %d %d %d%n",num1,num2,num3);
		}
		*/

		int a, b, c;
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		//① 첫 번째 정수 vs 두 번째 정수 크기 비교
		//		→ 첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

		//② 첫 번째 정수 vs 세 번째 정수 크기 비교
		// 		→ 첫 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

		//③ 두 번째 정수 vs 세 번째 정수 크기 비교
		//		→ 두 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈
		
		
		
		if(a > b) //① 첫 번째 정수가  두 번째 정수
		{
			a=a^b;
			b=b^a;
			a=a^b;

		}
		if(a > c) //② 첫 번째 정수가 세 번째 정수보다 크다면
		{
			a=a^c;
			c=c^a;
			a=a^c;

		}
		if (b > c) //③ 두 번째 정수가 세 번째 정수보다 크다면
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.printf("%d %d %d%n",a,b,c);


		
	}
}
//실행결과
/*
첫 번째 정수 입력 : 753
두 번째 정수 입력 : 42
세 번째 정수 입력 : 127
>>정렬결과 : 42 127 753
계속하려면 아무 키나 누르십시오 . . .
*/