/*=============================================
	���� Ŭ������ �ν��Ͻ� ����
==============================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// (Calculate Ŭ���� ����)

// ���� ��)
// ������ �� ���� �Է�(���� ����)	: 10 5
// ������ ������(+ - * /)			: +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

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
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.print("������ ������(+ - * /) : ");
		ch = (char)System.in.read();		// IOException �ʿ�
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

	int su1,su2;		// ����ڷκ��� �Է¹��� �� ������ ��Ƴ� ����
	char op;			// ����ڷκ��� �Է¹��� �����ڸ� ��Ƴ� ����

	// �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������(+ - * /) : ");
		op = (char)System.in.read();		
	}

	// �޼ҵ� ����(��� : ����) �� ������ ���굵 ���� ������� ó��
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


	// �޼ҵ� ����(��� : ���)
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
		cal.input();				//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int r = cal.cal();			//������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		cal.print(r);				//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��

	}
}
//������
/*
������ �� ���� �Է�(���� ����) : 10 5
������ ������(+ - * /) : + 
10 + 5 = 15.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/