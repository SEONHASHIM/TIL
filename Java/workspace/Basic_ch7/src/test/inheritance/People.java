package test.inheritance;

public class People {
	private String name, ssn;
	
	public People() {
		super();
	}

	
	public People(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	};
}

class Student extends People{
	// 아무것도 작성하지 않으면 default 생성자를 생성하지만, 부모 생성자에 argument를 안 받는 생성자가 없어서 에러가 난다.
}