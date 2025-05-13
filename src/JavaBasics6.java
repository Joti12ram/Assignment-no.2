import java.util.Scanner;

public class JavaBasics6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print any multiplication table for a given number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.println(num+"*" +i+"="+(num*i));
		}

	}

}
