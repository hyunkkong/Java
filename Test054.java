/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- 반복문(while문) 실습
==============================================*/

// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//		:
// 7 * 9 = 63
// 계속하려면 아무 키나 누르세요...

// 원하는 단 (구구단) 입력 : 11
// 1부터 9까지의 정수만 입력이 가능합니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args)throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan;				//사용자로부터 입력값을 정수 형태로 담아낼 변수(단)
		int num=1;
		int result;

		//연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer.parseInt(br.readLine());
		
		result = dan*num;

		/*
		if (dan<=9)
		{
			while (num<=9)
			{	
				System.out.printf("%d x %d = %d\n",dan,num,result);
				num++;
			}
		}
		else
		{
			System.out.print("오류 발생~!!!\n");
			return;
		}
		*/
		if (dan>9 || dan<1)
		{
			System.out.print("1부터 9까지의 정수만 입력 가능합니다.\n");
			return;
		}
		while (num<=9)
			{	
				System.out.printf("%d x %d = %d\n",dan,num,result);
				num++;
			}
			
	}
}

//실행 결과
/*
원하는 단(구구단) 입력 : 7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
계속하려면 아무 키나 누르십시오 . . .
*/
/*
원하는 단(구구단) 입력 : 12
오류 발생~!!!
계속하려면 아무 키나 누르십시오 . . .
*/