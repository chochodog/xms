package client;

import java.util.Scanner;

public class HighSchoolClient extends Client {
	protected ClientKind kind = ClientKind.HIGHSCHOOL;
	protected String phoneParents;

	public HighSchoolClient(ClientKind kind) {
		super(kind);
	}
	public String getPhoneParents() {
		return phoneParents;
	}


	public void setPhoneParents(String phoneParents) {
		this.phoneParents = phoneParents;
	}


	public void getUserInput(Scanner sc) {
		char answer = 'x';
		while(answer != 'Y' && answer !='y' && answer != 'N' && answer !='n') {
			System.out.print("부모님 전화번호가 있나요? (Y/N)");
			answer = sc.next().charAt(0); // char를 입력받는 방법
			if(answer == 'y' || answer == 'Y') {
				System.out.print("부모님의 전화번호를 '-'기호 없이 써주세요.");
				String phone = sc.next();
				this.setPhoneParents(phone);
				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setPhoneParents("");
				break;
			}
			else {
			}
		}
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
		String skind ="none";
		switch (kind) {
		case UNIVERSITY :
			skind = "대학생";
			break;
		case HIGHSCHOOL :
			skind = "고등학생";
			break;
		case MIDDLESCHOOL :
			skind = "중학생";
			break;
		case ELEMENTAL :
			skind = "초등학생";
			break;
		default:
		}
		System.out.println(skind+", name : "+name+", id: "+id+", account : "+account+", money : "+money+", parent phoneNumber : "+phoneParents);
	}
}
