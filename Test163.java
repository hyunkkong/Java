/*===================================================
	���� �÷���(Collection) ����
===================================================*/

// Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 1

1��° ��� �Է� : ������
1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : Y

2��° ��� �Է� : ���ҿ�
2��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : N

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���ҿ�
���� ��ü ��� �Ϸ�~!!!

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 3

>> �˻��� ��� �Է� : ������

[�˻� ��� ���]
�׸��� �����մϴ�.

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 3

>> �˻��� ��� �Է� : �ݺ���

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 4

>> ������ ��� �Է� : �躸��

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�.

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 4

>> ������ ��� �Է� : ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�.

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 5

>> ������ ��� �Է� : ������

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�.

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 5

>> ������ ��� �Է� : ���ҿ�
>> ������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 2

[���� ��ü ���]
������
���� ��ü ��� �Ϸ�~!!!

	[ �޴� ����]=======
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	===================
>> �޴� ���� (1~6) : 6

���α׷� ����~!!!
��� �Ϸ��� �ƹ� Ű�� ��������.












*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Menus	// �� �ϼ�
{
	public static final int E_ADD = 1;		//-- ��� �߰�
	public static final int E_DISP = 2;		//-- ��� ���
	public static final int E_FIND = 3;		//-- ��� �˻�
	public static final int E_DEL = 4;		//-- ��� ����
	public static final int E_CHA = 5;		//-- ��� ����
	public static final int E_EXIT = 6;		//-- ����
}

public class Test163
{
	// �ֿ� �Ӽ� ���� �� �Ϸ�
	private static final Vector<Object> vt;		//-- �ڷᱸ��
	private static BufferedReader br;			//-- �Է� �� Ȱ��
	private static Integer sel;					//-- ���� ��
	private static String con;					//-- ��� ���� ����

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}


	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.printf(" [ �޴� ����]=======\n");
		System.out.printf(" 1. ��� �߰�\n");
		System.out.printf(" 2. ��� ���\n");
		System.out.printf(" 3. ��� �˻�\n");
		System.out.printf(" 4. ��� ����\n");
		System.out.printf(" 5. ��� ����\n");
		System.out.printf(" 6. ����\n");
		System.out.printf(" ===================\n");
		System.out.printf(">> �޴� ���� (1~6) : ");

	}
	
	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException 
	{

		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
		
	}
	
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case 1: addElement(); break;
		case 2: dislpElement(); break;
		case 3: fineElement(); break;
		case 4: delElement(); break;
		case 5: chaElement(); break;
		case 6: exit(); break;
		}
		/*
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dislpElement(); break;
		case Menus.E_FIND: fineElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT : exit(); break;
		}
		*/
	}

	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		/*
		do
		{
			System.out.printf("%d��° ��� �Է� :",vt.size()+1);
			String temp = br.readLine();
			vt.add(temp);
			System.out.printf("%d��° ��� �Է� ����~!!!\n",vt.size());
			System.out.print("��� �Է� ���(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y")) ;
		*/
		
		int num = 1;
		do
		{
			System.out.printf("%d��° ��� �Է�: ",num);
			vt.addElement(br.readLine());
			System.out.printf("%d��° ��� �Է� ����~!!!\n",num);
			System.out.print("��� �Է� ���(Y/N)? : ");
			con = br.readLine();
			num++;
		}
		while (con.equals("Y") || con.equals("y"));
		
	}

	// �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dislpElement()
	{
		
		System.out.print("[���� ��ü ���]\n");
		for (Object obj : vt )
		{
			System.out.println(obj);
		}
		System.out.print("���� ��ü ��� �Ϸ�~!!!\n");
		
		/*
		System.out.print("[���� ��ü ���]\n");
		for (Object obj : vt )
		{
			System.out.print(obj + " ");
		}
		System.out.print("���� ��ü ��� �Ϸ�~!!!\n");
		*/
		
	}

	// �ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void fineElement() throws IOException
	{
		
		System.out.print(">> �˻��� ��� �Է� : ");
		String temp = br.readLine();

		System.out.println("[�˻� ��� ���]");
		if (vt.contains(temp)) // vt������ temp�� �����ϸ�
		{
			System.out.print("�׸��� �����մϴ�.");
		}
		else
		{
			System.out.print("�׸��� �������� �ʽ��ϴ�.");
		}
		
	}

	// �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		
		
		System.out.print("������ ��� �Է� : ");
		String temp = br.readLine();
		if (vt.contains(temp))
		{
			int i = vt.indexOf(temp);
			System.out.printf("%s�� �����Ǿ����ϴ�.",temp);
			vt.remove(i);
		}
		else
		{
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		}
		
			
	}

	// �ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		
		System.out.println(">> ������ ��� �Է� : ");
		String temp1 = br.readLine();
		System.out.println(">> ������ ���� �Է� : ");
		String temp2 = br.readLine();
		if (vt.contains(temp1))
		{
			int i = vt.indexOf(temp1);
			vt.set(i,temp2);

			System.out.println("\t[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");

		}
		else
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
		
		
	}

	// ���α׷� ���� �޼ҵ�		�� �ϼ�(�ǵ��ʿ� x)
	public static void exit()
	{
		System.out.println("\n���α׷� ����~!!!");
		//System.exit(-1);
	}
	
	
	
	
	// main() �޼ҵ�	�� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}