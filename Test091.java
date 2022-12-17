/*===============================
	■■■ 배열 ■■■
	- 배열의 배열(2차원 배열)
================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)

//	 1	 2	 3	 4	10	1+2+3+4 = 10 00 01 02 03 04
//	 5	 6	 7	 8	26				 10
//	 9	10	11	12	42				 20
//	13	14	15	16	58				 30
//	28	32	36	40	136				 40
//									 i || j가 4일때 누적합


/*

 ※ 반복문의 처리가 필요한 영역		※ 반복문의 처리가 필요하지 않은 영역
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
				//테스트
				//System.out.printf("%d,%d ",i,j);
				n++;
				
				if (j==4) // j가 마지막행에 도착했을 경우
				{
					sum+=arr[i][j];
					j=sum;
				}
				
				if (i==4) // i가 마지막열에 도착했을 경우
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
		int sum =0; // 테스트 변수
		int n =0;

		// 각 for 문 수식 2의 『-1』 → 반복문의 처리가 필요하지 않은 영역
		for (int i = 0;i<arr.length-1 ;i++ )
		{
			for (int j = 0;j<arr[i].length -1 ;j++ )
			{
				n++;
				arr[i][j] = n;

				//테스트
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
		

		// 배열의 배열 전체 출력 구문
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
계속하려면 아무 키나 누르십시오 . . .
*/