/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- �ݺ���(while��) �ǽ�
==============================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 100
// �� ��° ���� �Է� : 200
// >> 100 ~ 200 ������ ���� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������....

// ù ��° ���� �Է� : 1000
// �� ��° ���� �Է� : 2
// >> 2 ~ 1000������ �� : xxxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test052
{
	public static void main(String[] args) throws IOException
	{
		//�ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,temp;
		int i = 0; //���� ������ Ȱ���� ����
		int sum=0;

		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		// �Է� ���� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, num1�� num2���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (num1>num2)	
		{
			//num1=num1^num2;
			//num2=num2^num1;
			//num1=num1^num2;
			temp=num1;
			num1=num2;
			num2=temp;
		}
		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�
		// �� ���� �ݺ� �������� ����ϰ� �Ǹ�...
		// ������ ���� Ȯ���� �� ���� ������...)
		i=num1;

		while (i<=num2)
		{
			sum+=i;
			i++;
		}
		
		//���� ���
		System.out.printf("%d ~ %d������ �� : %d\n",num1,num2,sum);
		
	}
}

//������
/*
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 1
1 ~ 100������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/