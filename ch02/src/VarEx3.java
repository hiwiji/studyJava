
public class VarEx3 {

	public static void main(String[] args) {
		
		final int score = 100; // = 100;
	//	score = 200;
		
		System.out.println(score); // 100

		boolean power = true;
		
		byte b = 127; // -128~127 범위
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10;// 16진수, 10진수로 16
		
		long l = 1000_000_000L;
		
		float f = 3.14f;
		double d= 3.14f;		
		
		System.out.println(10.); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
		
		char ch ='A';
		int i = 'A';
		
		System.out.println(ch); // A
		System.out.println(i); // 65
	
		System.out.println("------------------------------------------");
		
		String str =""; // 빈 문자열
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4); // ABCD123
		
		System.out.println(""+7+7); // 77
		System.out.println(7+7+""); // 14

	}

}
