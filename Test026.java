/*===========================================
	■■■ 연산자(Operatior) ■■■
	- 논리 연산자
============================================*/

public class Test026
{
	public static void main(String[] args)
	{
		boolean a = true, b = false;

		System.out.printf(" a && b : %b\n", (a&&b));
		System.out.printf(" a || b : %b\n", (a||b));
		System.out.printf(" !a	   : %b\n", !a);
		System.out.printf(" !b     : %b\n", !b);
	}
}