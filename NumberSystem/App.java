class App  {

	public static void main(String[] args) {
		int num=113;

		System.out.println(num);
		System.out.println(Integer.toBinaryString(num)); //1010001
		System.out.println(Integer.toOctalString(num));
		System.out.println(Integer.toHexString(num));
		
		int value=0340;   // this is Octal value so in java we define octal value preceded
		// by 0  like 012
		System.out.println(value);

		int x=0xe0;  // this is hexadecimal value in java we defind by 0X or 0x
		System.out.println(x);

		int bi=0b11100000;
		System.out.println(bi);

	}
	
}