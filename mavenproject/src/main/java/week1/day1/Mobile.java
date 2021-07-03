package week1.day1;

public class Mobile {
	
	String mobileModel = "Redmi";
	int mobileWeight = 4;
	boolean isFullCharge = true;
	double mobileCost = 222209.98;
	
	public void makecall() {
		System.out.println("print makecall");
	}
 
	public void sendMsg() {
		System.out.println("print sendMsg");
		
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj = new Mobile();
		
		obj.makecall();
		obj.sendMsg();
		
		System.out.println(obj.mobileModel);
		System.out.println(obj.mobileWeight);
		System.out.println(obj.isFullCharge);
		System.out.println(obj.mobileCost);
		
		
		

	}

}
