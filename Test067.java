/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- return문 실습
==============================================*/
//	return 실습

//	※ return 키워드가 지니는 두 가지 의미
//		1. 값의 반환
//		2. 메소드 종료

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s;

		System.out.print("임의의 정수 입력(10 이상) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");		//10이하 입력시 프로그램 종료
			return;
			//메소드 종료 → return 문을 포함하고 있는 메소드
			// → main() 메소드 → 프로그램 종료
		}
		s = 0;
		for (int i=1;i<=n ;i++ )			
		{
			s+=i;							//1~n(입력값)까지의 누적합
		} 
 		System.out.println("결과 : "+s);
	}
}
//