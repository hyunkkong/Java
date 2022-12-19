/*===================================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
	- Calandar Ŭ����
===================================================*/
/*
�� java.util.Calendar Ŭ������
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �� ������
	�ð��� ��¥�� ���õ� ������ �����Ѵ�.
	�׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
	GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
	������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
	�� ��ü�� �����Ǹ� �����մ� �ð� ��������
	get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

	getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
	�����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�.
*/
/*
�� �ǽ� ����
	����ڷκ��� ��, ���� �Է¹޾�
	�޷��� �׷��ִ�(����ϴ�) ���α׷��� ���q����.
	��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ� �� �� �նǷ� �Ѵ�.
	�� API Document �����Ͽ� getActualMaximum() �޼ҵ��� Ȱ�� ��� ������ ��~!!!

	���� ��)
	���� �Է� : 0
	���� �Է� : 2022
	�� �Է�	  : -20
	�� �Է�   : 16
	�� �Է�   : 7

		[ 2022�� 7�� ]
  ��  ��  ȭ  ��  ��  ��  ��
=============================
						1	2	
	3	4	5	6	7	8	9
   10  11  12  13  14  15  16
   17  18  19  20  21  22  23
   24  25  26  27  28  29  30
   31
*/
/*
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test143
{
	public static void main(String[] args)
	{
		Calendar cal = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		int y,m;

		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);
		

		// ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		cal.set(y,m-1,1); //�� ����,�Է��� �� - 1(�迭)

		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.print("w : " + w);
		//w : 6 �� �ݿ��� 

		System.out.println();
		System.out.printf("\t [ %d�� %d�� ]\n",y,m);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");
		
		//���� ���
		for (int i=1;i<w ;i++ )
		{
			System.out.print("    ");
		}
		//��¥ ���
		for (int i=1;i<=cal.getActualMaximum(cal.DATE) ;i++ )	//��¥�� ���� �� calender�� ������(�ִ�) ��¥
		{
			System.out.printf("%4d",i);
			w++;	
				if (w%7==1)						
				{
					System.out.println();
				}
				
			
		}System.out.println();
		System.out.println("==============================");
	}
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
public class Test143
{
	public static void main(String[] args) throws IOException
	{	
		// BufferedReader Ŭ���� ��� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		//�ֿ� ���� ����
		int y, m;					//-- ��, ��
		int w;						//-- ����
		int i;						//-- ���� ����

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ��(y),��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����

		cal.set(y,m-1,1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶��
		//	 �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.
		//   1���� ���� Ȯ�� �ʿ�~!!!

		// ���õ� �޷��� ��¥�κ��� ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// �׽�Ʈ(Ȯ��)
		System.out.println(w);
		//--==>>���� �Է� : 2022
		//		�� �Է� : 7
		//		6 �� 2022�� 7�� ���� �� �ݿ��� �� 2022�� 7�� 1���� �ݿ���~!!!

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t\t[" + y + "�� " + m + "�� ]");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");

		for (i=1; i<w ;i++ )
		{
			System.out.print("    ");		// ���� 4ĭ �߻�
		}
		//�׽�Ʈ(Ȯ��)
		//System.out.printf("%4d",1);

		// Calendar Ŭ���� ��getActualMaximum()�� �޼ҵ� check~!!!
		for (i=1;i<=cal.getActualMaximum(Calendar.DATE) ;i++ )		{
			System.out.printf("%4d",i);
			w++;									//-- �ݺ����� �����ϸ� ��¥�� ������ �� ����
													//	 ���ϵ� �Բ� ������ �� �ֵ��� ó��
			if (w%7==1)								//-- ������ ������ �Ͽ����� �� �� ����
				System.out.println();				//	 ���� �� ��µ� �� �ֵ��� ó��
		}
		if (w%7!=1)
			System.out.println();
		System.out.println("=============================");
	}
}