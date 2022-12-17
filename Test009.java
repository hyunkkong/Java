/*==========================================
자바의 개요 및 특징
-변수와 자료형
-변수와 자료형 시습 및 테스트 : double
-나눗셈 연산 실습
==========================================*/


public class Test009
{
	public static void main(String[] args)
	{
		//정수와 정수의 나눗셈
		double a = 1 / 2;
		//double a = 0;          정수,정수 일 때 몫을 취한다 
		//double a = 1.0 / 2;		   (o)
		//double a = (double)1 / 2;    (x)

		
		System.out.println("double a : " + a);
		// double a :0.0   int ->double 로 형변환

		double b = (double)1 /2;
		System.out.println("double b : "+ b);
		//double b : 0.5

		double c = 1/2 + 1/2;
		System.out.println("double c :"+ c);
		//double:c :0.0


		double d = 1 / 2.0;
		System.out.println("double d : "+d);




		//나눗셈 연산과 관련하여 피연산자중 실수가 하나라도 포함되면
		//연산은 실수기반의 연산이 수행되면
		//결과값 또한 실수 형태로 반환된다.

		double e = 3/2 + 1/2;
		//double e = 1 +1/2;
		//double e = 1 + 0;
		//double e = 1;

		System.out.println("double e : "+ e);
		
		
		/*최종결과
		double a : 0.0
double b : 0.5
double c :0.0
double d : 0.5
double e : 1.0
*/

		
	}
}