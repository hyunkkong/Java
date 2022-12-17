/*=============================================
	■■■ 정렬(Sort) 알고리즘 ■■■
==============================================*/

// ○ 과제
//	  사용자로부터 여러 학생의 성적 데이터를 입력받아
//	  점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//	  결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 잇도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 장현성 90
// 이름 점수 입력(2, 공백 구분) : 정미경 80
// 이름 점수 입력(3, 공백 구분) : 최동현 85
// 이름 점수 입력(4, 공백 구분) : 조현하 75
// 이름 점수 입력(5, 공백 구분) : 박원석 95
/*
-------------------
1등 박원석 95
2등 장현성 90
3등 최동현 85
4등 정미경 80
5등 조현하 75
-------------------
계속하려면 아무 키나 누르세요...
*/
import java.util.Scanner;
public class Test110
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int inwon; //사용자가 입력한 인원 수를 담을 변수
		int i = 1;
		
		
		//인원 수 입력
		do
		{
			System.out.print("인원 수 입력 : ");
			inwon = sc.nextInt();
		}
		while (inwon<1); // 입력한 인원 수가 1보다 작을 시 다시 입력
		

		//입력받은 학생 수 만큼의 배열방 생성 
		String[] name = new String[inwon];	//이름을 담을 배열
		int [] score = new int[inwon];		//점수를 담을 배열
		int [] rank = new int[inwon];		//석차를 담을 배열

		do
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ",i);
			name[i-1] = sc.next();
			score[i-1] = sc.nextInt();
		}
		while (i++<inwon);
		
		boolean flag;
		int pass=0;

		//향상된 Bubble Sort
		do
		{
			flag = false; //이번 회전에서 자리 바꿈이 일어나지 않을 것이다...
			pass++;
			for (i=0; i<inwon-pass ;i++ )
			{
				if (score[i]<score[i+1])	// 내림차순
				{
					//자리바꿈
					score[i]=score[i]^score[i+1]; 
					score[i+1]=score[i+1]^score[i];
					score[i]=score[i]^score[i+1];
					

					String Temp; // 임시로 설정

					Temp=name[i];
					name[i]=name[i+1];
					name[i+1]=Temp;

					flag = true;
					//-- 단 한 번이라도 스왑(자리바꿈)이 발생하게 되면
					//	 flag 변수는 true 로 변경~!!!
				}
			}
			
		}
		while (flag);

		//rank
		for (i=0;i<inwon ;i++ )		
		{
			rank[i] = 1;
			for (int j=0;j<inwon ;j++ )		
			{
				if (score[i]<score[j])
				{
					rank[i]+=1;
				}
			}
			
		}

		//결과 출력
		System.out.println("-------------------");

		for (i=0; i<inwon;i++ )
		{
			//System.out.printf("%d등 %s %d\n",i+1,name[i],score[i]);
			System.out.printf("%d등 %s %d\n",rank[i],name[i],score[i]);
		}
		System.out.println("-------------------");

	}
}
//실행 결과

/*
인원 수 입력 : 5
이름 점수 입력(1, 공백 구분) : 장현성 90
이름 점수 입력(2, 공백 구분) : 정미경 80
이름 점수 입력(3, 공백 구분) : 최동현 85
이름 점수 입력(4, 공백 구분) : 조현하 75
이름 점수 입력(5, 공백 구분) : 박원석 95
-------------------
1등 박원석 95
2등 장현성 90
3등 최동현 85
4등 정미경 80
5등 조현하 75
-------------------
계속하려면 아무 키나 누르십시오 . . .
*/