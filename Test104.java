/*=========================================================================
	■■■ 클래스와 인스턴스 ■■■
	- 메소드 오버로딩(Method Overloading)이 가능한 형태와 불가능한 형태
=========================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		print('3.14');

		double result = print('3.14');					//java는 대입연산자가 있는 경우 우측부터 보기때문에 print('3.14'); 로 본다.
	}

	public static void print(){}
	//public static void print(){}						//--(X)
	public static void print(int i){}
	//public static void print(int j){}					//--(X) 매개변수 타입과 개수가 같아서 안됨
	public static void print(char c){}					//가능은하되 조심해서 사용해야함, 자동 형 변환 규칙 check~!!
	public static void print(int i, int j){}
	public static void print(double d){}				//가능은하되 조심해서 사용해야함, 자동 형 변환 규칙 check~!!
	//public static void print(double a){return 10.0;}	//--정의 불가
	//public static double print(double a){return 10.0;}	//--(x) check~!!! return값은 메소드 오버로딩에 영향을 주지않음
}