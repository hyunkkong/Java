/*=============================================
	���� ���� �帧�� ��Ʈ�� (���)����
	- �ݺ���(for��) �ǽ�
==============================================*/

//���� ��)
//	[2��]
//	2 * 1 = 2
//	2 * 2 = 4
//		:
//		:
//	[9��]
//	9 * 1 = 9
//	9 * 2 = 18
//		:
//	9 * 9 = 81
public class Test059
{
	public static void main(String[] args)
	{
		int dan,num;

		
		// ��~ ��~
		for (dan=2;dan<=9 ;dan++)		// �� ó��
		{
			//�׽�Ʈ(Ȯ��)
			//System.out.println(" [dan :" + dan + "]");
			System.out.printf("\n========[%d��]========\n",dan);
			
			// ������~~!!!
			for (num=1;num<=9 ;num++)			// �������� �� ó��
			{
				//�׽�Ʈ(Ȯ��)
				//System.out.println("j : " + num);
				System.out.printf("%d x %d = %d\n",dan,num,dan*num);
			}
		}
		
		
		
		
		/*
		// ��~ ��~
		for (dan=2;dan<=9 ;dan++)		// �� ó��
		{
			// ������~~!!!
			for (num=1;num<=9 ;num++)			// �������� �� ó��
			{
				System.out.printf("");
				System.out.printf("%d x %d = %d\n",dan,num,dan*num);
			}
		}
		*/
	}
}