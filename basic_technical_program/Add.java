class Add{
	static int Add(int x, int y){
		while (y != 0){
	int carry = x & y;
 	x = x ^ y;
	y = carry << 1;
        }
        return x;
    }
     	public static void main(String arg[])
    {
        System.out.println(Add(4, 3));
    }
}