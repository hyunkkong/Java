/*===================================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
===================================================*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;
		float f = 1.2f;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		Float f2 = new Float(f);
		Short s2 = new Short(s);

		//System.out.println(b2);
		//System.out.println(i2);
		//--==>>3
		//		256

		print(b2);
		print(i2);
		print(f2);
	}

	//print(Object obj) ���� b2�� i2�� �Ѱ� ���� �� �ִ� ����� ã�ƶ�
	/*
	static void print(Object obj)
	{
		System.out.println(obj);
	}
	*/


	/*
	static void print(Byte b)
	{
		System.out.println(b);
	}
	static void print(Short s)
	{
		System.out.println(s);
	}
	static void print(Integer i)
	{
		System.out.println(i);
	}
				...
	*/
	
	
	// java.lang.Number Ŭ����(�߻� Ŭ����)��
	// ��� ������ Wrapper Ŭ������ �θ� Ŭ����
	// (���� Ŭ����, ���� Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number �� �Ѿ���鼭
	// ��ĳ���� �� �Ͼ�� �ȴ�.
	static void print(Number n)
	{
		System.out.println(n);
		/*
		if (n instanceof Integer)
		{
			System.out.println(n.intValue));
		}
		else if (n instanceof Doubel)
		{
			...
		}
		
		...
		*/
		 
		 
		 
	}
}