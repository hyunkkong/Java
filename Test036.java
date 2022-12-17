/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- if ��
	- if ~ else �� �ǽ�
==============================================*/

//	1.	���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//		�б� ���������ϱ� ���� ����ϴ� �������
//		if ��, if else ��, ���� ������, ���� if ��(if�� ��ø)
//		, switch ���� �ִ�.

//	2.	if ���� if ������ ������ ���� ���
//		Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 3
// ������ �Է�[+ - * /]

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String [] args)throws IOException
	{
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		 System.out.print("ù ��° ���� �Է� : ");
		 int num1 = Integer.parseInt(br.readLine());	//���� ���� ���ÿ� �� �Է�
		 System.out.print("�� ��° ���� �Է� : ");
		 int num2 = Integer.parseInt(br.readLine());
		 System.out.print("������ �Է�[+ - * /] : ");
		 char opr = (char)System.in.read(); // (char)System.in.read() : ���� �Է�

		 if (opr == '+')
		 {
			 System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		 }
		 else if (opr == '-')
		 {
			 System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
		 }
		 else if (opr == '*')
		 {
			 System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
		 }
		 else if (opr == '/')
		 {
			 System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
		 }
		 else
		{
			System.out.printf("������ �߻��մϴ�");
		}
		

		//��� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a, b;	// ù ��°, �� ��° ����
		char op;	//������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" �� Integer.parseInt() �� 1234
		//"abcd" �� Integer.parseInt() �� (x)
		//Integer.parseInt()

		//System.in.read() �ϳ��� ���� ���ڸ� int�� �ƽ�Ű�� �ڵ�� ��ȯ
		//Integer.parseInt() (���ڸ���� ���ڿ��� ����)
		
		System.out.print("������ �Է�[+ - * /] : ");
		//op = (char)Integer.parseInt(br.readLine()); ���� �߻�
		op = (char)System.in.read();

		// �׽�Ʈ (Ȯ��)
		//System.out.println("�Է��� ������ +" + op);

		// ����ڰ� �Է��� �����ڰ� '+'���
		// a�� b�� ���� ���� �����Ͽ� ���
		// ����ڰ� �Է��� �����ڰ� '-'���
		// a�� b�� ���� ���� �����Ͽ� ���

		//				:

		if (op == '+')
		{
			// a�� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d + %d = %d%n",a,b,(a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d%n",a,b,(a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d%n",a,b,(a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d%n",a,b,(a/b));
		}
		else
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�."); //���� �� �� �̿ܿ� �ٸ� ���� ������ ���
		}
		*/

		//��� ��
		/*BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a, b, op;	// ù ��°, �� ��° ����, ������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		if (op == 43) // ����ڰ� �Է��� �����ڰ� '+'���
		{
			// a�� b�� ���� ���� �����Ͽ� ���
			System.out.printf("\n>> %d + %d = %d%n",a,b,(a+b));
		}
		else if (op == 45)
		{
			System.out.printf("\n>> %d - %d = %d%n",a,b,(a-b));
		}
		else if (op == 42)
		{
			System.out.printf("\n>> %d * %d = %d%n",a,b,(a*b));
		}
		else if (op == 47)
		{
			System.out.printf("\n>> %d / %d = %d%n",a,b,(a/b));
		}
		else
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�."); //���� �� �� �̿ܿ� �ٸ� ���� ������ ���
		}
		*/


		//��� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int a, b, result=0; 
		char op;	

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();


		if (op == '+') // ����ڰ� �Է��� �����ڰ� '+'���
			// a�� b�� ���� ���� �����Ͽ� ���
			result = a+b;
		else if (op == '-')
			result = a=b;
		else if (op == '*')
			result = a*b;
		else if (op == '/')
			result = a/b;
		
		System.out.printf("%d %c %d = %d",a, op, b, result);
		*/
	}
}				
//���� ���
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
������ �Է�[+ - * /] : +
10 + 2 = 12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/