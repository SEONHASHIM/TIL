package my.fly;

public abstract class Vehicle extends Object{
	public abstract void drive();
	public int transfer(int start, int end) {
		int distance = end-start;
		return distance;
	}
}
