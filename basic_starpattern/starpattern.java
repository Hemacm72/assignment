class Starpattern {
	public static void main(String[] args) {
		int r=3;
		int star=1;
		for(int row=1;row<=r;row++){
			for(int col=1;col<=star;col++){
				System.out.print("* ");
			}
			System.out.println();
			star++;
		}
	}
}
