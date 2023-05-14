package client;

import java.util.Scanner;

public class MiddleSchoolClient extends Client implements ClientInput{
	protected ClientKind kind = ClientKind.MIDDLESCHOOL;
	protected String phoneParents;
	protected String schoolName;

	public MiddleSchoolClient(ClientKind kind) {
		super(kind);
	}
	
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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
				this.setPhoneParents("없음");
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
		System.out.print("등록할 고객의 학교이름을 적어주세요 (예시 : 한국중학교) : ");
		String schoolName = sc.next();
		this.setSchoolName(schoolName);
		System.out.print("등록할 고객의 계좌를 적어주세요 : ");
		int account = sc.nextInt();
		this.setAccount(account);
		System.out.print("정보 등록이 완료되었습니다.\n");
	}
	public void printInfo() {
		String ckind ="none";
		switch (this.kind) {
		case UNIVERSITY :
			ckind = "대학생";
			break;
		case HIGHSCHOOL :
			ckind = "고등학생";
			break;
		case MIDDLESCHOOL :
			ckind = "중학생";
			break;
		case ELEMENTARY :
			ckind = "초등학생";
			break;
		default:
		}
		System.out.println("Name: " + name + ", ID: " + id + ", Account: " + account + ", Money: " + money + ", Kind : " + ckind + ", Parent Phone Number: " + phoneParents);
	}
}
