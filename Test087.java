/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  1  2  3  4  5		00 01 02 03 04		i=0	j=
  2  3  4  5  6		10 11 12 13 14		i=1
  3  4  5  6  7		20 21 22 23 24		i=2
  4  5  6  7  8		30 31 32 33 34		i=3
  5  6  7  8  9		40 41 42 43 44		i=4
����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test087
{
	public static void main(String[] args)
	{
		
		/*
		int[][] arr = new int[5][5];

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				arr[i][j] = i+j+1;

			}
		}
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			} System.out.println();
		}
		*/
		
		/*
		int[][] arr = new int[5][5];

		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				arr[i][j] = i+j+1;
				System.out.printf("%3d",arr[i][j]);

			}System.out.println();
		}
		*/
		/*
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			} System.out.println();
		}
		*/
		/*
		int[][] arr = new int[5][5];
		int n = 1;

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
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			} System.out.println();
		}
		*/

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];
		// �ֿ� ���� ����
		int n;

		for (int i=0;i<arr.length ;i++ )
		{
			n=1+i;

			for (int j=0;j<arr[i].length ;j++ )
			{	
				arr[i][j]=n;
				n++;
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			} System.out.println();
		}
		

	}
}

/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/