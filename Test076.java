/*=============================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor)
==============================================*/

public class Test076
{
	int x;

	//	※	생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//		필요할 경우 인수를 받아들이는 것도 가능하고
	//		같은 이름의 메소드를 정의하는 중복정의가 가능하지만
	//		리턴값(반환값)은 가질 수 없다.

	//	※	생성자는 다른 일반 메소드처럼 호출될 수 없고,
	//		『new』 연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//		생성된 객체의 멤버를 초기화 시키는 작업을 수행하게 된다.

	Test076()
	{
		// ※ 생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.		다른메소드처럼...
		//	  하지만, 생성자 내부에서 가장 먼저 실행되어야 한다.		chack~!!!

		// 생성자 내부에서 또다른 생성자를 호출하는 구문
		//Test076(100);
		this(100);

		x = 10;

		System.out.println("인자 없는 생성자");
		//System.out.println("Test076이 갖고있는 x : ",this.x);
		System.out.println("Test076이 갖고있는 x : "+ x);
	}

	//Test076(int num)
	Test076(int x)
	{
		//x = num;
		//x = x;				// 둘 다 지역변수 x

		// 『this』 키워드~!!!

		//Test076.x = x;		// 논리적인 해석
		this.x = x;
		System.out.println("인자가 하나인 생성자");
		System.out.println("Test076이 갖고있는 x : " + this.x); 
	}

	//오버 로딩
	//매개변수의 타입이나 수가 다르면 
	

	public static void main(String[] args)
	{
		//Test076 클래스 기반 인스턴스 생성
		Test076 ob1 = new Test076();
		Test076 ob2 = new Test076(100);
		//
		/*
		인자가 하나인 생성자			//line26
		Test076이 갖고있는 x : 100		//line26
		인자 없는 생성자			
		Test076이 갖고있는 x : 10
		인자가 하나인 생성자
		Test076이 갖고있는 x : 100
		*/
		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob2.x : " + ob2.x);
		
		/*
		main 에서 ob1.x : 10
		main 에서 ob2.x : 100
		*/
	}
}
//실행결과
/*
*/