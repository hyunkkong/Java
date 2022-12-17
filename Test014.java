//사용자로부터 이름, 국어점수, 영어점수, 수학점수 를 입력받아
//이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 장현성
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

//====[결과]====
// 이름 : 장현성
// 총점 : 240
//계속하려면 아무 키나 누르세요

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test014
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat;
		int tot;
	
	// 담아낸 데이터를 변환한 후 필요한 변수에 다시 담기
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();
		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

	// 각 점수 변수에 담겨있는 데이터(사용자가 입력한 데이터)들을
	// 종합하여 총점을 산출하고 그 결과를 총점 변수에 담아내기
	tot = kor + eng + mat;

	//결과 출력
	System.out.println();
	System.out.println("====[결과]====");
	System.out.println("이름 : " + name);
	System.out.println("총점 : " + tot);
	}
}
//실행 결과
/*
이름을 입력하세요 : 장현성
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 장현성
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/