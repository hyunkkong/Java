/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- 반복문(while문) 실습
==============================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
//			 나누어 떨어지지 않는 수.
//			 단, 1은 소수 아님.


// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나 누르세요...


//import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;		// 사용자의 입력값을 담아낼 정수

		int i = 2;		// 입력값을대상으로나눗셈 연산을 수행할 변수
						// 2부터 시작해서 1씩 증가

		
		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine()); 
		// 어떤 값을 입력받은 상태인지 알 수 없지만
		// 이 입력 값을 소수로 간주한다.
		boolean flag = true;

		while (i<num)
		{
			/*
			if (num%i!=0||num%2==i)
			{
				System.out.println(num + " → " + "소수");
				break;
			}
			else if
			{
				System.out.println(num + " → " +"소수 아님");
				break;
			}
			*/
			if (num%i==0)					//나누어 떨어지는 상황
			{
				flag = false;
				break;
			}
			
			i++;
		}
			if (flag && num!=1)
			{
				System.out.printf("%d → 소수\n",num);
			}
			else
			{
				System.out.printf("%d → 소수 아님\n",num);
			}

			/*
			if (num==1)
			{
				System.out.println(num + " → " + "소수 아님");
				break;
			}
			else if (num%2!=0||num%2==i)
			{
				System.out.println(num + " → " + "소수");
				break;
			}
			
			else
			{
				System.out.println(num + " → " +"소수 아님");
				break;
			}
			*/
		
		
		
	}
}

//실행결과
/*
임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .
*/
/*
*/