/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- 반복문(while문) 실습 및 관찰
==============================================*/

// 1부터 100까지의 정수 중에서
// 짝수들의 합과 홀수들의 합을 따로 구분하여 계산한다.
// 그리고 결과값을 출력하는 프로그램을 구현한다.
// 단, 반복문은 wile문을 사용할 수 있도록 하며,
// 조건 구문은 if조건문을 사용하여 작성할 수 있도록 한다.

// 실행 예)
// 1부터 100까지의 정수 중
// 짝수의 합 : 2550
// 홀수의 합 : 2500
// 계속하려면 아무 키나 누르세요...

public class Test046
{
	public static void main(String[] args)
	{
		/*
		int n = 0;
		int oddSum = 0;		//홀수
		int evenSum = 0;	//짝수

		
		while(n<=100)
		{
			if (n%2==0)
			{
				evenSum += n;
				n += 2;
			}
			else if (n%2!=0)
			{
				oddSum += n;
				n += 1;
			}
			else
			{
				System.out.print("판별 불가");
				return;
			}
		}
		System.out.println("홀수의 합 :" + oddSum);
		System.out.println("짝수의 합 :" + evenSum);
		*/
	
		int n=1;		//1부터 100까지 1씩 증가할 변수
		int even=0;		//짝수들의 누적합을 담아낼 변수
		int odd=0;		//홀수들의 누적합을 담아낼 변수
	
		// 연산 및 처리
		while(n<=100)
		{
			if (n%2==0)
			{
				even += n;
			}
			else if (n%2!=0)
			{
				odd += n;
			}
			else
			{
				System.out.print("판별 불가");
				return; // 메소드 종료 → main() 메소드 종료 → 프로그램 종료
			}
			n++;
		}
	}

}