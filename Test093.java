/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

//	��	����
//		�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//		������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//		�� ����� ����ϴ� ���α׷��� �����Ѵ�.

/*
  A				
  B C      
  D E F
  G H I J
  K L M N O
*/

public class Test093
{
	public static void main(String[] args)
	{
		char [][] arr = new char[5][5];
		char apb = 'A';
		
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				arr[i][j] = apb;
				apb++;
				//�׽�Ʈ
				//System.out.printf("%d%d ",i,j);
			}//System.out.println();
		}
		
		
		
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%2c",arr[i][j]);
			}System.out.println();
		}
		
		//�׽�Ʈ �����
		/*
		for (int i=0; i<arr.length ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("*");
			}System.out.println();
		}
		*/
	}	
}
//������
/*
 A
 B C
 D E F
 G H I J
 K L M N O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/