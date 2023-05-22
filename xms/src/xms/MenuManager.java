package xms;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *학생 은행 프로그램의 메뉴 화면
 */
public class MenuManager {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClientManager clientManager = new ClientManager(sc);
		selectMenu(sc,clientManager);
		System.out.println("End the program");
	}
	
	public static void selectMenu(Scanner sc, ClientManager clientManager) {
		int num = 0;
		while(num != 6) {
			try {
				showMenu();
				num = sc.nextInt();
				switch(num) {
				case 1:
					clientManager.addClient();
					break;
				case 2:
					clientManager.deleteClient();
					break;
				case 3:
					clientManager.viewClient();
					break;
				case 4:
					clientManager.dwFunction();
					break;
				case 5:
					clientManager.edit();
					break;
				default :
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("Please put an interger between 1~6");
				if(sc.hasNext()) {
					sc.next();
				}
				num = -1;
				
			}
		}
	}
	public static void showMenu() {
		System.out.println("Menu");
		System.out.println("\t1. New Account");
		System.out.println("\t2. Delete Acoount");
		System.out.println("\t3. Infomation");
		System.out.println("\t4. Deposit/Withdrawal");
		System.out.println("\t5. Client Editor");
		System.out.println("\t6. Exit");
		System.out.print("Select one number between 1 ~ 6: ");
	}

}