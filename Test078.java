/*==============================================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor) 와 초기화 블럭 (Initialized Block)
==============================================================*/

// 초기화 블럭
//	

class Test078
{
	//클래스 내에서의 연산은 x

	//선언따로 값을 대입하는것 따로
	//전역변수 내에서 자바는 int를 0으로 초기화
	
	// 수행 불가능
	/*
	int n;
	int m;

	n=100;
	m=200;
	*/

	// 수행 가능
	/*
	int n = 100;
	int m = 200;	//선언과 동시에 초기화
	*/

	int n;
	int m;


	// 초기화 블럭(Initialized Block)
	{
		n=10;
		m=20;
		System.out.println("초기화 블럭 실행...");
	}
	
	// 생성자(Constructor) → 초기화 블럭이 코드를 먼저 수행했다 하더라도
	//						  최종적으로 해당 멤버들의 초기화 값을 결정하게 되는 것은
	//						  생성자~!!!
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}

	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수가 있는 생성자 실행...");
	}

	// 멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n : " + n + ",m : "+ m);
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();

		Test078 ob2 = new Test078(1234, 2345);
		ob2.write();
	}
}

//실행 결과

/*
초기화 블럭 실행...
생성자 실행...
n : 100,m : 200

초기화 블럭 실행...
매개변수가 있는 생성자 실행...
n : 1234,m : 2345

계속하려면 아무 키나 누르십시오 . . .
*/