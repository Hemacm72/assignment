import java.util.*;
public class Characterpattern8{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		int alphabet = 65; 
			for (int i= 0; i<= rows-1 ; i++){
            for (int j=i; j<=rows-1; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            for (int k=rows-2; k>=i; k--){
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println("");
        }
		 sc.close();
    }
}
