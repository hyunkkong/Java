/*===============================
	■■■ 배열 ■■■
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
================================*/

// ○ 과제
//		사용자로부터 임의의 학생 수를 입력받고
//		그만큼의 점수(정수 형태)를 입력받아
//		전체 학생의 점수의 합, 평균, 편차를 구해서
//		결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82 
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
public class Test084
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		int students;	    //사용자로부터 학생수를 입력받을 변수
		int sum = 0;		//누적합을 담을 변수
		double ave = 0;		//평균 담을 변수
		
		System.out.print("학생 수 입력 : ");
		students = sc.nextInt();
		
		//배열 선언 및 메모리 할당
		int[] arr = new int[students];	//길이가 입력할 학생 수만큼의 배열 생성
		
		for (int i=0;i<arr.length ;i++ ) 
		{
			System.out.printf("%d번 학생의 점수 입력 : ",i+1 );
			arr[i] = sc.nextInt();
			sum += arr[i];	// 학생들의 점수를 sum에 누적합
		}
		ave = sum/students; // 평균구하기
		
		System.out.println();
		System.out.printf("합 : %d\n",sum);
		System.out.printf("평균 : %.1f\n",ave);
		System.out.println("편차");
		
		//배열 선언 및 메모리 할당
		double[] arr2 = new double[students];

		for (int i=0;i<arr2.length ;i++ )
		{
			arr2[i] = ave - arr[i] ;	//편차 = 평균 - 점수
			System.out.printf("%d : %.1f\n",arr[i],arr2[i]);
		}
		

		
		
		
	}
}
//실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

합 : 370
평균 : 74.0
편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/