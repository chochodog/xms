package xms;
import java.util.Scanner;
/**
 *메뉴 화면임을 알리고, 수행할 선택지들을 보여주기 위한 class이다.
 */
public class MenuManager {
	public static void main(String[] args) {
		int num =0;
		Scanner sc = new Scanner(System.in);
		// 반복문을 통해 5.Exit가 아닐 경우, 선택지에서의 활동 후에 메뉴가 다시 출력되도록함.
		while(num != 5) {
			System.out.println("Menu");
			System.out.println("\t1.New Account");
			System.out.println("\t2.Delete Acoount");
			System.out.println("\t3.infomation");
			System.out.println("\t4.Deposit/Withdrawal");
			System.out.println("\t5.Exit");
			System.out.println("Select one number between 1 ~ 5");
			num = sc.nextInt(); //선택지 선택을 위한 스캐너
			
			/*
			 * switch문을 통해, 위 번호 중 하나를 선택했을 때를 case로 나누어서 활동을 가능하게 하고
			 * 활동이 끝나면 break를 통해 swich문을 끝내고 메뉴가 출력가능하도록 함.
			 */
			switch(num) {
			case 1:
				addClient();
				break;
			case 2:
				deleteClient();
				break;
			case 3:
				viewClient();
				break;
			case 4:
				dwFunction();
				break;
			}
		}
		System.out.print("프로그램이 정상적으로 종료되었습니다.");//메뉴에서 5번을 입력했을 경우, 종료를 알리는 출력문
		sc.close();
	}
	public static void addClient() {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 고객의 ID를 적어주세요 : ");
		String clientName10 = sc.next(); //sc.next면 문자열 중 제일 앞의 단어만 받아들임.
		System.out.print("등록할 고객의 이름을 적어주세요 : ");
		String clientName11 = sc.next(); //sc.next면 문자열 중 제일 앞의 단어만 받아들임.
		System.out.print("등록할 고객의 계좌를 적어주세요 : ");
		String clientName12 = sc.next(); //sc.next면 문자열 중 제일 앞의 단어만 받아들임.
		System.out.print("정보 등록이 완료되었습니다.\n");
	}
	public static void deleteClient() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정보를 제거할 고객의 ID를 적어주세요 : ");
		String clientName20 = sc.next();
		System.out.print("정보를 제거할 고객의 이름을 적어주세요 : ");
		String clientName21 = sc.next();
		System.out.print("신상정보 제거가 완료되었습니다.\n");
	}
	public static void viewClient() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 대상의 ID를 적어주세요. : ");
		String clientName3 = sc.next();
	}
	public static void dwFunction() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객의 이름을 적어주세요 : ");
		String clientName40 = sc.next();
		System.out.print("선택지를 번호로 눌러주세요. 1.인출 2.입금 ");
		int moneySelect = sc.nextInt();
		if(moneySelect == 1) {
			System.out.print("인출할 금액을 적어주세요 : ");
			int outMoney = sc.nextInt();
			System.out.println("인출이 완료되었습니다.");
		}
		else if(moneySelect == 2) {
			System.out.print("입금할 금액을 적어주세요 : ");
			int inMoney = sc.nextInt();
			System.out.println("입금이 완료되었습니다. ");
		}
		else {
			System.out.println("잘못된 번호입니다.");
		}
		
	}

}