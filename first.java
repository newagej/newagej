public class first {

	public static void main(String[] args) {
		System.out.println("º°");
		int a =5;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
			a -= 1;
			if(a==0)	{
				int a1 =2;
				for (int i1 = 0; i1 < 4; i1++) {
					for (int j = 0; j < a1; j++) {
						System.out.print("*");
					}
					System.out.println();
					a1 += 1;
			}break;
			}
		}
	}//end main
}//end class
