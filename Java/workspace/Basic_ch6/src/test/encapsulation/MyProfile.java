package test.encapsulation;

public class MyProfile {
	String name = "심선하";
	MyDate birthday = new MyDate();
	public void setBirthday() {
		birthday.setYear(1980000);
		birthday.setMonth(3);
		birthday.setDay(-10);
		System.out.print(birthday.getYear()+"년");
		System.out.print(birthday.getMonth()+"월");
		System.out.println(birthday.getDay()+"일");
	}
}
