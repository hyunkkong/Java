/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

//	��	����
//		�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//		������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
//		�� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*					  
  A  B  C  D  E			
  F  G  H  R  J			
  K  L  M  N  O		
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test092
{
	public static void main(String[] args)
	{
		char[][] arr = new char[5][5];
		char apb = 'A';

		for (int i=0;i<arr.length ;i++ )
		{
			
			for (int j=0; j<arr[i].length ;j++ )
			{
				arr[i][j] = apb++;
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
 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/