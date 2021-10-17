class Numberpattern2 {
	public static void main(String[] args) {
		int row=7;
		for(int i=1;i<=row;i++){
			for(j=1;j<i;j++){
                System.out.print("1");
			}
		System.out.println(i+"");
		for(int k=i;k<row;k++){
			System.out.print("2");
		}
		System.out.println();
		}
	}
}
