/*==============================================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν��Ͻ� Ȱ��
==============================================================*/

// �л����� ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֶǷ� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

// [���̵����]
// ���α׷��� �����ϴ� Ŭ����
// 1. Record Ŭ����
//	  - �Ӽ��� �����ϴ� Ŭ������ ������ ��~!!!


// 2. Sungjuk Ŭ����
//	  - �ο� ���� �Է� �޾�, �Է¹��� �ο� �� ��ŭ
//		�̸�, ��������, ��������, ���������� �Է¹ް�
//		������ ����� �����ϴ� Ŭ������ ������ ��~!!!
//		- �Ӽ� : �ο���, Record Ÿ���� �迭
//		- ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��տ���, ��� ���

// 3. Test101 Ŭ����
//	  - main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��~!!!

// ���� ��)
// �ο� �� �Է�(1~100) : 102
// �ο� �� �Է�(1~100) : -10
// �ο� �� �Է�(1~100) : 3

// 1��° �л��� �̸� �Է� : ������
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// 2��° �л��� �̸� �Է� : ���̰�
// ���� ���� : 92
// ���� ���� : 82
// ���� ���� : 72

// 3��° �л��� �̸� �Է� : ������
// ���� ���� : 82
// ���� ���� : 72
// ���� ���� : 62

// ������ 90 80 70 240 xx.xx 2
// ���̰� 92 82 72 xxx xx.xx 1
// ������ 82 72 62 xxx xx.xx 3

// ����Ϸ��� �ƹ� Ű�� ��������...
/*
import java.util.Scanner;

class Record
{
	String name;
	int[] score = new int[3];
	int sum;
	double ave;

}

class Sungjuk
{
	int person;		//�ο� �� �Է¹��� ����
	Record[] rec;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			person = sc.nextInt();
		}
		while (1>person && person>100);
		rec = new Record[person];
	}
	
	void inputInfo()
	{	
		Scanner sc = new Scanner(System.in);
		

		for (int i=0;i<person ;i++ )	//�̸�
		{	
			rec[i] = new Record();
			System.out.printf("%d��° �л��� �̸� �Է� :",i+1);
			rec[i].name = sc.next();
			System.out.print("���� ���� : ");
			rec[i].score[0]=sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[1]=sc.nextInt();
			System.out.print("���� ���� : ");
			rec[i].score[2]=sc.nextInt();
			
		}

		for (int i=0; i<person ; i++ )
		{
			rec[i].sum += rec[i].score[0]+rec[i].score[1]+rec[i].score[2];
			rec[i].ave = rec[i].sum/3.0;
		}
			 
	}
	
	void print()
	{
		for (int i=0;i<person ;i++ )
		{
			System.out.printf("%5s",rec[i].name);
			System.out.printf("%4d %4d %4d",rec[i].score[0],rec[i].score[1],rec[i].score[2]);
			System.out.printf("%4d",rec[i].sum);
			System.out.printf(" %.2f",rec[i].ave);
			System.out.println();
		}
	}




}
public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk ob = new Sungjuk();
		ob.input();
		ob.inputInfo();
		ob.print();	
	}
}
*/

public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();
	}
}
