/*===================================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Wrapper Ŭ����
===================================================*/
import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		// �Ұ���
		//int a1 = 1234569123456789;
		//System.out.println(a1);
		
		// �Ұ���
		//long b1 = 123456789123456789;			// ���̻� L
		//System.out.println(b1);
		
		// ����
		//long b1 = 123456789123456789L;		
		//System.out.println(b1);
		//--==>>123456789123456789

		// �Ұ���
		//long b1 = 123456789123456789123456789L;
		//System.out.println(b1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		
		//BigInteger c = a + b;
		//System.out.println(c);

		// ���ϱ�
		BigInteger c = a.add(b);
		System.out.println("���� ��� : " + c);
		//--==>> ���� ��� : 246913578246913578

		// ����
		BigInteger d = a.subtract(b);
		System.out.println("���� ��� : " + d);
		//--==>> ���� ��� : 0

		// ���ϱ�
		BigInteger e = a.multiply(b);
		System.out.println("���� ��� : " + e);
		//--==>> ���� ��� : 15241578780673678515622620750190521
		// ������
		BigInteger f = a.divide(b);
		System.out.println("������ ��� : " + f);
		//--==>> ������ ��� : 1

		// ������
		BigInteger g = new BigInteger("2");
		System.out.println("2�� 3�� : " + g.pow(3));
		//--==>> 2�� 3�� : 8

	}
}