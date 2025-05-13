
public class JavaBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print numbers from 1 to 10, excluding 5 and 6.
		for(int i=1; i<10; i++) {
			if(i==5 || i==6) {
				continue;
			}
			System.out.println(i);
		}

	}

}
