/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
-�ڹ��� �⺻ ����� : System.util.scanner
============================================*/

//�� java.util.Scanner
// �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
// ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
// �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
// �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner; //�ڹ� �ȿ��ִ� ��ƿ�ȿ� �ִ� ��ĳ�ʶ� ���赵
//import.java.io.IOException

public class Test017
{
	public static void main(String [] args) //throws IOException
	{
		// Scanner Ŭ���� ����� �ν��Ͻ� ����
		// BufferedReader br;
		Scanner sc = new Scanner(System.in);
		// new Scanner;�� Scanner(); ������ ������ ����
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader(����)�� System.in�� �ٷ� �Ѱ��ټ� ���� InputStreamReader�� ���� 

		//���� ����� ���� = ������ ��������.

		//�ֿ� ���� ����
		String name;		//�̸�
		int kor, eng, mat;	//����, ����, ����

		//���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		//br.readLine();
		name = sc.next();
		//�׽�Ʈ (Ȯ��)
		System.out.println("�Է��� �̸� : " + name);

		System.out.print("���� ���� �Է� : ");
		//kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		//���� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		//System.out.println(">> ���� : " + kor + eng + mat);
		System.out.println(">>���� : " + (kor + eng + mat));


	}
}

//���� ���

/*
�̸��� �Է��ϼ��� : ������
�Է��� �̸� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

>> �̸� : ������
>>���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/