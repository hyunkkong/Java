/*=============================================
	���� Ŭ���� ���� ����
	-�������̽�(Interface)
==============================================*/

// �� �ǽ� ����
//	  ���� ó�� ���α׷��� �����Ѵ�.
//	  ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 11
// �ο� �� �Է�(1~10) : 0
// �ο� �� �Է�(1~10) : 2

// 1��° �л��� �й� �̸� �Է�(���� ����) : 2207123 �ֵ���
// ���� ���� ���� ���� �Է�	  (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2208225 �ֳ���
// ���� ���� ���� ���� �Է�	  (���� ����) : 85 70 65

// 2207123 �ֵ��� 90 100  85		xxx		xx.xx
//				  ��  ��  ��
// 2208225 �ֳ��� 85  70  65		xxx		xx.xx
//				  ��  ��  ��
//
// ����Ϸ��� �ƹ� Ű�� ��������...

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
import java.util.Scanner;

class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot;				//-- ����
	double avg;				//-- ���
}

//�������̽�
interface Sungjuk
{
	public void set();		//-- �ο� ����
	public void input();	//-- ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();
			
		}
		while (inwon<1 || inwon>10);

		rec = new Record[inwon];

	}
	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<inwon ;i++ )
		{
			rec[i] = new Record();
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",(i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;

		}	
	}

	@Override
	public void print()
	{
		for (int i=0;i<inwon ;i++ )
		{
			System.out.printf("%s %s %d %3d %3d %3d %8.2f\n",rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%s %s %s\n",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		}
		
	}
	
	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	
	private String panjung(int score)
	{
		String result;
		/*
		switch (score)
		{
		case (score>89) : result ="��"; break;
		case (score>79) : result ="��"; break;
		case (score>69) : result ="��"; break;
		case (score>59) : result ="��"; break;
		default : result ="��"; break;
		}
		*/

		if (score>=90)
			result ="��";
		else if (score>=80)
			result ="��";
		else if (score>=70)
			result ="��";
		else if (score>=60)
			result ="��";
		else
			result ="��";
		
		return result;
		
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121 
{
	public static void main(String[] args)
	{
		
		Sungjuk ob;
		
		// ���� �ذ� �������� �ۼ��ؾ� �� ob ���� �� ��ü ����
		ob = new SungjukImpl();
		ob.set();
		ob.input();
		ob.print();
	}
}