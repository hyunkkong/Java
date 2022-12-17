/*===============================
	■■■ 배열 ■■■
	- 배열의 배열(2차원 배열)
================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*					  
  1  8  9 16 17			
  2  7 10 15 18				
  3  6 11 14 19		
  4  5 12 13 20						
계속하려면 아무 키나 누르세요...
*/
// hint
//					 홀				 짝				  홀
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

			if (i%2==0)							//짝수일 경우
			{
				for (int j = 0; j <= 3; j++ )
				{
					arr[j][i] = n;
					n++;
				}
			}
			else if (i%2!=0)					//홀수일 경우
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
				if (i%2!=0) //i가 홀수일때
				{	
					System.out.printf("%d", arr[][]);
				}
				else if (i%2==0) //i가 짝수일때
				{
					System.out.printf("%d", arr[][]);

				}
				*/
			
			// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];
		int n= 0;
		for (int i = 0;i<5 ;i++ )		// outer 웅 i → 0 1 2 3 4
		{
			 for (int j = 0; j< 4 ; j++ )		//inner 쑝 j → 0 1 2 3
			 {
				//테스트(확인)
				//System.out.print(j+""+i+" ");
				n++;

				if (i%2==0)		//i가 짝수일 때 → 0 2 4
				{
					arr[j][i] = n;		//	j를 0123				→	00 10 20 30  02 12 22 32  04 14 24 34
				}
				else			//i가 홀수일 때 →  1 3
				{
					arr[3-j][i] = n;	//	j를 0123을 3210으로		→ 31 21 11 01	 33	23 13 03	
				}
			 } //System.out.println();
		}

		
		// 전체요소 출력
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			} System.out.println();
		}
		
	}
}