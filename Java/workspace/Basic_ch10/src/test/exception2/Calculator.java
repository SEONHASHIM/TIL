package test.exception2;

public class Calculator {
	public int divide(int x, int y) throws MyException {
		int z = 0;
		if(y==0) { //사전에 Exception 상황이 벌어질 수 있는 것을 확인
			throw new MyException("y를 0으로 입력하지 마세요"); //객체 생성해서 발생시키겠다. throw랑 같이 쓸 수 있는 객체는 exception뿐
			//Exception 발생
		}
		z = x/y;
		
		/*
		try {
			z = x/y;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눈 에러 발생");
		}*/
		return z;
	}
}
