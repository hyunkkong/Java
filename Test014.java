//����ڷκ��� �̸�, ��������, ��������, �������� �� �Է¹޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ������
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

//====[���]====
// �̸� : ������
// ���� : 240
//����Ϸ��� �ƹ� Ű�� ��������

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test014
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat;
		int tot;
	
	// ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

	// �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)����
	// �����Ͽ� ������ �����ϰ� �� ����� ���� ������ ��Ƴ���
	tot = kor + eng + mat;

	//��� ���
	System.out.println();
	System.out.println("====[���]====");
	System.out.println("�̸� : " + name);
	System.out.println("���� : " + tot);
	}
}
//���� ���
/*
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/