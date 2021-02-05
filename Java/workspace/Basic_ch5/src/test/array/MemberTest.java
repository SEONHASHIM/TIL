package test.array;

public class MemberTest {

	public static void main(String[] args) {
		//System.out.println(args);
		//System.out.println(args.length);
		MemberDB db = new MemberDB();
		
		for(int i=0;i<args.length;i++) {
			db.setMemberName(args[i]);
		}
		
		
		//db.setMemberName("가나다");
		//db.setMemberName("홍길동");
		//db.setMemberName("김영희");
		
		db.printNames();
		int [] a = new int[] {1,2,3};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
