/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- if 문
	- if ~ else 문 실습
==============================================*/
//	과제
//	사용자로부터 임의의 알파벳한 문자를 입력받아
//	이를 판별하여 입력받은 알파벳이 모음일 경우만
//	결과를 출력하는 프로그램을 구현한다.
//	단, 대소문자를 모두 적용할 수 있도록 처리한다.
//	또한, 알파벳 이외의 문자가 입력되었을 경우
//	입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 임의의 알파벳 한 문자 입력 : A ← 대문자 모음
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : e ← 소문자 모음
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : B ← 대문자 자음
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : 1 
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
public class Test039
{
	public static void main(String[] args) throws IOException
	{
		char ch;

		System.out.print("임의의 알파벳 한 문자 입력 : ");
		ch = (char)System.in.read();
		
		// 알파벳 모음 A, E, I, O, U
		// 알파벳 문자 입력, 알파벳이 아닐 경우 입력 오류
		// 알파벳 문자 모음 or 자음

		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) // 알파벳인 경우 
		{
			if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) // 대문자 모음
			{
				System.out.println("모음 OK~!!!");
			}
			else if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) // 소문자 모음
			{
				System.out.println("모음 OK~!!!");
			}
			else
			{
				System.out.print(""); //알파벳 자음
			}
		}
		else
		{
			System.out.println(">> 입력 오류~!!!"); // 알파벳이 아닌 경우
		}
	}

}

//실행결과
/*
임의의 알파벳 한 문자 입력 : A
모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 알파벳 한 문자 입력 : e
모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 알파벳 한 문자 입력 : B
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 알파벳 한 문자 입력 : 1
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/