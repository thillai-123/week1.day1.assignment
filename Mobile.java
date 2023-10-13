package week1.day1.homeassignment;

public class Mobile {

	public void makeCall() {
		
		String mobileModel ="Realme10";
		float mobileWeight=2.5f;
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	
		
		
	}
	
	public void sendMsg() {
		
		boolean isFullCharged = true;
		int mobileCost=15000;
		
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		
	}
	
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		
		m. makeCall();
		m.sendMsg();
		
		System.out.println("This is my mobile");
		
		
		
	 
		
	}
}
