/*===================================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calandar Ŭ����
===================================================*/

// �� �ǽ� ����
//	  ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//	  Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��¥ : 2022-07-26 ȭ����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//========[Ȯ�� ���]===========
// 200�� �� : xxxx-xx-xx x����
//==============================
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� Calendar �� ������ API Document ����~!!!
//	  ��add()��

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Test144
{
	public static void main(String[] args)
	{
		/*
		Calendar rightNow = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		int y,m,d;
		int w;
		int n;
		y = rightNow.get(Calendar.YEAR);
		m = rightNow.get(Calendar.MONTH)+1;
		d = rightNow.get(Calendar.DATE);
		w = rightNow.get(Calendar.DAY_OF_WEEK);
		String week="";
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

		System.out.printf("���� ��¥ : %d-%d-%d-%s\n",y,m,d,week);
		

		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		n = sc.nextInt();

		rightNow.add(Calendar.DAY_OF_MONTH, n);	//add(int field, int amount)
		
		y = rightNow.get(Calendar.YEAR);
		m = rightNow.get(Calendar.MONTH)+1;
		d = rightNow.get(Calendar.DATE);
		w = rightNow.get(Calendar.DAY_OF_WEEK);
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

		System.out.printf("========[Ȯ�� ���]===========\n");
		System.out.printf("%d�� �� : %3d-%3d-%3d%3s\n",n,y,m,d,week);
		*/

		//Scanner Ŭ���� ��� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar now = Calendar.getInstance();

		// �ֿ� ���� ����
		int nalsu;					//-- ����ڷκ��� �Է¹��� �� ��
		int y,m,d,w;				//-- ��, ��, ��, ����
		String[] week = {"��","��","ȭ","��","��","��","��"};

		// ������ ��, ��, ��, ���� Ȯ��(�� �������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;					//-- ��+1�� check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d + "-" + week[w-1] + "����");
		
		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		// check~!!!
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.printf("========[Ȯ�� ���]===========\n");
		System.out.printf("%d�� �� : %tF%tA\n",nalsu,now,now);
		System.out.println("==============================");

		//String.format("%tF", �޷°�ü);
		// �� ��-��-�� ������ ���ڿ� ��ȯ
		//String.format("%tA", �޷°�ü);
		// �� ���� ������ ���ڿ� ��ȯ
	}	
		
}