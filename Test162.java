/*===================================================
	���� �÷���(Collection) ����
===================================================*/

// �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���

// Ŭ���� �� ����� ���� �ڷ������� Ȱ��
import java.util.Vector;
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)
	private String name;			//-- �̸�
	private int age;				//-- ����

	// getXxx() �� getter
	// setXxx() �� setter

	//getter / setter ����
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	// ������
	public MyData(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	// �� ����� ���� �����ڰ� ������ ���
	//	  default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//	  default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//	  �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//	  (�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����)

	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		//this("",0);
		name = "";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();

		// ���� �ڷᱸ�� v ��
		// ������ 13�� / ���̰� 7�� / ������ 3��
		// ��Ƴ���
		/*
		MyData md1 = new MyData("������",13);
		v.add(md1);
		MyData md2 = new MyData("���̰�",7);
		v.add(md2);
		MyData md3 = new MyData("������",3);
		v.add(md3);
		*/
		/* 
		for (MyData str : v )
		{
			System.out.print(str + " ");			(x)
		}System.out.println();
		*/
		/*
		for (MyData str : v )
		{
			System.out.printf("%3s %2d ",str.getName(),str.getAge());
		}System.out.println();
		*/
		// ��
		/*
		MyData st1 = new MyData();
		st1.setName("������");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("���̰�");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(3);
		v.add(st3);
		*/

		// ��
		/*
		MyData st1 = new MyData("������",13);
		v.add(st1);
		MyData st2 = new MyData("���̰�",7);
		v.add(st2);
		MyData st3 = new MyData("������",3);
		v.add(st3);
		*/

		// ��
		v.add(new MyData("������", 13));
		v.add(new MyData("���̰�", 7));
		v.add(new MyData("������", 3));

		// ���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		// �̸� : ������, ���� : 13��
		// �̸� : ���̰�, ���� : 7��
		// �̸� : ������, ���� : 3��

		for ( MyData str : v )
		{
			System.out.printf("�̸� : %s, ���� : %d��\n",str.getName(),str.getAge());
		}System.out.println();
		//--==>>�̸� : ������, ���� : 13��
		//		�̸� : ���̰�, ���� : 7��
		//		�̸� : ������, ���� : 3��

		// ��
		for (int i=0; i<v.size() ;i++ )
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}System.out.println();

		/*
		�̸� : ������, ���� : 13��
		�̸� : ���̰�, ���� : 7��
		�̸� : ������, ���� : 3��
		*/

		// ��
		for (int i=0; i<v.size() ; i++ )
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", v.get(i).getName(), v.get(i).getAge());
		}System.out.println();

		for (Object temp : v)	// ��ĳ����
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", ((MyData)temp).getName(),((MyData)temp).getAge());
		}System.out.println();





		
	}
}