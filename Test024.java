/*===========================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 비트 단위 연산자
	- 두 변수에 담겨있는 내용(값)바꾸기 → 스왑(swap)
		→ 『xor』 연산자 활용~!!!
============================================*/


public class Test024
{
	public static void main(String [] args)
	{
		//주요 변수 선언 및 초기화
		int x = 20, y = 23;
		//int temp;					// 임시 저장 변수(빈컵)

		//담겨있는 내용물 확인
		System.out.printf(" x → %d, y → %d\n",x,y); 

		//연산 및 처리
		/*
		temp = x;
		x = y;
		y = temp;
		*/

		/*
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		*/
		y = y ^ x;
		x = x ^ y;
		y = y ^ x;

		//최종 결과 처리 → 담겨있는 내용물 확인
		System.out.printf(" x → %d, y → %d\n",x,y); 
	}
}

//
/*
x → 20, y → 23
 x → 23, y → 20
계속하려면 아무 키나 누르십시오 . . .
*/

/*

x = x ^ y;			→ x:20		y:23
					→ x = 20 ^ 23

					00010100 → 20
				^	00010111 → 23
				-------------------
					00000011 → 3

					→ x = 3


y = y ^ x;			→ y:23		x:3
					→ y = 23 ^ 3
				
					
					00010111 → 23
				^	00000011 →  3
				-------------------
					00010100 → 20
					
					→ y = 20


x = x ^ y;			→ x:3		y:20
					→ x = 3 ^ 20

					00000011 →  3
				^	00010100 → 20
				-------------------
					00010111 → 23

					→ y = 23
			









*/