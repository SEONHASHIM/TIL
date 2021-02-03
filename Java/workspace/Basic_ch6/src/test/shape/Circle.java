package test.shape;

public class Circle extends Shape{
	int radius;
	public void area() {
		System.out.println("원의 넓이="+(3.14*radius*radius));
	}
}
