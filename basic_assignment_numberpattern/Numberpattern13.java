class Numberpattern13 {
	public static void main(String[] args) {
		int rows=5;
		int k = 1;
         for (int i = 1; i <= rows; i++) {
            k=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k + rows - j; 
            }
            System.out.println();
        }
    }
}
	

