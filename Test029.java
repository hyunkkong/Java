/*====================================
	���� ������ (Operator)����
	- ���� ������ == ���� ������
=====================================*/

// ����ڷκ��� �����ǹ��� �ϳ� �Է¹޾�
// �빮���̸� �ҹ��ڷ�,�ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ �����̸� �� ���� �״�� ����ϴ�
// ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A �� a
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : b
// b �� B
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : 7
// 7 �� 7
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;


public class Test029
{
	public static void main(String[] args)throws IOException
	{
		/*
		char ch;
		char strResult;

		System.out.printf("�� ���� �Է� : ");
		ch = (char)System.in.read();
		
		strResult =  (ch >= 'A' && ch <= 'Z') ? (ch += 32) : (ch >= 'a' && ch <= 'z' ) ? 
			(ch -= 32) : ch;
		
		
		
		System.out.println(ch + "��" + strResult);
		System.out.printf("%c �� %c",ch,strResult);
		*/
		
		/*
		char temp;
		

		System.out.print("�� ���� �Է� :");
		temp = (char)System.in.read();
		
		

		//System.out.println("�Է¹��� �� Ȯ�� : " + temp);

		//�빮��? �빮�ھƴ�?
		//temp == 'A'
		//temp == 'B'
		//temp == 'C'

		//Buffered�� readLine�� ���ڿ��� �о��
		//�� �� �̻��� ������ �����ϰ� �Ǹ� ������ ������
		//temp =  (temp <= 'A' && temp >= 'Z')? temp += 32 : ( temp <= 'a' && temp >= 'z') ? temp -= 32 : temp; 
		String result = temp >= 65 && temp <=90 ? "�빮��" : "�빮�ھƴ�";
		System.out.println("��� : " + result);

		
		System.out.printf("%c �� %c :",temp,result);
		*/

		//	�빮�� �� �ҹ���
		// 'A'(65) �� 'a'(97)  ==> +32
		// 'B'(66) �� 'b'(98)  ==> +32
		// 'C'(67) �� 'c'(99)  ==> +32
			
		// �ҹ��� �� �빮��
		// 'a'(97) �� 'A'(65)  ==> -32
		// 'b'(98) �� 'B'(66)  ==> -32

		char ch, result;

		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();
		//result = () ? () : ();
		//result = (�Է°��빮��) ? (�ҹ��ڷκ�ȯ) : (�Է°��ҹ��� ? �빮�ڷκ�ȯ : �״��)

		result = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32) : (ch >= 'a' && ch <= 'z') ? (char)(ch-32) : ch;
		System.out.println(ch +" �� " + result);

		// Q (�� 81)
		// result = (81 >= 'A' && 81 <= 'Z') ? (char)(CH+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true && ch <= 'Z') ? (char)(ch+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true && 81 <= '90') ? (char)(ch+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true && true) ? (char)(ch+23) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (char)(ch+32) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (char)(81+32) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (char)(113) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = (true) ? (q) : (ch >= 'a' && ch <= 'z') ? (char)(ch-23) : ch;
		// result = q

		//m ( �� 109)
		//
		
	}
}

//������
/*
�� ���� �Է� : E
E �� e
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�� ���� �Է� : g
g �� G
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�� ���� �Է� : 7
7 �� 7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/