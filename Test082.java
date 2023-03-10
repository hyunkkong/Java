/*===============================
	■■■ 배열 ■■■
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
================================*/

// 사용자로부터 인원수를 입력받고
// 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
// 이렇게 입력받은 데이터를 이름 배열과 전화번호 배열로 구성하여
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 27
// 입력 처리할 학생 수 입력(명, 1~10) : -5
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 정미경 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 조영관 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 최나윤 010-3333-3333

//-----------------------
// 전체 학생 수 : 3
//-----------------------
// 이름		전화번호
// 정미경	010-1111-1111
// 조영관	010-2222-2222
// 최나윤	010-3333-3333
//-----------------------
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

public class Test082
{
	public static void main(String[] args) throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);
		int n;		//학생 수 입력받을 변수
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			n = sc.nextInt();
		}
		while (1>n || 10<n);		// 1~10명

		String[] name = new String[n];
		String[] pn = new String[n];

		for (int i=0; i<n; i++ )
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i+1);
			
			name[i] = sc.next();
			pn[i] = sc.next();
		}

		System.out.println("-----------------------");
		System.out.printf("전체 학생 수 : %d\n",n);
		System.out.println("-----------------------");
		System.out.printf(" 이름		전화번호 \n");
		for (int i=0; i<name.length ;i++ )
		{
			System.out.println(name[i] + "       " + pn[i]);
		}
		System.out.println("-----------------------");
		*/
	
		
		//강사님
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//사용자가 입력하는 학생 수를 담아낼 변수
		int memberCount = 0;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memberCount = sc.nextInt();
		
		}
		while (memberCount<1 || memberCount>10);
		
		// 사용자가 입력한 인원 수를 토대로
		// 이름 배열과 전화번호 배열을 생성해야 한다.

		// 인원 수 만큼의 이름 저장 배열 구성
		String[] names = new String[memberCount];
		
		// 인원 수 만큼의 전화번호 저장 배열 구성
		//String[] tels = new String[memberCount];
		String[] tels = new String[names.length];

		// 인원 수 만큼의 안내 메세지 출력 및 입력값 담기
		//for (int i=0; i<names.length ;i++ )
		//for (int i=0; i<tels.length ; i++ )
		for (int i=0; i<memberCount ;i++ )
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",(i+1));
			// 고연수 010-1111-1111
			// ------
			names[i] = sc.next();

			// 고연수 010-1111-1111
			//		  --------------
			tels[i] = sc.next();
		}
		//최종 결과
		System.out.println("-----------------------");
		System.out.printf("전체 학생 수 : %d\n",memberCount);
		System.out.println("-----------------------");
		System.out.printf(" 이름			전화번호 \n");
		//memberCount == names.length == tels.length
		//학생 리스트 출력
		for (int i=0; i<memberCount ;i++ )
		{
			System.out.println(names[i] + "       " + tels[i]);
		}
		System.out.println("-----------------------");
		
	}
}
//실행결과
/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 정미경 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 조영관 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 최나윤 010-3333-3333
-----------------------
전체 학생 수 : 3
-----------------------
 이름           전화번호
정미경       010-1111-1111
조영관       010-2222-2222
최나윤       010-3333-3333
-----------------------
계속하려면 아무 키나 누르십시오 . . .
*/



