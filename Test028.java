/*===========================================
	���� ������(Operatior) ����
	- �� ������ == ���� ������
============================================*/

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ �������,��������, 0���� �����Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� Ȱ���ϰ�,
// ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է� : -12
//-12 �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 257
//257 �� ���
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է� : 0
//0 �� ��
//����Ϸ��� �ƹ� Ű�� ��������...

//��Ʈ ���� ������ ��ø
 
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test028
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		String strResult;
		
		System.out.printf("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		
		strResult = (n == 0)? "0": (n > 0)? "���" : "����" ;

		/*
		n�� 0�� ����	�� true		�� n�� 0
						�� false	�� n�� 0���� ũ��	�� true		�� n�� ���
														�� false	�� n�� ����

		*/

		System.out.printf("%d �� %s\n",n,strResult);
		//System.out.println(n + "��" + strResult);

	}
}

//���� ���
/*

������ ���� �Է� : -12
-12 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 257
257 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0
0 �� 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/