/*===============================
	■■■ 배열 ■■■
	- 배열의 배열(2차원 배열)
================================*/

//	○	과제
//		배열의 배열(다차원 배열)을 활용하여
//		다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//		그 결과를 출력하는 프로그램을 구현한다.

/*
  A								i = 0 
  C B			i%2!=0 역순		i = 1
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
				if (i%2!=0)			//i가 홀수일때 역순 
				{
					arr[i][i-j] = apb;  
				}
				else				//i가 짝수일때
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
//실행결과
/*
 A
 C B
 D E F
 J I H G
 K L M N O
계속하려면 아무 키나 누르십시오 . . .
*/