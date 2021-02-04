package test.static_;

public class Test {
	
	public static void main(String[] args) {
		A o1=new A();
		o1.i++;
		o1.printI();
		
		A o2=new A();
		o2.i++;
		o2.printI();
		
		//객체 생성 안하고 호출 가능
        A.i++;
        A.printI();

	}

}

class A{
	static int i=10;
	static public void printI() {
		System.out.println(i);
	}
}
