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

// ����ڷκ��� ������ ������ �Է¹޾�
// Ȧ�� / ¦���� �Ǻ��ϴ� ���α׷��� �����Ѵ�
// ��, ���� if ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// Ȧ��, ¦�� �� if �� ����
// Ȧ��, ¦�� �� if �� ��ø

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		/*
		if( n % 2 == 0)
		{
			System.out.printf(n + "�� ¦��");
		}
		if( n % 2 != 0)
		{
			System.out.printf(n +"�� Ȧ��");
		}
		*/

		/*
		if( n % 2 == 0)
		{
			System.out.printf("¦��");
		}
		else if( n % 2 != 0)
		{
			System.out.printf("Ȧ��");
		}
		*/
		/*
		if( n % 2 != 0)
		{
			System.out.printf(n + " �� ¦�� %n");
		}
		else if( n % 2 == 0)
		{
			System.out.printf(n + " �� Ȧ�� %n");
		}
		else 
		{
			System.out.printf(n + " �� �� %n");
		}
		*/

		//String result;
		String result = "���� �Ұ�";
		if( n==0)
		{
			result = "��";
		}
		else if (n%2==0)
		{
			result = "¦��";
		}
		else if (n%2!=0)
		{
			result = "Ȧ��";
		}
		//else
		//{
		//	result = "���� �Ұ�";
		//}

		System.out.println(n + " �� " + result);
		
	}
}