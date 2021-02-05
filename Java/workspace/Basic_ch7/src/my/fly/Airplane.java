package my.fly;

public class Airplane extends Vehicle implements Flyer{
	@Override
	public void fly() {
		int distance = transfer(0,1000);
		System.out.println(distance+"거리만큼 엔진을 가동해서 난다...");
	}
	@Override
	public void drive() {
		
	}
}
