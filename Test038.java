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

// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// ��, Scanner �� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

//���� ��)
// ������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5
// >>¦���� ���� 6�̰�, Ȧ���� ���� 9�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...
import	java.util.Scanner;
public class Test038
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		int tot1 = 0, tot2 = 0; // tot1�� Ȧ��, tot2�� ¦��
		
		System.out.print("������ ���� 5�� �Է�(���� ����) : "); 
		sc = new Scanner(sc.next())
		
		a =	sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		if (sc.nextInt() %2== 0) // 1 2 3 4 5 
		{
			tot1+=
		}
		else if ( sc.nextInt() %2 != 0)
		{
			tot2+=
		} 

		System.out.printf("¦���� ���� %d�̰�, Ȧ���� ���� %d �Դϴ�. &n",tot1,tot2);
		*/

		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);

		//������ �ʱ�ȭ
		int evenSum=0;	//¦���� ���� ��Ƴ� ���� ����(������)
		int oddSum=0;		//Ȧ���� ���� ��Ƴ� ���� ����(������)
		int num1,num2,num3,num4,num5;

		//����ڷκ��� �Է¹��� �ټ� ���� ������ ��Ƴ� ���� ����

		// ���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���� ����) : "); // 1 2 3 4 5

		//��ĳ�ʴ� �������·� �о�� �� �ִ�.
		//��ĳ�ʴ� ������ �������� �൵ ���� �����Ͽ� �Է¹޴´�.
		num1 =	sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if(num1%2==0) //num1�� ¦���� �� �� evenSum �� num1 ��ŭ ����
			evenSum += num1; // evenSum �� num1��ŭ ����
		else
			oddSum += num1; // oddSum�� num1��ŭ ����
		if(num2%2==0) 
			evenSum += num2; 
		else
			oddSum += num2; 
		if(num3%2==0) 
			evenSum += num3; 
		else
			oddSum += num3; 
		if(num4%2==0) 
			evenSum += num4; 
		else
			oddSum += num4; 
		if(num5%2==0) 
			evenSum += num5; 
		else
			oddSum += num5; 
		System.out.printf("¦���� ���� %d�̰�, Ȧ���� ���� %d �Դϴ�. \n",evenSum,oddSum);



		

	}
}
//������
/*
������ ���� 5�� �Է�(���� ����) : 1 2 3 4 5
¦���� ���� 6�̰�, Ȧ���� ���� 9 �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/