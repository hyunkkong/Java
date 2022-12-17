/*==============================================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
==============================================================*/

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있또록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// [가이드라인]
// 프로그램을 구성하는 클래스
// 1. Record 클래스
//	  - 속성만 존재하는 클래스로 설계할 것~!!!


// 2. Sungjuk 클래스
//	  - 인원 수를 입력 받아, 입력받은 인원 수 만큼
//		이름, 국어점수, 영어점수, 수학점수를 입력받고
//		총점과 평균을 산출하는 클래스로 설계할 것~!!!
//		- 속성 : 인원수, Record 타입의 배열
//		- 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균연산, 결과 출력

// 3. Test101 클래스
//	  - main() 메소드가 존재하는 외부 클래스로 설계할 것~!!!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 장현성
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 정미경
// 국어 점수 : 92
// 영어 점수 : 82
// 수학 점수 : 72

// 3번째 학생의 이름 입력 : 조영관
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62

// 장현성 90 80 70 240 xx.xx 2
// 정미경 92 82 72 xxx xx.xx 1
// 조영관 82 72 62 xxx xx.xx 3

// 계속하려면 아무 키나 누르세요...
/*
import java.util.Scanner;

class Record
{
	String name;
	int[] score = new int[3];
	int sum;
	double ave;

}

class Sungjuk
{
	int person;		//인원 수 입력받을 변수
	Record[] rec;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			person = sc.nextInt();
		}
		while (1>person && person>100);
		rec = new Record[person];
	}
	
	void inputInfo()
	{	
		Scanner sc = new Scanner(System.in);
		

		for (int i=0;i<person ;i++ )	//이름
		{	
			rec[i] = new Record();
			System.out.printf("%d번째 학생의 이름 입력 :",i+1);
			rec[i].name = sc.next();
			System.out.print("국어 점수 : ");
			rec[i].score[0]=sc.nextInt();
			System.out.print("영어 점수 : ");
			rec[i].score[1]=sc.nextInt();
			System.out.print("수학 점수 : ");
			rec[i].score[2]=sc.nextInt();
			
		}

		for (int i=0; i<person ; i++ )
		{
			rec[i].sum += rec[i].score[0]+rec[i].score[1]+rec[i].score[2];
			rec[i].ave = rec[i].sum/3.0;
		}
			 
	}
	
	void print()
	{
		for (int i=0;i<person ;i++ )
		{
			System.out.printf("%5s",rec[i].name);
			System.out.printf("%4d %4d %4d",rec[i].score[0],rec[i].score[1],rec[i].score[2]);
			System.out.printf("%4d",rec[i].sum);
			System.out.printf(" %.2f",rec[i].ave);
			System.out.println();
		}
	}




}
public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk ob = new Sungjuk();
		ob.input();
		ob.inputInfo();
		ob.print();	
	}
}
*/

public class Test101
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();
	}
}
