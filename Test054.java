/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- �ݺ���(while��) �ǽ�
==============================================*/

// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//		:
// 7 * 9 = 63
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ϴ� �� (������) �Է� : 11
// 1���� 9������ ������ �Է��� �����մϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test054
{
	public static void main(String[] args)throws IOException
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan;				//����ڷκ��� �Է°��� ���� ���·� ��Ƴ� ����(��)
		int num=1;
		int result;

		//���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());
		
		result = dan*num;

		/*
		if (dan<=9)
		{
			while (num<=9)
			{	
				System.out.printf("%d x %d = %d\n",dan,num,result);
				num++;
			}
		}
		else
		{
			System.out.print("���� �߻�~!!!\n");
			return;
		}
		*/
		if (dan>9 || dan<1)
		{
			System.out.print("1���� 9������ ������ �Է� �����մϴ�.\n");
			return;
		}
		while (num<=9)
			{	
				System.out.printf("%d x %d = %d\n",dan,num,result);
				num++;
			}
			
	}
}

//���� ���
/*
���ϴ� ��(������) �Է� : 7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
���ϴ� ��(������) �Է� : 12
���� �߻�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/