package Calendar.Prj;

import java.util.Scanner;

public class Print {
	
	public void printCmd() {
		
		System.out.println("+--------------------+");
		System.out.println("| 1.일정 등록");
		System.out.println("| 2.일정 검색");
		System.out.println("| 3.달력 보기");
		System.out.println("| h.도움말");
		System.out.println("| q.종료");
		System.out.println("+--------------------+");
		
	}
	
	public void inputUser() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("명령을 입력하세요.(1, 2, 3, h, q)");
		String input = scan.next();
		if(input.equals("1")) todoRegister(input);
		else if(input.equals("2")) todoSearch(input);
		else if(input.equals("3")) calCalendar(input);
		else if(input.equals("h")) printCmd();
		else if(input.equals("q")) break;
		else System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("Thank You ;)");
		
		
	}
	
	public void todoRegister(String input) {
	}
	
	public void todoSearch(String input) {
		
	}
	
	public void calCalendar(String input) {
		
	}
	
}
