/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���࿹)
/*
 1  2  3  4  5						// [0][0]	[0][1]	[0][2]	[0][3]	[0][4]
 6  7  8  9 10						// [1][0]	[1][1]	[1][2]	[1][3]	[1][4]
11 12 13 14 15						// [2][0]	[2][1]	[2][2]	[2][3]	[2][4]
16 17 18 19 20						// [3][0]	[3][1]	[3][2]	[3][3]	[3][4]
21 22 23 24 25						// [4][0]	[4][1]	[4][2]	[4][3]	[4][4]
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test086
{
	public static void main(String[] args)
	{
		/*
		int [][]arr = new int[5][5];
		int n = 1;
		
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
			  arr[i][j] = n;
			  System.out.printf("%3d",arr[i][j]);
			  n++;
			}System.out.println();
		}
		*/

		/*
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
			  arr[i][j] = n;
			  n++;
			}
		}
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0; j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();

		}
		*/
		//�迭�� �迭 ����
		//int[][] arr;
		// �迭�� �迭 �޸� �Ҵ�
		//arr = new int[5][5];
		int[][] arr = new int[5][5];

		//���� ���� �� �ʱ�ȭ
		int n=1;						// 1 2 3 4 5 6 7 ..... 25

		// �迭�� �迭�� �ݺ����� ��ø ������ Ȱ���Ͽ� ����ȭ
		for (int i=0;i<arr.length ;i++ )				// outer �� 0		1		2		3		4
		{
			for (int j=0; j<arr[i].length ;j++ )		// inner �� 01234	01234	01234	01234	01234
			{
				arr[i][j] = n;
				n++;
			}
		}
		//		������� �����ϸ� �迭�� �� �濡 �� ��Ƴ��� �Ϸ�~!!!

		// ��ü ��� ���
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0; j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();

		}
		
	}
}

//���� ���
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/