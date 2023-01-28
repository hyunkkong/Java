/*===================================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calandar Ŭ����
===================================================*/

/*
 �� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
	(�߻� Ŭ���� : �̿ϼ��� Ŭ����)

	Calendar ob = new Calendar();
	�� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

 �� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���

	1. Calendar ob1 = Calendar.getInstance();

	2. Calendar 0b2 = new GregorianCalendar();		//��ĳ����

	3. GregorianCalendar ob3 = new GregorianCalendar();

	(�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)

*/

// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ��� 

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test142
{
	public static void main(String[] args)
	{
		// Calendar Ŭ���� ��� �ν��Ͻ� ���� (x)
		// Calendar ob = new Calendar();

		Calendar rightNow = Calendar.getInstance();

		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��

		int y = rightNow.get(Calendar.YEAR);					//YEAR ��� static final
		System.out.println("y : "+ y);
		//--==>> y : 2022

		int m = rightNow.get(Calendar.MONTH) + 1;				//-- ��+1�� check~!!!	�迭���·� ����Ǿ�����
		System.out.println("m : " + m);
		//--==>> m : 7

		int d = rightNow.get(Calendar.DATE);
		System.out.println("d : "+ d);
		//--==>> d : 25

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("w : "+ w);
		//--==>> w : 2

		//	�׽�Ʈ
		/*
		System.out.println(Calendar.SUNDAY);					//--==>> 1	�� �Ͽ���
		System.out.println(Calendar.MONDAY);					//--==>> 2	�� ������
		System.out.println(Calendar.TUESDAY);					//--==>> 3	�� ȭ����
		System.out.println(Calendar.WEDNESDAY);					//--==>> 4	�� ������
		System.out.println(Calendar.THURSDAY);					//--==>> 5	�� �����
		System.out.println(Calendar.FRIDAY);					//--==>> 6	�� �ݿ���
		System.out.println(Calendar.SATURDAY);					//--==>> 7	�� �����
		*/

		System.out.println(y + "-" + m +"-" + d + "-" + w);
		//--==>>2022-7-25-2

		String week = "";
		switch (w)
		{
			case Calendar.SUNDAY: week = "�Ͽ���"; break;
			case Calendar.MONDAY: week = "������"; break;
			case Calendar.TUESDAY: week = "ȭ����"; break;
			case Calendar.WEDNESDAY: week = "������"; break;
			case Calendar.THURSDAY: week = "�����"; break;
			case Calendar.FRIDAY: week = "�ݿ���"; break;
			case Calendar.SATURDAY: week = "�����"; break;
		}
		/*
		switch (w)
		{
			case 1: week = "�Ͽ���"; break;
			case 2: week = "������"; break;
			case 3: week = "ȭ����"; break;
			case 4: week = "������"; break;
			case 5: week = "�����"; break;
			case 6: week = "�ݿ���"; break;
			case 7: week = "�����"; break;
		}
		*/

		System.out.println(y + "-" + m + "-" + d + "-" + week);
		//--==>> 2022-7-25-������

		System.out.println("-----------------------------------");

		//Claendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rigthNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};

		// �޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2023, 1, 16);			//2023�� 2�� 16��	check~!!!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//

	}
}