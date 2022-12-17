/*===============================
	■■■ 배열 ■■■
	- 배열의 배열(2차원 배열)
================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행예)
/*
 1  2  3  4  5						// [0][0]	[0][1]	[0][2]	[0][3]	[0][4]
 6  7  8  9 10						// [1][0]	[1][1]	[1][2]	[1][3]	[1][4]
11 12 13 14 15						// [2][0]	[2][1]	[2][2]	[2][3]	[2][4]
16 17 18 19 20						// [3][0]	[3][1]	[3][2]	[3][3]	[3][4]
21 22 23 24 25						// [4][0]	[4][1]	[4][2]	[4][3]	[4][4]
계속하려면 아무 키나 누르세요...
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
		//배열의 배열 선언
		//int[][] arr;
		// 배열의 배열 메모리 할당
		//arr = new int[5][5];
		int[][] arr = new int[5][5];

		//변수 선언 및 초기화
		int n=1;						// 1 2 3 4 5 6 7 ..... 25

		// 배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for (int i=0;i<arr.length ;i++ )				// outer → 0		1		2		3		4
		{
			for (int j=0; j<arr[i].length ;j++ )		// inner → 01234	01234	01234	01234	01234
			{
				arr[i][j] = n;
				n++;
			}
		}
		//		여기까지 수행하면 배열의 각 방에 값 담아내기 완료~!!!

		// 전체 요소 출력
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

//실행 결과
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
계속하려면 아무 키나 누르십시오 . . .

*/