/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)

//	 1	 2	 3	 4	10	1+2+3+4 = 10 00 01 02 03 04
//	 5	 6	 7	 8	26				 10
//	 9	10	11	12	42				 20
//	13	14	15	16	58				 30
//	28	32	36	40	136				 40
//									 i || j�� 4�϶� ������


/*

 �� �ݺ����� ó���� �ʿ��� ����		�� �ݺ����� ó���� �ʿ����� ���� ����
					  1	  2	  3	  4	| 10
					  5	  6	  7	  8	| 26
					  9	 10	 11	 12	| 42
					 13	 14	 15	 16	| 58
					 ----------------
					 28	 32	 36	 40	 123

*/
public class Test091
{
	public static void main(String[] args)
	{
		//x
		/*
		int[][] arr = new int [5][5];
		int sum=0;
		int n=1;

		for (int i=0;i<arr.length ;i++ )
		{

			for (int j=0;j<arr[i].length ;j++ )
			{
				arr[i][j] = n;
				//�׽�Ʈ
				//System.out.printf("%d,%d ",i,j);
				n++;
				
				if (j==4) // j�� �������࿡ �������� ���
				{
					sum+=arr[i][j];
					j=sum;
				}
				
				if (i==4) // i�� ���������� �������� ���
				{	
					sum+=arr[i][j];
					i=sum;
				}
				if(i==4 || j==4)
				{

				}

			}//System.out.println();
			*/

		
		int[][] arr = new int [5][5];
		int sum =0; // �׽�Ʈ ����
		int n =0;

		// �� for �� ���� 2�� ��-1�� �� �ݺ����� ó���� �ʿ����� ���� ����
		for (int i = 0;i<arr.length-1 ;i++ )
		{
			for (int j = 0;j<arr[i].length -1 ;j++ )
			{
				n++;
				arr[i][j] = n;

				//�׽�Ʈ
				//sum+=arr[i][j];
				//System.out.printf("%4d",sum);

				arr[i][arr[i].length-1] += arr[i][j];
				//arr[0][4] += arr[0][0]
				//			+= arr[0][1]
				//			+= arr[0][2]
				//			+= arr[0][3]
				arr[arr.length-1][i] += arr[i][j];
				//arr[4][0] += arr[0][0]
				//			+= arr[1][0]
				//			+= arr[2][0]
				//			+= arr[3][0]
				arr[arr.length-1][arr.length-1] += arr[i][j];
				//arr[4][4] += arr[0][0]
				//			:
				//			+= arr[3][3]
				
				/*
				arr[i][4] += arr[i][j];
				arr[4][j] += arr[i][j];
				arr[4][4] += arr[i][j];
				*/
			}
			
		}
		

		// �迭�� �迭 ��ü ��� ����
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4d",arr[i][j]);
			}System.out.println();
		}
	}
}
//
/*
   1   2   3   4  10
   5   6   7   8  26
   9  10  11  12  42
  13  14  15  16  58
  10  26  42  58 136
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/