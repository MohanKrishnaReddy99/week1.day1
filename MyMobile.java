package week1.day1;
public class MyMobile {
	
	static long mobileNumber = 0451732432L;
	int emiNumber=345678;
	
	public void makeCall() {
		System.out.println("mobile Number");
	}
	
	public void sendMsg () {
		System.out.println("emi Number");
		
	}
	
	private void payBill () {
		System.out.println("pay");
		
		System.out.println(emiNumber);
		
		
		
	}


	
	public static void main(String[] args) {
		
		MyMobile Nag = new MyMobile();
		Nag.sendMsg();
		Nag.payBill();
		Nag.makeCall();
		System.out.println("emiNumber");
		
		
		

	}

}