// 실행 예)
// 1부터 100까지 정수의 합 : 5050
// 1부터 100까지 짝수의 합 : 2550
// 1부터 100까지 홀수의 합 : 2500
// 계속하려면 아무 키나 누르세요...

public class Test047
{
	public static void main(String[] args)
	{
		int num=1,sum=0,odd=0,even=0;

		while(num<=100)
		{	
			sum += num;

				if (num%2==0)
				{
					even += num;
				}
				else if (num%2!=0)
				{
					odd += num;
				}
				else
				{
				System.out.println("판별 불가");
				return;
				}
			
			num++;
		}
		System.out.println("1부터 100까지의 정수의 합 :" + sum);
		System.out.println("1부터 100까지의 짝수의 합 :" + even);
		System.out.println("1부터 100까지의 홀수의 합 :" + odd);
		
	}
}