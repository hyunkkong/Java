/*=============================================
	���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����

==============================================*/
/*
 ��	 �ֹε�Ϲ�ȣ ���� ����

	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567 (�ֹι�ȣ)
	****** ******  -------------------------- �� �ڸ����� ���ϱ�
	234567 892345  (�� �ڸ��� ������ ��)

	�� ��Ģ�� �°� ���� ������ �����ϴ� ����� ��� ���Ѵ�.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
	    * * * * * *  * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
		--------------------------
		�� 14 + 15 + 0 + 30 + 6 + 3 + 8 + 72 + 12 + 6 + 4 + 15

		== 217
	�� ������ ������� 11�� ������ ������������ ���Ѵ�.
	                  -------------
	
	
	11 |  217
		  11
       ----------
		  107
		   99
       ----------
		    8	// ������

	�� 11���� ������ 0�� �� ������� ���Ѵ�

		11 - 8 �� 3

		�ب��� ó�� �������� �������� 0�� ��� �� 11 - 0 �� 11
							 �������� 1�� ��� �� 11 - 1 �� 10
		  �̸� �ٽ� 10���� ������ �������� ���Ѵ�.  11 �� 1
		  											10 �� 0

	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ��ġ�ϴ����� ���θ� ���Ͽ� Ȯ���Ѵ�.
		��ġ �� ��ȿ�� �ֹι�ȣ
		����ġ �� �߸��� �ֹι�ȣ 

*/

// ���� ��)
// �ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : 123456-12345678 �� �Է� ���� �ʰ�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : 123456-123456 �� �Է� ���� �̴�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : 750615-125205 �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : 750615-125206 �� �߸��� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �ذ��� ���� �߰� ��~!!!

//	  �迭.length			�� �迭�� ����(�迭���� ����) ��ȯ
//	  ���ڿ�.length()		�� ���ڿ��� ���� ��ȯ
//	  ���ڿ�.substring()	�� ���ڿ� ����
//	  ���ڿ�.substring(m, n)�� ���ڿ� m��° ��ġ���� n-`��° ��ġ���� ����(�ε����� 0����)
//	  ���ڿ�.substring(m)	   ���ڿ� m��° ��ġ���� ���ڿ��� ������ ����(�ε����� 0����)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test106
{
	public static void main(String[] args) throws IOException
	{
		//�׽�Ʈ
		/*
		String strTemp = "������";
		System.out.println(strTemp.length());
		//--==>>3
		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//--==>>9

		strTemp = ("study-hard");
		System.out.println(strTemp.length());
		//--==>>10
		

		// ------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>>NOPQ

		//System.out.println(strTemp.substring(13, 57));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//	StringIndexOutOfBoundsException

		System.out.println(strTemp.substring(13));
		//--==>>NOPQRSTUVWXYZ
		*/

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int [] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int tot = 0;

		System.out.print(" �ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : ");
		str = br.readLine();
		
		if (str.length() != 14)
		{
			System.out.println(">>�Է¿���~!!!");
			return;
		}
		
		for (int i=0;i<13 ;i++ )
		{ 
			if (i==6)
			{
				continue;
			}
			tot+= chk[i]*Integer.parseInt(str.substring(i,(i+1)));
		
		}
		int su = 11-tot%11;

		su=su%10;

		if(su==Integer.parseInt(str.substring(13)))
		{
			System.out.print(">>��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
			System.out.print(">>�߸��� �ֹι�ȣ~!!!");
		*/





		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�Է¹޴� �ֹι�ȣ(���ڿ� ����)�� ��Ƶ� ���� ����
		String str;

		// ���Ŀ� ���� �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		//			 7  5  0  6  1  5 - 1  8  6  2  1  3  3
		int[] chk = {2, 3, 4, 5, 6, 7 , 0, 8, 9, 2, 3, 4, 5};
		//                            ---
		//							check~!!!

		// ���� ���� �� ������ �� (�� ������ ����� ���س�����.....)
		// ---------   =========
		//            0���� �ʱ�ȭ
		int tot=0;

		System.out.print(" �ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : ");	//
		//Integer.parseInt(br.readLine) (x)
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����~!!!");
			return;		//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}
		
		//�׽�Ʈ
		//System.out.println(">> �ڸ��� ����~!!!");


		//ex) "750615-125205"
		for (int i = 0;i<13 ;i++ )		// i �� 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			//�׽�Ʈ
			//System.out.print(i + " ");
			//--==>>0 1 2 3 4 5 6 7 8 9 10 11 12

			//str.substring(0,1) // ���ڿ� ���� �� ���ȭ �ϱ� ���� Integer.parseInt�� �������·� ��ȯ�Ѵ�.
			
			
			// i�� 6�϶����� �޺κ� �����ϰ� ����ض�~!!!
			if (i==6)
			{
				continue;	
			}
			
			tot += chk[i]*Integer.parseInt(str.substring(i,(i+1)));
			
		}
		//�׽�Ʈ
		//System.out.printf("%d\n",tot);


		//--------------------------------------------- ������� �����ϸ� ����踦 ��� ���� ��Ȳ�̸�
		//												��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//												���� tot�� ����ִ� ���°� �ȴ�.

		int su = 11 - tot % 11;

		//--------------------------------------------- ������� �����ϸ� ����긦 ��� ���� ��Ȳ�̸�
		//												su �� ���� ���� ��� �� �ڸ��� ���ð��
		//												�ֹι�ȣ ������ �ڸ��� ���ڿ� �񱳸� ������ �� ���� ��Ȳ

		su = su % 10;									// su %= 10;

		if (su==Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
		{
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
		}
		
	}
}

//������
/*
�ֹι�ȣ�Է�(xxxxxx-yyyyyyy) : 750615-1862133
>> ��Ȯ�� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
