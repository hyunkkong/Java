/*=============================================
	■■■ 지역변수와 전역변수 ■■■
	- 지역 변수의 초기화 테스트
==============================================*/

//Test068.java 와 비교~!!!

public class Test069
{
	//클래스 영역

	//전역 변수 a 선언
	int a;
	// 자동으로 0으로 초기화 지원

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		//메소드 영역

		//System.out.println("a : " + a);
		//에러 발생(컴파일 에러)
		//non-static variable a cannot be referenced from a static context

		//test069 클래스를 기반으로 인스턴스 생성
		Test069 ob = new Test069();
		
		//int n1 = 10; n1에 값이 저장되어있음
		//Test n2 = new Test069;	n2에 주소값이 저장되어있음
		System.out.println("ob.a : " + ob.a);
		//ob.a : 0
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);
		
		//ob.b : false
		//ob.c :
		//ob.d : 0.0
	}
}
