/*=============================================
	���� Ŭ������ �ν��Ͻ� ����
==============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �������� ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

//��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
// Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// (Hap Ŭ���� ����)
// ����, ������ �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1050
// ������ ���� �Է�(1~1000) : 100
// 1 ~ 100������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// �ֿ� ���� ����(������� �Է°��� ��Ƴ� ����)
	int su;

	// �Է� �޼ҵ� ����
	void input() throws IOException
	{
		do
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
		
	}
	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;
		for (int i = 1; i<=su ;i++ )
		{
			result +=i;
		}
		return result;
	}
	// ��� ��� �޼ҵ� ����
	void print(int i)
	{
		System.out.printf("1 ~ %d������ �� : %d\n", su,i);
	}
}



public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// hap �ν��Ͻ� ����
		Hap ob = new Hap();
		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� �� input()
		//------------------------
		//		�������� Ȱ��
		ob.input();									// new Hap().input()

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� �� calculate()
		int sum = ob.calculate();

		// ������ �ν��Ͻ�(ob)�� ���� ��� �޼ҵ� ȣ�� �� print()
		//ob.print(ob.calculate());
		ob.print(sum);



		
	}
}
