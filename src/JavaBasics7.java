
public class JavaBasics7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print the reverse of 1234.
		int num=1234;
		int rev=0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
	}
}
			
			

	


