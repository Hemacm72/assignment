import java.util.Scanner;
 public class Characterpattern3{
  public static void main(String args[]){
    int i, j;
    String str;
    char[] ch;
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the string: ");
    str = sc.nextLine();
    ch = str.toCharArray();
    for (i = 0; i < ch.length; i++) {
      for (j = 0; j < i; j++)
        System.out.print(ch[j]);
            System.out.println();
    }
     for (i = ch.length; i >= 0; i--){
      for (j = 0; j < i; j++)
        System.out.print(ch[j]);
         System.out.println();
    }
  }
}
