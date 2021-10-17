import java.util.Scanner;
public class subtract{
public static void main(String args[]){
int sub,num1,num2;
Scanner scan=new Scanner(System.in);


System.out.print("Enter the value to num1: ");
num1=scan.nextInt();
System.out.print("Enter the value to num2: ");
num2=scan.nextInt();
System.out.print("subtraction of "+num1+"-"+num2+" :"+subtract(num1,num2));
}
static int subtract(int num1,int num2)
{
    if(num2==0)
        return num1;
    
    return subtract(num1^num2,(~num1 & num2)<<1);
}
}