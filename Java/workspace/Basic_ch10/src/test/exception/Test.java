package test.exception;

public class Test {

	public static void main(String[] args) {
		try {
			int x = 100;
			args[0] = null;
			int y=Integer.parseInt(args[0].trim()); // trim() : 공백을 없애라
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("어떤 예외가 발생");
		}
		System.out.println("아주 중요한 일 시작...");

	}

}
