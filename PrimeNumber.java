package week1.day1;
public class PrimeNumber {

	public static void main(String[] args) {
		
		int input = 13;
		boolean flag = false;
		
		for (int i = 2; i <= 100; i++) {
			flag=input%i==0;
			flag=true;
		}		
			if (flag=true) { 
				
				 	System.out.println(input+ " is a Prime Number");
			}
			else if (flag=false) {
			System.out.println(input+" is a Non Prime Number");
		}
		
		

	
	}
}