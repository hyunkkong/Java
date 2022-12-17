/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- if ��
	- if ~ else �� �ǽ�
==============================================*/

//	1.	���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//		�б� ���������ϱ� ���� ����ϴ� �������
//		if ��, if else ��, ���� ������, ���� if ��(if�� ��ø)
//		, switch ���� �ִ�.

//	2.	if ���� if ������ ������ ���� ���
//		Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//	����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
//	������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
//	����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻�				: A
// 80�� �̻� 90�� �̸�		: B
// 70�� �̻� 80�� �̸�		: C
// 60�� �̻� 70�� �̸�		: D
// 60�� �̸�				: F

// ��, BufferedReader �� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� : ������
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� �������Դϴ�.
// >> ���� ������ 90
// >> ���� ������ 80
// >> ���� ������ 70
// >> ������ 270�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// >> ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031 
{
	public static void main(String[] args)throws IOException
	{
		//1. ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String strName;
		int nKor, nEng, nMat;
		
		// 2. �̸�, ���� ���� �Է�
		System.out.print("�̸� �Է�:");
		strName = br.readLine();			
		System.out.print("���� ���� �Է�:");
		String strKor = br.readLine();
		System.out.print("���� ���� �Է�:");
		String strEng = br.readLine();
		System.out.print("���� ���� �Է�:");
		String strMat = br.readLine();
		
		
		// 3. ���ڿ� ���� ���� ������ ��ȯ
		nKor = Integer.parseInt(strKor);
		nEng = Integer.parseInt(strEng);
		nMat = Integer.parseInt(strMat);

		// 4. ������ ��� 
		int tot = nKor + nEng + nMat;
		double avg = tot /3.0 ;
		// 5. ��޿� ���� ���� �˻縦 �����Ѵ�.
		char grade = 'F';
		//char grade;

		if(avg >= 90)
		{	
			grade = 'A';
		}
		else if(avg >= 80)	//����� 90 �̸� ���� ����
		{
			grade = 'B';
		}
		else if (avg >= 70)	//����� 80 �̸� ���� ����
		{
			grade = 'C';
		}
		else if (avg >= 60)	//����� 70 �̸� ���� ����
		{
			grade = 'D';
		}
		//else				//����� 60 �̸� ���� ����
		//{
		//	grade = 'F';
		//}
		
		//���� ���� ���
		System.out.printf("\n����� �̸��� %s �Դϴ�.\n",strName);
		System.out.printf("���� ������ %s \n",strKor);
		System.out.printf("���� ������ %s \n",strEng);
		System.out.printf("���� ������ %s \n",strMat);
		System.out.printf("������ %d�̰�, ����� %.2f�Դϴ�. \n",tot,avg);
		System.out.printf("����� %c�Դϴ�. \n",grade);



	}
}

//���� ���
/*
�̸� �Է�:������
���� ���� �Է�:90
���� ���� �Է�:80
���� ���� �Է�:70

����� �̸��� ������ �Դϴ�.
���� ������ 90
���� ������ 80
���� ������ 70
������ 240�̰�, ����� 80.00�Դϴ�.
����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
