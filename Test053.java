/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- �ݺ���(while��) �ǽ�
==============================================*/
// �� ����
//		����ڷκ��� ������ ������ �Է¹޾�
//		1���� �Է¹��� �� ����������
//		��ü �հ�, ¦���� �հ�, Ȧ���� ����
//		���� ��������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 284
// >> 1~ 264 ���� ������ �� : xxxx
// >> 1~ 264 ���� ¦���� �� : xxxx
// >> 1~ 264 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num; // ������� �Է°��� ��Ƴ� ����
		int sum=0, even=0, odd=0; //������,¦����,Ȧ������ ��Ƴ� ����
		int n=1; // ���� ����

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine()); 

		while (n<=num) 
		{
			sum+=n; //������ ��

			if (n%2==0)
			{		
				even+=n; //¦���� ��
			}
			
			else if (n%2==1)
			{
				odd+=n; //Ȧ���� ��
			}
			
			n++;
			
		}
		System.out.printf("1~ %d ���� ������ �� : %d%n",num,sum);
		System.out.printf("1~ %d ���� ¦���� �� : %d%n",num,even);
		System.out.printf("1~ %d ���� Ȧ���� �� : %d%n",num,odd);
				
	}
}
//���� ���
/*
������ ���� �Է� : 100
1~ 100 ���� ������ �� : 5050
1~ 100 ���� ¦���� �� : 2550
1~ 100 ���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .		
*/
/*
������ ���� �Է� : 264
1~ 264 ���� ������ �� : 34980
1~ 264 ���� ¦���� �� : 17556
1~ 264 ���� Ȧ���� �� : 17424
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/