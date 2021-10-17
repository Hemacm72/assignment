import java.util.*;
public class Characterpattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("How many rows you want in this pattern?");
         int rows = sc.nextInt();
         System.out.println("Here is your pattern....!!!");
        int alphabet = 65; 
        for (int i= rows-1; i>= 0 ; i--) {
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++){
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
