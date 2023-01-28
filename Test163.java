/*===================================================
	■■■ 컬렉션(Collection) ■■■
===================================================*/

// Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 1

1번째 요소 입력 : 장현성
1번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : Y

2번째 요소 입력 : 엄소연
2번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : N

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 2

[벡터 전체 출력]
장현성
엄소연
벡터 전체 출력 완료~!!!

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 3

>> 검색할 요소 입력 : 장현성

[검색 결과 출력]
항목이 존재합니다.

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 3

>> 검색할 요소 입력 : 반보영

[검색 결과 출력]
항목이 존재하지 않습니다.

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 4

>> 삭제할 요소 입력 : 김보경

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다.

[검색 결과 출력]
항목이 존재하지 않습니다.

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 4

>> 삭제할 요소 입력 : 장현성

[삭제 결과 출력]
장현성 항목이 삭제되었습니다.

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 5

>> 변경할 요소 입력 : 도규희

[변경 결과 출력]
변경할 대상이 존재하지 않습니다.

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 5

>> 변경할 요소 입력 : 엄소연
>> 수정할 내용 입력 : 도규희

[변경 결과 출력]
변경이 완료되었습니다.

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 2

[벡터 전체 출력]
도규희
벡터 전체 출력 완료~!!!

	[ 메뉴 선택]=======
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	===================
>> 메뉴 선택 (1~6) : 6

프로그램 종료~!!!
계속 하려면 아무 키나 누르세요.












*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Menus	// → 완성
{
	public static final int E_ADD = 1;		//-- 요소 추가
	public static final int E_DISP = 2;		//-- 요소 출력
	public static final int E_FIND = 3;		//-- 요소 검색
	public static final int E_DEL = 4;		//-- 요소 삭제
	public static final int E_CHA = 5;		//-- 요소 변경
	public static final int E_EXIT = 6;		//-- 종료
}

public class Test163
{
	// 주요 속성 구성 → 완료
	private static final Vector<Object> vt;		//-- 자료구조
	private static BufferedReader br;			//-- 입력 시 활용
	private static Integer sel;					//-- 선택 값
	private static String con;					//-- 계속 진행 여부

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}


	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.printf(" [ 메뉴 선택]=======\n");
		System.out.printf(" 1. 요소 추가\n");
		System.out.printf(" 2. 요소 출력\n");
		System.out.printf(" 3. 요소 검색\n");
		System.out.printf(" 4. 요소 삭제\n");
		System.out.printf(" 5. 요소 변경\n");
		System.out.printf(" 6. 종료\n");
		System.out.printf(" ===================\n");
		System.out.printf(">> 메뉴 선택 (1~6) : ");

	}
	
	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException 
	{

		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
		
	}
	
	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case 1: addElement(); break;
		case 2: dislpElement(); break;
		case 3: fineElement(); break;
		case 4: delElement(); break;
		case 5: chaElement(); break;
		case 6: exit(); break;
		}
		/*
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dislpElement(); break;
		case Menus.E_FIND: fineElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT : exit(); break;
		}
		*/
	}

	// 자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		/*
		do
		{
			System.out.printf("%d번째 요소 입력 :",vt.size()+1);
			String temp = br.readLine();
			vt.add(temp);
			System.out.printf("%d번째 요소 입력 성공~!!!\n",vt.size());
			System.out.print("요소 입력 계속(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y")) ;
		*/
		
		int num = 1;
		do
		{
			System.out.printf("%d번째 요소 입력: ",num);
			vt.addElement(br.readLine());
			System.out.printf("%d번째 요소 입력 성공~!!!\n",num);
			System.out.print("요소 입력 계속(Y/N)? : ");
			con = br.readLine();
			num++;
		}
		while (con.equals("Y") || con.equals("y"));
		
	}

	// 자료구조 전체 요소 출력 메소드
	public static void dislpElement()
	{
		
		System.out.print("[벡터 전체 출력]\n");
		for (Object obj : vt )
		{
			System.out.println(obj);
		}
		System.out.print("벡터 전체 출력 완료~!!!\n");
		
		/*
		System.out.print("[벡터 전체 출력]\n");
		for (Object obj : vt )
		{
			System.out.print(obj + " ");
		}
		System.out.print("벡터 전체 출력 완료~!!!\n");
		*/
		
	}

	// 자료구조 내 요소 검색 메소드
	public static void fineElement() throws IOException
	{
		
		System.out.print(">> 검색할 요소 입력 : ");
		String temp = br.readLine();

		System.out.println("[검색 결과 출력]");
		if (vt.contains(temp)) // vt구조에 temp가 존재하면
		{
			System.out.print("항목이 존재합니다.");
		}
		else
		{
			System.out.print("항목이 존재하지 않습니다.");
		}
		
	}

	// 자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		
		
		System.out.print("삭제할 요소 입력 : ");
		String temp = br.readLine();
		if (vt.contains(temp))
		{
			int i = vt.indexOf(temp);
			System.out.printf("%s가 삭제되었습니다.",temp);
			vt.remove(i);
		}
		else
		{
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		
			
	}

	// 자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		
		System.out.println(">> 변경할 요소 입력 : ");
		String temp1 = br.readLine();
		System.out.println(">> 수정할 내용 입력 : ");
		String temp2 = br.readLine();
		if (vt.contains(temp1))
		{
			int i = vt.indexOf(temp1);
			vt.set(i,temp2);

			System.out.println("\t[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");

		}
		else
		{
			System.out.println("\t[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
		
		
	}

	// 프로그램 종료 메소드		→ 완성(건들필요 x)
	public static void exit()
	{
		System.out.println("\n프로그램 종료~!!!");
		//System.exit(-1);
	}
	
	
	
	
	// main() 메소드	→ 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}