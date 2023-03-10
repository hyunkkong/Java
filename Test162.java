/*===================================================
	■■■ 컬렉션(Collection) ■■■
===================================================*/

// 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용
// → 자료형

// 클래스 → 사용자 정의 자료형으로 활용
import java.util.Vector;
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;			//-- 이름
	private int age;				//-- 나이

	// getXxx() → getter
	// setXxx() → setter

	//getter / setter 구성
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자
	public MyData(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	// ※ 사용자 정의 생성자가 구성될 경우
	//	  default 생성자가 자동으로 삽입되지 않기 때문에
	//	  default 생성자 형태의 생성자를 사용자 정의 생성자로
	//	  추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//	  (반드시 설계해야 한다는 문법적이 규칙은 없음)

	// 생성자(매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		//this("",0);
		name = "";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>();

		// 벡터 자료구조 v 에
		// 정영준 13세 / 정미경 7세 / 한은영 3세
		// 담아내기
		/*
		MyData md1 = new MyData("정영준",13);
		v.add(md1);
		MyData md2 = new MyData("정미경",7);
		v.add(md2);
		MyData md3 = new MyData("한은영",3);
		v.add(md3);
		*/
		/* 
		for (MyData str : v )
		{
			System.out.print(str + " ");			(x)
		}System.out.println();
		*/
		/*
		for (MyData str : v )
		{
			System.out.printf("%3s %2d ",str.getName(),str.getAge());
		}System.out.println();
		*/
		// ①
		/*
		MyData st1 = new MyData();
		st1.setName("정영준");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("정미경");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("한은영");
		st3.setAge(3);
		v.add(st3);
		*/

		// ②
		/*
		MyData st1 = new MyData("정영준",13);
		v.add(st1);
		MyData st2 = new MyData("정미경",7);
		v.add(st2);
		MyData st3 = new MyData("한은영",3);
		v.add(st3);
		*/

		// ③
		v.add(new MyData("정영준", 13));
		v.add(new MyData("정미경", 7));
		v.add(new MyData("한은영", 3));

		// 벡터 자료구조 v에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름 : 정영준, 나이 : 13세
		// 이름 : 정미경, 나이 : 7세
		// 이름 : 한은영, 나이 : 3세

		for ( MyData str : v )
		{
			System.out.printf("이름 : %s, 나이 : %d세\n",str.getName(),str.getAge());
		}System.out.println();
		//--==>>이름 : 정영준, 나이 : 13세
		//		이름 : 정미경, 나이 : 7세
		//		이름 : 한은영, 나이 : 3세

		// ②
		for (int i=0; i<v.size() ;i++ )
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}System.out.println();

		/*
		이름 : 정영준, 나이 : 13세
		이름 : 정미경, 나이 : 7세
		이름 : 한은영, 나이 : 3세
		*/

		// ③
		for (int i=0; i<v.size() ; i++ )
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", v.get(i).getName(), v.get(i).getAge());
		}System.out.println();

		for (Object temp : v)	// 업캐스팅
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", ((MyData)temp).getName(),((MyData)temp).getAge());
		}System.out.println();





		
	}
}