/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- 반복문(while문) 실습
==============================================*/
// ○ 과제
//		사용자로부터 임의의 정수를 입력받아
//		1부터 입력받은 그 정수까지의
//		전체 합과, 짝수의 합과, 홀수의 합을
//		각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 284
// >> 1~ 264 까지 정수의 합 : xxxx
// >> 1~ 264 까지 짝수의 합 : xxxx
// >> 1~ 264 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num; // 사용자의 입력값을 담아낼 정수
		int sum=0, even=0, odd=0; //누적합,짝수합,홀수합을 담아낼 정수
		int n=1; // 루프 변수

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine()); 

		while (n<=num) 
		{
			sum+=n; //정수의 합

			if (n%2==0)
			{		
				even+=n; //짝수의 합
			}
			
			else if (n%2==1)
			{
				odd+=n; //홀수의 합
			}
			
			n++;
			
		}
		System.out.printf("1~ %d 까지 정수의 합 : %d%n",num,sum);
		System.out.printf("1~ %d 까지 짝수의 합 : %d%n",num,even);
		System.out.printf("1~ %d 까지 홀수의 합 : %d%n",num,odd);
				
	}
}
//실행 결과
/*
임의의 정수 입력 : 100
1~ 100 까지 정수의 합 : 5050
1~ 100 까지 짝수의 합 : 2550
1~ 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .		
*/
/*
임의의 정수 입력 : 264
1~ 264 까지 정수의 합 : 34980
1~ 264 까지 짝수의 합 : 17556
1~ 264 까지 홀수의 합 : 17424
계속하려면 아무 키나 누르십시오 . . .
*/