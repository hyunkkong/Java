/*===========================================
	���� �ڹ� �⺻ ���α׷��� ����
	-��� ������
	-BufferedReader
	-printf()
============================================*/

//����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� 
// ����ϴ� ������ printf() ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ� �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

//���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

//====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
//===============
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test021
{
	public static void main(String [] args)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("ù ��° ���� �Է� : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.printf("�� ��° ���� �Է� : ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("====[���]====\n");
		System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d%n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d%n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d%n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d%n",num1,num2,num1%num2); 
		//printf���� %�� ���� ����� ���� Ư���� �ǹ̷� ���̱� ������ %%�� �ؾ� %�� ��µȴ�.
		System.out.printf("===============\n");


	}
}

//���� ���

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
====[���]====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
===============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . . . .
*/