/*=========================================================================
	���� Ŭ������ �ν��Ͻ� ����
	- �޼ҵ� �����ε�(Method Overloading)�� ������ ���¿� �Ұ����� ����
=========================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		print('3.14');

		double result = print('3.14');					//java�� ���Կ����ڰ� �ִ� ��� �������� ���⶧���� print('3.14'); �� ����.
	}

	public static void print(){}
	//public static void print(){}						//--(X)
	public static void print(int i){}
	//public static void print(int j){}					//--(X) �Ű����� Ÿ�԰� ������ ���Ƽ� �ȵ�
	public static void print(char c){}					//�������ϵ� �����ؼ� ����ؾ���, �ڵ� �� ��ȯ ��Ģ check~!!
	public static void print(int i, int j){}
	public static void print(double d){}				//�������ϵ� �����ؼ� ����ؾ���, �ڵ� �� ��ȯ ��Ģ check~!!
	//public static void print(double a){return 10.0;}	//--���� �Ұ�
	//public static double print(double a){return 10.0;}	//--(x) check~!!! return���� �޼ҵ� �����ε��� ������ ��������
}