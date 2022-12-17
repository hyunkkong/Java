/*====================================
	■■■ 연산자 (Operator)■■■
	- 조건 연산자 == 삼항 연산자
=====================================*/

// 사용자로부터 임의의문자 하나 입력받아
// 대문자이면 소문자로,소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;


public class Test029
{
	public static void main(String[] args)throws IOException
	{
		/*
		char ch;
		char strResult;

		System.out.printf("한 문자 입력 : ");
		ch = (char)System.in.read();
		
		strResult =  (ch >= 'A' && ch <= 'Z') ? (ch += 32) : (ch >= 'a' && ch <= 'z' ) ? 
			(ch -= 32) : ch;
		
		
		
		System.out.println(ch + "→" + strResult);
		System.out.printf("%c → %c",ch,strResult);
		*/
		
		/*
		char temp;
		

		System.out.print("한 문자 입력 :");
		temp = (char)System.in.read();
		
		

		//System.out.println("입력받은 값 확인 : " + temp);

		//대문자? 대문자아님?
		//temp == 'A'
		//temp == 'B'
		//temp == 'C'

		//Buffered의 readLine은 문자열로 읽어옴
		//두 개 이상의 조건이 등장하게 되면 무조건 논리연산
		//temp =  (temp <= 'A' && temp >= 'Z')? temp += 32 : ( temp <= 'a' && temp >= 'z') ? temp -= 32 : temp; 
		String result = temp >= 65 && temp <=90 ? "대문자" : "대문자아님";
		System.out.println("결과 : " + result);

		
		System.out.printf("%c → %c :",temp,result);
		*/

		//	대문자 → 소문자
		// 'A'(65) → 'a'(97)  ==> +32
		// 'B'(66) → 'b'(98)  ==> +32
		// 'C'(67) → 'c'(99)  ==> +32
			
		// 소문자 → 대문자
		// 'a'(97) → 'A'(65)  ==> -32
		// 'b'(98) → 'B'(66)  ==> -32

		char ch, result;

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		//result = () ? () : ();
		//result = (입력값대문자) ? (소문자로변환) : (입력값소문자 ? 대문자로변환 : 그대로)

		result = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32) : (ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch;
		System.out.println(ch +" → " + result);

		// Q (→ 81)
		// result = (81 >= 'A' && 81 <= 'Z') ? (char)(CH+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true && ch <= 'Z') ? (char)(ch+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true && 81 <= '90') ? (char)(ch+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true && true) ? (char)(ch+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (char)(ch+32) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (char)(81+32) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (char)(113) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (q) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = q

		//m ( → 109)
		//
		
	}
}

//실행결과
/*
한 문자 입력 : E
E → e
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : g
g → G
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : 7
7 → 7
계속하려면 아무 키나 누르십시오 . . .
*/