/*======================================
	�����ڹ� �⺻ ���α׷��֡���
- �ڹ��� �⺻ ����� : System.out.read()
=======================================*/
/*
��System.out.read()�� �޼ҵ�� (�Է� ��⿭�κ���) �� ���ڸ� �����´�
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�.
*/

//���� ��)
//�� ���� �Է�		: A
//�� �ڸ� ���� �Է�	: 9

// >> �Է��� ���� : A
// >>�Է��� ���� : 9
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test015
{
	public static void main(String [] args) throws IOException
	{
		/*
		// �ֿ� ���� ����
		char ch;		// ����


		// ���� �� ó��
		System.out.print("���� �ϳ� �Է��ϼ��� : ";		//	A
		//ch = System.in.read(); ����					//	65
		ch = (char)System.in.read();					// ��������ȯ
		// ��� ���
		System.out.println(ch);
		*/

		char ch;
		int n;
		
		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		System.in.skip(2);

		System.out.print("�� �ڸ� ���� �Է� : ");
		n = System.in.read();
		

		System.out.println("�� ���� �Է� : " + ch );
		System.out.println("�� �ڸ� ���� �Է� : " + (char)n );
	}
}