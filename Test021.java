/*===========================================
	■■■ 자바 기본 프로그래밍 ■■■
	-산술 연산자
	-BufferedReader
	-printf()
============================================*/

//사용자로부터 임의의 정수를 두 번 입력받아
// 사칙연산 및 나머지 연산을 수행하여
// 그 
// 출력하는 과정은 printf() 결과를 출력하는 프로그램을 구현한다.
// 단, 입력받는 과정은 BufferedReader 를 활용할 수 있도록 하고 메소드를 활용할 수 있도록 한다.
// 또한, 나수셈 연산은 편의상 정수 기반으로 처리한다.

//실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2

//====[결과]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
//===============
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test021
{
	public static void main(String [] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("첫 번째 정수 입력 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.printf("두 번째 정수 입력 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("====[결과]====\n");
		System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d%n",num1,num2,num1%num2); 
		//printf에선 %는 포맷 출력을 위한 특수한 의미로 쓰이기 때문에 %%를 해야 %가 출력된다.
		System.out.printf("===============\n");


	}
}

//실행 결과

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
====[결과]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
===============
계속하려면 아무 키나 누르십시오 . . . . .
*/