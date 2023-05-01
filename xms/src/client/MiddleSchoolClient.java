package client;

import java.util.Scanner;

public class MiddleSchoolClient extends Client {
	protected int phoneParents;


	public int getPhoneParents() {
		return phoneParents;
	}


	public void setPhoneParents(int phoneParents) {
		this.phoneParents = phoneParents;
	}


	public void getUserInput(Scanner sc) {
		System.out.print("부모님의 전화번호를 '-'기호 없이 써주세요.");
		int phone = sc.nextInt();
		this.setPhoneParents(phone);
		System.out.print("등록할 고객의 Id를 적어주세요 : ");
		int id = sc.nextInt(); //sc.next면 문자열 중 제일 앞의 단어만 받아들임.
		this.setId(id); 
		System.out.print("등록할 고객의 이름을 적어주세요 : ");
		String name = sc.next();
		this.setName(name);
		System.out.print("등록할 고객의 계좌를 적어주세요 : ");
		int account = sc.nextInt();
		this.setAccount(account);
		System.out.print("정보 등록이 완료되었습니다.\n");
	}
	public void printInfo() {
		System.out.println("name : "+name+", id: "+id+", account : "+account+", money : "+money+", parent phoneNumber : "+phoneParents+" 중학생");
	}
}
