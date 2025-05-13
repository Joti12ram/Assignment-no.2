import java.util.Scanner;

public class JavaBasics13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print all palindrome numbers from 1 to 100.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Palindrome numbers :");
		for(int i=num1; i<=100; i++) {
			int n=i;
			int rev=0;
			while(n!=0) {
				rev=rev*10 + n%10;
				n=n/10;
			}
			if(rev==i) {
				System.out.println(i+ " ");
			}
		}

	}

}
