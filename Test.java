/*=============================================
	■■■ 클래스 고급 ■■■
	- 상속(Inheritance)
==============================================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르세요...
import java.util.Scanner;
class Aclass
{
	protected int x, y;
	protected char op;
	
	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n",x,op,y,result);
	}
}

// Aclass 를 상속받는 클래스로 설계
class Bclass extends Aclass
{
	void input()
	{
		Scanner sc = new Scanner(System.in);
		super.x = sc.nextInt();
		super.y = sc.nextInt();

	}
	
	@Override
	write();
	{
	}
}
public class Test
{
	public static void main(String[] args)
	{
		Bclass ob = new Bclass();
		
		//...
	}
}