import java.util.Scanner;//import scanner class
public class User_Input {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the integer:");
		Scanner sc=new Scanner(System.in);//create scanner object
		num = sc.nextInt();//read the value
		System.out.println("The Entered integer is:" + num);
	}

}
