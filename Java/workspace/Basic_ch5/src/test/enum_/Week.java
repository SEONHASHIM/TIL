package test.enum_;

// 기존
/*public class Week {
	public static final char MON = '월';
	public static final char TUE = '화';
	public static final char WED = '수';
	public static final char THU = '목';
	public static final char FRI = '금';
	public static final char SAT = '토';
	public static final char SUN = '일';
}*/

// enum 사용
public enum Week {
	MON,TUE,WED,THU,FRI,SAT,SUN;
}