
public class JavaBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to check if a number is prime or not.
		//Scanner sc = new Scanner(System.in);
				int n=10;
				for(int i=2; i<n; i++) {
					if(n%i==0) {
						System.out.println("Number is Not prime");
						return;
					}else {
						System.out.println("Number is prime");
					}
				}
	}

}
