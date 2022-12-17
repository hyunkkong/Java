/*=============================================
	���� Ŭ���� ��� ����
	- ���(Inheritance)
==============================================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...
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

// Aclass �� ��ӹ޴� Ŭ������ ����
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