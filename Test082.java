/*===============================
	���� �迭 ����
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
================================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ���̰� 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : �ֳ��� 010-3333-3333

//-----------------------
// ��ü �л� �� : 3
//-----------------------
// �̸�		��ȭ��ȣ
// ���̰�	010-1111-1111
// ������	010-2222-2222
// �ֳ���	010-3333-3333
//-----------------------
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

public class Test082
{
	public static void main(String[] args) throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);
		int n;		//�л� �� �Է¹��� ����
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			n = sc.nextInt();
		}
		while (1>n || 10<n);		// 1~10��

		String[] name = new String[n];
		String[] pn = new String[n];

		for (int i=0; i<n; i++ )
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i+1);
			
			name[i] = sc.next();
			pn[i] = sc.next();
		}

		System.out.println("-----------------------");
		System.out.printf("��ü �л� �� : %d\n",n);
		System.out.println("-----------------------");
		System.out.printf(" �̸�		��ȭ��ȣ \n");
		for (int i=0; i<name.length ;i++ )
		{
			System.out.println(name[i] + "       " + pn[i]);
		}
		System.out.println("-----------------------");
		*/
	
		
		//�����
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		
		}
		while (memberCount<1 || memberCount>10);
		
		// ����ڰ� �Է��� �ο� ���� ����
		// �̸� �迭�� ��ȭ��ȣ �迭�� �����ؾ� �Ѵ�.

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];
		
		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		//String[] tels = new String[memberCount];
		String[] tels = new String[names.length];

		// �ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ���
		//for (int i=0; i<names.length ;i++ )
		//for (int i=0; i<tels.length ; i++ )
		for (int i=0; i<memberCount ;i++ )
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ",(i+1));
			// ���� 010-1111-1111
			// ------
			names[i] = sc.next();

			// ���� 010-1111-1111
			//		  --------------
			tels[i] = sc.next();
		}
		//���� ���
		System.out.println("-----------------------");
		System.out.printf("��ü �л� �� : %d\n",memberCount);
		System.out.println("-----------------------");
		System.out.printf(" �̸�			��ȭ��ȣ \n");
		//memberCount == names.length == tels.length
		//�л� ����Ʈ ���
		for (int i=0; i<memberCount ;i++ )
		{
			System.out.println(names[i] + "       " + tels[i]);
		}
		System.out.println("-----------------------");
		
	}
}
//������
/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) : ���̰� 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) : ������ 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) : �ֳ��� 010-3333-3333
-----------------------
��ü �л� �� : 3
-----------------------
 �̸�           ��ȭ��ȣ
���̰�       010-1111-1111
������       010-2222-2222
�ֳ���       010-3333-3333
-----------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



