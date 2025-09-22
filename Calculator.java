
import java.util.Scanner;
public class Calculator {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		double num1,num2,res=0;
		while(true) {
			System.out.print("Enter the first number:");
			num1=sc.nextDouble();
			System.out.println();
			System.out.print("Enter the second number:");
			num2=sc.nextDouble();
			System.out.println();
			System.out.print("Choose the operation to perform:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter the number:");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					res=num1+num2;
					break;
				case 2:
					res=num1-num2;
					break;
				case 3:
					res=num1*num2;
					break;
				case 4:
					res=num1/num2;
					break;
				case 5:
					System.out.println("Quiting...\nGoodbye...");
					System.exit(0);
				default:
					System.out.println("Please enter a valid choice");
					break;
			}if(res%1==0){
			    System.out.println("Result is "+(int)res);
            }else{
                System.out.println("Result is "+res);
            }
        }

	}
}
