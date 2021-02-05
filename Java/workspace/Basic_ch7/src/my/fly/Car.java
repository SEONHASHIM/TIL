package my.fly;

public class Car extends Vehicle{
	@Override
	public void drive() {
		int distance = transfer(30,178);
		System.out.println(distance+"거리만큼 달립니다.");
	}
}
