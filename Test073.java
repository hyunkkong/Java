/*=============================================
	■■■ 클래스와 인스턴스 ■■■
==============================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
// (Calculate 클래스 설계)

// 실행 예)
// 임의의 두 정수 입력(공백 구분)	: 10 5
// 임의의 연산자(+ - * /)			: +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;
class Calculate
{
	/*
	int num1,num2;
	char ch;
	double result;
	
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("임의의 연산자(+ - * /) : ");
		ch = (char)System.in.read();		// IOException 필요
	}
	
	double calculate()
	{
		if (ch == '+')	//43
		{
			result = num1+num2;
		}
		else if (ch == '-')	//45
		{
			result = num1-num2;
		}
		else if (ch == '*') //42
		{
			result = num1*num2;
		}
		else if (ch == '/')
		{
			result = num1/num2;
		}
		
		
		//switch (ch)
		//{
		//case '+': result = num1+num2
		//	break;
		//case '-': result = num1-num2
		//	break;
		//case '*': result = num1*num2
		//	break;
		//case '/': result = num1/num2
		//	break;
		//}



		return result;
	}

	void print(double r)
	{
		System.out.printf("%d %c %d = %.1f\n",num1,ch,num2,r);
	}
	*/

	int su1,su2;		// 사용자로부터 입력받은 두 정수를 담아낼 변수
	char op;			// 사용자로부터 입력받은 연산자를 담아낼 변수

	// 메소드 정의(기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("임의의 연산자(+ - * /) : ");
		op = (char)System.in.read();		
	}

	// 메소드 정의(기능 : 연산) → 나눗셈 연산도 정수 기반으로 처리
	int cal()
	{
		int result = 0;

		switch (op)
		{
		case '+': result = su1+su2;
			break;
		case '-': result = su1-su2;
			break;
		case '*': result = su1*su2;
			break;
		case '/': result = su1/su2;
			break;
		}
		return result;
	}


	// 메소드 정의(기능 : 출력)
	void print(int s)
	{
		System.out.printf("%d %c %d = %d\n",su1,op,su2,s);
	}
	
	



	
}

public class Test073
{ 
	public static void main(String[] args) throws IOException
	{
		
		Calculate cal = new Calculate();
		/*
		cl.input();
		double op = cl.calculate();
		cl.print(op);
		*/
		cal.input();				//생성한 인스턴스를 통한 입력 메소드 호출
		int r = cal.cal();			//생성한 인스턴스를 통한 연산 메소드 호출
		cal.print(r);				//생성한 인스턴스를 통한 출력 메소드 호출

	}
}
//실행결과
/*
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자(+ - * /) : + 
10 + 5 = 15.0
계속하려면 아무 키나 누르십시오 . . .
*/