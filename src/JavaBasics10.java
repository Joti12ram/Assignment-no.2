
public class JavaBasics10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check if 153 is an Armstrong number.
		int n=153;
		int temp =n;
		int r;
		int sum =0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum = sum + r*r*r;
		}
		if(temp==sum) {
			System.out.println("Number is an Armstrong");
		}else {
			System.out.println("Number is not an Armstrong");
		}

	}

}
