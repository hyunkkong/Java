/*=============================================
	���� Ŭ���� ��� ����
	-��ø Ŭ����
==============================================*/
/*
 �� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)
	- AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
	  ���ŷο����� ���� ����ϰ� ��ü ������ �ʿ��� ���
	  �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�.

 �� ���� �� ����
	
		new ����Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}
	};		�� check~!!! ����Ŭ�� 
*/

// import java.lang.*;
class Test3 // extends Object
{
	/*
	Object �� �����~!!!

	public String toString()
	{
		...;
	}

	*/

	public Object getString()
	{
		return new Object()
		{
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		}; // ����Ŭ�� check~!!!
	}	
}	

public class Test125 // extends Object
{
	/*
	Object �� ����� ���~!!
	*/
	public static void main(String[] args)
	{		
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString());
		//Test3@15db9742
		System.out.println(ob1.getString());
		//�͸��� Ŭ����...
	}
}