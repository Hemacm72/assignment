class Starpattern5 {
	public static void main(String[] args) {
		int r=3;
		int space=2;
		int star=1;
		for(int row=1;row<=r;row++){
			for(int col=1;col<=space;col++){
				System.out.print(" ");
			}
			for(int col=1;col<=star;col++){
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		
	}
}
}
