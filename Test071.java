/*=============================================
	���� Ŭ������ �ν��Ͻ� ����
==============================================*/

//	��	CircleTest.java ���ϰ� ��Ʈ~!!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// Ŭ������ : CircleTest �� CircleTest.java
// BufferedReader �� readLine()

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xxx

//>> �������� xxx �� ����
//>> ���� : xxxx.xx
//>> �ѷ� : xxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.IOException;
public class Test071
{
	public static void main(String[] args) throws IOException 
	{
		// CircleTest����� �ν��Ͻ� ����
		CircleTest ob = new CircleTest();
		// �Է� �޼ҵ� ȣ��
		ob.input();
		// ���� ���� �޼ҵ� ȣ��
		double area = ob.cirArea();
		// �ѷ� ���� �޼ҵ� ȣ��
		double length = ob.cirLength();
		// ��� �޼ҵ� ȣ��
		ob.print(area, length);
	}
}