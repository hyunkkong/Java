/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- �ݺ���(while��) �ǽ�
==============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
//			 ������ �������� �ʴ� ��.
//			 ��, 1�� �Ҽ� �ƴ�.


// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...


//import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;		// ������� �Է°��� ��Ƴ� ����

		int i = 2;		// �Է°���������γ����� ������ ������ ����
						// 2���� �����ؼ� 1�� ����

		
		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine()); 
		// � ���� �Է¹��� �������� �� �� ������
		// �� �Է� ���� �Ҽ��� �����Ѵ�.
		boolean flag = true;

		while (i<num)
		{
			/*
			if (num%i!=0||num%2==i)
			{
				System.out.println(num + " �� " + "�Ҽ�");
				break;
			}
			else if
			{
				System.out.println(num + " �� " +"�Ҽ� �ƴ�");
				break;
			}
			*/
			if (num%i==0)					//������ �������� ��Ȳ
			{
				flag = false;
				break;
			}
			
			i++;
		}
			if (flag && num!=1)
			{
				System.out.printf("%d �� �Ҽ�\n",num);
			}
			else
			{
				System.out.printf("%d �� �Ҽ� �ƴ�\n",num);
			}

			/*
			if (num==1)
			{
				System.out.println(num + " �� " + "�Ҽ� �ƴ�");
				break;
			}
			else if (num%2!=0||num%2==i)
			{
				System.out.println(num + " �� " + "�Ҽ�");
				break;
			}
			
			else
			{
				System.out.println(num + " �� " +"�Ҽ� �ƴ�");
				break;
			}
			*/
		
		
		
	}
}

//������
/*
������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
*/