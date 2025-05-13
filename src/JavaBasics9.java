import java.util.Scanner;

public class JavaBasics9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check if a given number is a palindrome.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : "); //16461
		int num=sc.nextInt();
		int rev =0;
		int org_num=num;
		while(num!=0) {
			rev= rev*10 +num%10;
			num = num/10;
		}
		if(org_num==rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}

	}

}
