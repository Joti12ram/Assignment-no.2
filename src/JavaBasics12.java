
public class JavaBasics12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print all Armstrong numbers from 1 to 1000.
		int r, sum, num;
		for(int i=1; i<=1000; i++) {
			num=i;
			sum=0;
			for(int j=i; j>0; j=j/10) {
				r=j%10;
				sum = sum + (r*r*r);
				
			}if(sum==num) {
				System.out.println("Amrstrong no " +i);
			}/*else {
				System.out.println("Not Amrstrong no" +i);
			}*/
		}

	}

}
