class Starpattern4 {
	public static void main(String[] args) {
		int r=3;
		int space=0;
		int star=3;
		for(int i=1;i<=r;i++){
			for(int j=1;j<=space;j++){
                System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
	}
	}
}
