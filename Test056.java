/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- 반복문(do ~ while문) 실습 및 관찰
==============================================*/

//사용자로부터 여러 개의 양의 정수를 입력받고,
// 그 합을 계산하여 출력하는 프로그램을 작성한다.
// 단, -1이 입력되는 순간 입력 행위를 중지하고
// 그 동안 입력된 정수의 합을 출력해주는 프로그램을 구현한다.
// 즉, -1을 입력 중지 커맨드로 활용한다.
// do~while 문을 활용하여 문제를 해결할 수 있도록 한다.

//실행 예)
// 1번째 정수 입력(-1 종료) : 10
// 2번째 정수 입력(-1 종료) : 5
// 3번째 정수 입력(-1 종료) : 8
// 4번째 정수 입력(-1 종료) : 9
// 5번째 정수 입력(-1 종료) : -1

// >> 현재까지 입력된 정수의 합 : 
// 계속하려면 아무 키나 누르십시오 . . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test056
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num; // 사용자로부터 정수를 입력받을 변수
		int n=1; // 루프 변수

		do
		{
			System.out.printf("%d번째 정수 입력(-1 종료) :",n);
			num =Integer.parseInt(br.readLine());
			n++;
			
		}
		while (num!=-1);
		
		System.out.printf("현재까지 입력된 정수의 합 : %d%n :",(sum+1));
		*/
		
		
		// 주요 변수 선언 및 초기화
		int num; // 사용자로부터 입력값을 담아낼 변수
		int n=1; // 루프 변수를 활용하여 몇 번째 입력값인지를 담아낼 변수
		int sum=0; // 누적합을 담아낼 변수

		// 연산 및 처리

		do
		{
			System.out.printf("%d번째 정수 입력(-1 종료) :",n);
			num = Integer.parseInt(br.readLine());
			sum += num;											//sum을 num만큼 증가~!!!

			n++;

			
		}
		while (num!=-1); //num이 -1이 아닐 경우(계속해서 반복)

		//확인(테스트)
		//System.out.printf("-1 입력 확인");
			
		System.out.printf("\n현재까지 입력된 정수의 합 : %d%n :",(sum+1));
		// 결과 출력
		

	}
}

//실행 결과
/*
1번째 정수 입력(-1 종료) :15
2번째 정수 입력(-1 종료) :35
3번째 정수 입력(-1 종료) :84
4번째 정수 입력(-1 종료) :64
5번째 정수 입력(-1 종료) :-1
계속하려면 아무 키나 누르십시오 . . .
*/

//실행 결과
/*
1번째 정수 입력(-1 종료) :10
2번째 정수 입력(-1 종료) :10
3번째 정수 입력(-1 종료) :10
4번째 정수 입력(-1 종료) :1
5번째 정수 입력(-1 종료) :-1

현재까지 입력된 정수의 합 : 31
 :계속하려면 아무 키나 누르십시오 . . .

*/