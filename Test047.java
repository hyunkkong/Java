// ���� ��)
// 1���� 100���� ������ �� : 5050
// 1���� 100���� ¦���� �� : 2550
// 1���� 100���� Ȧ���� �� : 2500
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test047
{
	public static void main(String[] args)
	{
		int num=1,sum=0,odd=0,even=0;

		while(num<=100)
		{	
			sum += num;

				if (num%2==0)
				{
					even += num;
				}
				else if (num%2!=0)
				{
					odd += num;
				}
				else
				{
				System.out.println("�Ǻ� �Ұ�");
				return;
				}
			
			num++;
		}
		System.out.println("1���� 100������ ������ �� :" + sum);
		System.out.println("1���� 100������ ¦���� �� :" + even);
		System.out.println("1���� 100������ Ȧ���� �� :" + odd);
		
	}
}