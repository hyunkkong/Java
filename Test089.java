/*===============================
	���� �迭 ����
	- �迭�� �迭(2���� �迭)
================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*					  
  1  8  9 16 17			
  2  7 10 15 18				
  3  6 11 14 19		
  4  5 12 13 20						
����Ϸ��� �ƹ� Ű�� ��������...
*/
// hint
//					 Ȧ				 ¦				  Ȧ
//				 0  0  0  0		 1  1  1  1		 3	3  3  3
// ??~			 i  i  i  i		 i  i  i  i		 i  i  i  i
//				00 10 20 30		31 21 11 01		02 12 22 32
// ??~          j  j  j  j		j  j  j  j		j  j  j	 j	
//				0  1  2  3		3  2  1  0		0  1  2	 3

public class Test089
{
	public static void main(String[] args)
	{//						 [j][i]
		/*
		int[][] arr = new int[4][5];

		int n = 1;
	
		for (int i = 0; i < arr.length ; i++ ) // 5
		{	
			//System.out.printf("%d", arr[j][i]);

			if (i%2==0)							//¦���� ���
			{
				for (int j = 0; j <= 3; j++ )
				{
					arr[j][i] = n;
					n++;
				}
			}
			else if (i%2!=0)					//Ȧ���� ���
			{
				for (int j = 3; j >= 0; j-- )
				{
					arr[j][i] = n;
					n++;
				}
			}
			

			/*
			for (int j = 0; j < arr[i].length  ;j++ )
			{	
				
				arr[i][j] = n;
				//System.out.print(n);

			

				/*
				if (i%2!=0) //i�� Ȧ���϶�
				{	
					System.out.printf("%d", arr[][]);
				}
				else if (i%2==0) //i�� ¦���϶�
				{
					System.out.printf("%d", arr[][]);

				}
				*/
			
			// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[4][5];
		int n= 0;
		for (int i = 0;i<5 ;i++ )		// outer �� i �� 0 1 2 3 4
		{
			 for (int j = 0; j< 4 ; j++ )		//inner �� j �� 0 1 2 3
			 {
				//�׽�Ʈ(Ȯ��)
				//System.out.print(j+""+i+" ");
				n++;

				if (i%2==0)		//i�� ¦���� �� �� 0 2 4
				{
					arr[j][i] = n;		//	j�� 0123				��	00 10 20 30  02 12 22 32  04 14 24 34
				}
				else			//i�� Ȧ���� �� ��  1 3
				{
					arr[3-j][i] = n;	//	j�� 0123�� 3210����		�� 31 21 11 01	 33	23 13 03	
				}
			 } //System.out.println();
		}

		
		// ��ü��� ���
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			} System.out.println();
		}
		
	}
}