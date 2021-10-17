class Numberpattern12 {
	public static void main(String[] args) {
		int rows=6;
		        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0 ");
            }
            System.out.print(i + " ");
            for (int k = i; k < rows; k++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
	
