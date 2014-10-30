class pg124_8{
	public static void main (String args []) {
		for (int number = 1; number <= 5; number++) {
			for (int spaces = 1; spaces <= 5 - number; spaces++) {
			System.out.print(" ");
			} 
			for (int num= 1; number <= number; num++) {
			System.out.print(number);
			}
			System.out.println();
		}
	}
} 