/*===========================================
���� �ڹ� �⺻ ���α׷��� ����
-�ڹ��� �⺻ ����� : System.util.scanner
============================================*/

//�� java.util.Scanner
// �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
// ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
// �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
// �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test019
{
	public static void main(String [] args)
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");
		//�̸�,����,����,���� �Է�(��,������) : ������,90,80,70
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//String temp = sc.next();
		//sc = new Scanner(temp).useDelimiter("\\s*,\\s*"); - ������ ���ٷ� 

		//new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//            ---------
		//			"������,90,80,70"
		//new Scanner(������,90,80,70).useDelimiter("\\s*,\\s*");
		//                            .�����ڻ��();
		//                "\\" �� "\"               "\s*,\s*"
		//                                           ----
		//										�����ǹ��ڿ� , �����ǹ��ڿ�

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor+eng+mat;

		// ��� ���
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + tot);
	}
}

//������

/*
�̸�,����,����,���� �Է�(��,������) : ������,90,80,70
�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/