/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- �ݺ���(for��) �ǽ�
==============================================*/

// ���� for��(�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�

//	��	����
//		������ ���� ������ ��µ� �� �ֵ���
//		�ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
    *	����4, ��1
   **	����3, ��2 -������ ����, ���� ����
  ***
 ****
*****

*/

public class Test061
{
	public static void main(String[] args)
	{
		int i,j;
		for (i=0;i<5 ;i++ )					// ���� 5ȸ �ݺ�
		{
			for (j=0;j<4-i ;j++ )			// ���� �����Ҽ��� ���� ����
			{
				System.out.print(" ");
			}
			for (j=0;j<i+1 ;j++ )			// ���� �����Ҽ��� ���� ���� ����
			{
				System.out.print("*");
			}
			System.out.println();			// �� ��� �� ����
		}
	}
}
//������
/*

    *
   **
  ***
 ****
*****
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/