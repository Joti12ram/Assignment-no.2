import java.util.Scanner;

public class JavaBasics11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check if a given number is an Armstrong number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp=num;
		int r;
		int sum=0;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum = sum + r*r*r;
		}
		if(temp==sum) {
			System.out.println("Number is an Armstrong ");
		}else {
			System.out.println("Number is not an Armstrong");
		}

	}

}
