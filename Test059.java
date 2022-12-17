/*=============================================
	■■■ 실행 흐름의 컨트롤 (제어문)■■■
	- 반복문(for문) 실습
==============================================*/

//실행 예)
//	[2단]
//	2 * 1 = 2
//	2 * 2 = 4
//		:
//		:
//	[9단]
//	9 * 1 = 9
//	9 * 2 = 18
//		:
//	9 * 9 = 81
public class Test059
{
	public static void main(String[] args)
	{
		int dan,num;

		
		// 웅~ 웅~
		for (dan=2;dan<=9 ;dan++)		// 단 처리
		{
			//테스트(확인)
			//System.out.println(" [dan :" + dan + "]");
			System.out.printf("\n========[%d단]========\n",dan);
			
			// 쑝쑝쑝~~!!!
			for (num=1;num<=9 ;num++)			// 곱해지는 수 처리
			{
				//테스트(확인)
				//System.out.println("j : " + num);
				System.out.printf("%d x %d = %d\n",dan,num,dan*num);
			}
		}
		
		
		
		
		/*
		// 웅~ 웅~
		for (dan=2;dan<=9 ;dan++)		// 단 처리
		{
			// 쑝쑝쑝~~!!!
			for (num=1;num<=9 ;num++)			// 곱해지는 수 처리
			{
				System.out.printf("");
				System.out.printf("%d x %d = %d\n",dan,num,dan*num);
			}
		}
		*/
	}
}