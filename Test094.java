/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

//	��	����
//		�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//		������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//		�� ����� ����ϴ� ���α׷��� �����Ѵ�.

/*
  A								i = 0 
  C B			i%2!=0 ����		i = 1
  D E F							i = 2
  J I H G						i = 3
  K L M N O						i = 4
*/
public class Test094
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char apb='A';

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				if (i%2!=0)			//i�� Ȧ���϶� ���� 
				{
					arr[i][i-j] = apb;  
				}
				else				//i�� ¦���϶�
				{
					arr[i][j] = apb;
				}
				apb++;
			}
		}

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%2c",arr[i][j]);
			}System.out.println();
		}
	}
}
//������
/*
 A
 C B
 D E F
 J I H G
 K L M N O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/