
public class JavaBasics8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check if 121 is a palindrome.
		int num=121;
		int rev=0;
		int org_num=num;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(org_num==rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}

	}

}
