/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- switch �� �ǽ�
==============================================*/
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
// ù ��° ���� �Է�	: 3
// �� ��° ���� �Է�	: 17
// ������ �Է�[+ - * /] : -

//>> 3 - 17 = -14
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test043
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num1,num2; 
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch(op)
		{
			case '+' : System.out.printf(">> %d %c %d = %d\n",num1,op,num2,num1+num2);
				break;
			case '-' : System.out.printf(">> %d %c %d = %d\n",num1,op,num2,num1-num2);
				break;
			case '*' : System.out.printf(">> %d %c %d = %d\n",num1,op,num2,num1*num2);
				break;
			case '/' : System.out.printf(">> %d %c %d = %d\n",num1,op,num2,num1/num2);
				break;
			default : System.out.printf("�����߻�~!!!\n");
		}
		*/
		
		
		// �� ���
		/*
		int a, b, result;
		int op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();

		// + �� op:43, - op:45, * �� op:42, / �� op:47

		switch (op)
		{
		case 43: result = a + b; break;
		case 45: result = a - b; break;
		case 42: result = a * b; break;
		case 47: result = a / b; break;
		default : return;				//1. ���� ��ȯ
										//2. �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}
		System.out.println();
		System.out.printf(">>%d %c %d = %d\n",a,op,b,result);
		*/


		// �� ���
		int a,b,result; 
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();
		
		switch(op)
		{
			case '+' : result = a + b;
				break;
			case '-' : result = a - b;
				break;
			case '*' : result = a * b;
				break;
			case '/' : result = a / b;
				break;
			default : return;
		}
		
		System.out.printf(">>%d %c %d = %d%n", a, op, b, result);

	}
}

//���� ���
/*
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 17
������ �Է�[+ - * /] : -
>>3 - 17 = -14
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/