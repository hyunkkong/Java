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

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 753
// �� ��° ���� �Է� : 42
// �� ��° ���� �Է� : 127

// >> ���� ��� : 42 127 753
// ����Ϸ��� �ƹ� Ű�� ��������...




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test037
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*int num1,num2,num3;
		
		System.out.printf("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.printf("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.printf("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
		*/
		
		//�׽�Ʈ
		/*
		System.out.printf("%d %d %d",num1,num2,num3);
		*/

	
		/*
		if (num1 > num2 && num2 > num3)
		{
			System.out.printf(">>���İ�� : %d %d %d%n",num3,num2,num1);
		}
		else if (num1 > num3 && num3 > num2)
		{
			System.out.printf(">>���İ�� : %d %d %d%n",num2,num3,num1);
		}	
		else if (num2 > num1 && num1 > num3)
		{
			System.out.printf(">>���İ�� : %d %d %d%n",num3,num1,num1);
		}
		else if (num2 > num3 && num3 > num1)
		{
			System.out.printf(">>���İ�� : %d %d %d%n",num1,num3,num2);
		}
		else if (num3 > num1 && num1 > num2)
		{
			System.out.printf(">>���İ�� : %d %d %d%n",num2,num1,num3);
		}
		else if (num3 > num2 && num2 > num1)
		{
			System.out.printf(">>���İ�� : %d %d %d%n",num1,num2,num3);
		}
		*/

		int a, b, c;
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		//�� ù ��° ���� vs �� ��° ���� ũ�� ��
		//		�� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		//�� ù ��° ���� vs �� ��° ���� ũ�� ��
		// 		�� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

		//�� �� ��° ���� vs �� ��° ���� ũ�� ��
		//		�� �� ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�
		
		
		
		if(a > b) //�� ù ��° ������  �� ��° ����
		{
			a=a^b;
			b=b^a;
			a=a^b;

		}
		if(a > c) //�� ù ��° ������ �� ��° �������� ũ�ٸ�
		{
			a=a^c;
			c=c^a;
			a=a^c;

		}
		if (b > c) //�� �� ��° ������ �� ��° �������� ũ�ٸ�
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}
		System.out.printf("%d %d %d%n",a,b,c);


		
	}
}
//������
/*
ù ��° ���� �Է� : 753
�� ��° ���� �Է� : 42
�� ��° ���� �Է� : 127
>>���İ�� : 42 127 753
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/