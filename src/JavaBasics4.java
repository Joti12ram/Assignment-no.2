import java.util.Scanner;

public class JavaBasics4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print the table of 5.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.println(num*i);
		}
		

	}

}
