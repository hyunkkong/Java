/*
======================================================================
■■■■■자바 프로그래밍■■■■■
-변수와 자료형
-자바 기본 입출력 : BufferedReader 클래스
=======================================================================
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		//키보드 장착(생성)
		//BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//문자를 읽어 들이는 상자( 객체 인스턴스 생성 )
								               //바이트 문자변역기
														        //바이트 입력값
	//주요 변수 선언
	int r;						//반지름
	final double PI = 3.14195;	//원주율.  변수의 상수화 final
	double a, b;				//원의 넓이,둘레


	//연산 및 처리
	//1. 사용자에게 안내 메세지 출력
	//->원에 반지름을 입력하세요.
	//System.out.println("원의 반지름 입력 : ");
	System.out.print("원의 반지름 입력 : ");


	//2. 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
	//r = br.readLine();	//BufferedRedader 의 readLine()
					//입력 대기열에 남아있는 "문자열"을 반환

	//r = "2546"; 못담는다.
	//"2546" parsInt("2546") 2546
	//"80"   parsInt("80")    80
	// Integer.parseInt("80")  80
	//매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
	// 단, 이때 넘겨받는 문자열 데이터는 숫자형태여야한다.

	r = Integer.parseInt(br.readLine());

	//r = Integer.parseInt("2546");
	//r = 2546;
	//사용자가 입력한 값을 br즉 BufferedReader의 readLine()
	//메소드를 활용하여 문자열 형태로 읽어들인 후
	//그 값을 integer.parseInt()를 통해 숫자형(정수형)으로 변환후
	//정수 형태의 반지름 변수 r 에 담아내기


	//3. 넓이 및 둘레 계산(연산)
	//   ---==>각각 변수 a, b에 담아내기
	a = r * r * PI;
	b = r * 2 * PI;



	//결과 출력
	//--==>변수 a와 b에 담겨있는 값 출력
	//System.out.println(">> 넓이 : " + a);
	//System.out.println(">> 둘레 : " + b);

	
	/*원의 반지름 입력 : 45
>> 넓이 : 6362.4487500000005
>> 둘레 : 282.7755
*/


	//반지름이 45인 원의 넓이는 6362.44 이며
	//반지름이 45인 원의 둘레는 282.74 이다.

	System.out.printf("반지름이 %d인 원의 넓이는 %.2f 이며, \n",r,a);
	System.out.printf("반지름이 %d인 원의 둘레는 %.2f 이다.\n",r,b);

	/*원의 반지름 입력 : 45
반지름이 45인 원의 넓이는 6362.45 이며,
반지름이 45인 원의 둘레는 282.78 이다.     */
		
	}
}