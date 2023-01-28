/*===================================================
	■■■ 컬렉션(Collection) ■■■
===================================================*/

// Set → HashSet, TreeSet
// - 순서 없음.
// - 중복을 허용하지 않는 구조(기본) // 식별할 수가 없어서

/*
 ○ TreeSet<E> 클래스

	java.util.TreeSet<E> 클래스는
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현할 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.
*/

// VO  - Value Object
// DTO - Data Transfer Object
// DAO - Data Access Object

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
	// 주요 속성 구성
	private String hak;			//-- 학번
	private String name;		//-- 이름
	private int kor,eng,mat;	//-- 국어, 영어, 수학 점수

	// 생성자(사용자 정의 생성자) → 5개의 매개변수를 가진 생성자
	GradeVO(String hak,String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// default 생성자 자동 삽입되지 않음~!!!

	// 생성자(사용자 정의 생성자) → 매개변수 없는 생성자
	//-- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//	  default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//	  추가로 정의한 생성자

	GradeVO()
	{
		this("","",0,0,0);
	}

	// getter / setter 구성
	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak = hak;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor = kor;
	}

	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng = eng;
	}

	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat = mat;
	}

	// 추가 메소드 정의(총점 산출)
	public int getTot()
	{
		//return kor + eng + mat;
		return this.kor + this.eng + this.mat;
	}
}

class MyComparator<T> implements Comparator<T>	//T : 타입
{
	// 비교 메소드 재정의
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		// 학번 기준(오름차순)
		// return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

		// return Integer.parseInt("2206113") - Integer.parseInt("2206115");
		// return 2206113 - 2206115;
		// return -2;

		// 학번 기준(내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		
		// 총점 기준(내림차순)
		//return s2.getTot() - s1.getTot();

		// 총점 기준(오름차순)
		//return s1.getTot() - s2.getTot();

		// 이름 기준(오름차순)
		// return 정수형;
		return s1.getName().compareTo(s2.getName());

		// 이름 기준(내림차순)
		//return s2.getName().compareTo(s1.getName());

		// 이름 기준(오름차순)
		//return s1.getName().charAt(0) - s2.getName().charAt(0);	// 성이 같은 경우 문제발생
		// 그외에도 한글에 charAt()을 사용하는 경우 변수가 많음
			
			
	}
}

public class Test169
{
	public static void main(String[] args)
	{
		//TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet 자료구조 set 에 요소 추가 → add();
		set.add("귀멸의칼날");
		set.add("명탐정코난");
		set.add("하이큐");
		set.add("너의이름은");
		set.add("포켓몬");
		set.add("센과치히로의행방불명");
		set.add("디지몬어드벤쳐");
		set.add("이웃집토토로");
		set.add("짱구는못말려");
		set.add("아기공룡둘리얼음별대모험");
		set.add("러브라이브");

		//Iterator를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}System.out.println();
		//--==>> 귀멸의칼날 너의이름은 디지몬어드벤쳐 러브라이브 명탐정코난 
		//		 센과치히로의행방불명 아기공룡둘리얼음별대모험 이웃집토토로 
		//		 짱구는못말려 포켓몬 하이큐
		//-- 요소를 문자열로 구성할 경우
		//	 가나다순 → 오름차순 정렬 확인

		// 정렬 기능은 리소스 소모가 심함

		// TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		//				↓
		// MyComparator 클래스를 생성하여
		// compare() 메소드를 재정의한 후 다시 생성
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());


		// TreeSet 자료구조 set2에 요소 추가
		set2.add(new GradeVO("2206113", "도규희", 90, 80, 70));
		set2.add(new GradeVO("2206115", "최동현", 91, 81, 71));
		set2.add(new GradeVO("2206128", "김인교", 88, 78, 68));
		set2.add(new GradeVO("2206139", "조영관", 70, 60, 50));
		set2.add(new GradeVO("2206150", "민찬우", 99, 82, 72));
		set2.add(new GradeVO("2206150", "김태민", 80, 70, 72));

		// Iterator 를 활용한 set2 요소 전체 출력
		/*
		Iterator<GradeVO> it2 = set2.iterator();

		while (it2.hasNext()) // 다음값 있는지 없는지
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/
		//--==>> 에러 발생(런타임 에러)
		//		 Exception in thread "main" java.lang.ClassCastException: 
		//		 GradeVO cannot be cast to java.lang.Comparable

		//					↓
		//
		// MyComparator 클래스를 생성하여
		// compare() 메소드를 재정의한 후 다시 구성
		
		
		/*
		Iterator<GradeVO> it2 = set2.iterator();

		while (it2.hasNext()) // 다음값 있는지 없는지
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		*/
		//--==>> GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		
		//					↓

		// 객체에 직접 접근하여 출력하는 것이 아니라
		// 객체가 갖고있는 속성에 접근하여 출력할 수 있도록 처리


		Iterator<GradeVO> it2 = set2.iterator();
		
		// 『hasNext()』 : 다음 데이터 요소가 있는지 없는지의 여부를 확인 
		// 『next()』    : 다음 데이터 요소를 직접적으로 반환

		while (it2.hasNext()) // 다음값 있는지 없는지
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %s %d %d %d %d\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTot());
		}
		System.out.println();
		//--==>>
		/*
		2206113 도규희 90 80 70
		2206115 최동현 91 81 71
		2206128 김인교 88 78 68
		2206139 조영관 70 60 50
		2206150 민찬우 99 82 72
		*/
		
		
		// 총점 입력 후

		//--==>>
		/*
		// 학번 기준 (오름차순 정렬)
		2206113 도규희 90 80 70 240
		2206115 최동현 91 81 71 243
		2206128 김인교 88 78 68 234
		2206139 조영관 70 60 50 180
		2206150 민찬우 99 82 72 253
		*/

		/*
		//학번 기준(내림차순 정렬)
		2206150 민찬우 99 82 72 253
		2206139 조영관 70 60 50 180
		2206128 김인교 88 78 68 234
		2206115 최동현 91 81 71 243
		2206113 도규희 90 80 70 240
		*/

		// 총점 기준(오름차순)
		/*
		2206139 조영관 70 60 50 180
		2206128 김인교 88 78 68 234
		2206113 도규희 90 80 70 240
		2206115 최동현 91 81 71 243
		2206150 민찬우 99 82 72 253
		*/

		// 총점 기준(내림차순)
		/*
		2206150 민찬우 99 82 72 253
		2206115 최동현 91 81 71 243
		2206113 도규희 90 80 70 240
		2206128 김인교 88 78 68 234
		2206139 조영관 70 60 50 180
		*/

		// 이름 기준(오름차순)
		/*
		2206128 김인교 88 78 68 234
		2206113 도규희 90 80 70 240
		2206150 민찬우 99 82 72 253
		2206139 조영관 70 60 50 180
		2206115 최동현 91 81 71 243
		*/

		// 이름 기준(내림차순)
		/*
		2206115 최동현 91 81 71 243
		2206139 조영관 70 60 50 180
		2206150 민찬우 99 82 72 253
		2206113 도규희 90 80 70 240
		2206128 김인교 88 78 68 234
		*/
	}
}