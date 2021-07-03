package week1.day2;

public class MyCar {
	
	String bodycolor = "red";
	
	public void drivecar() {
		System.out.println("driving a car");
//		String color= bodycolor;
//		return color;
	}
	
	public String getcolor() {
		String color= bodycolor;
		return color;
//		System.out.println("color");
	}
	

	public static void main(String[] args) {
		
		MyCar obj = new MyCar();
		obj.drivecar();
		obj.getcolor();
		
		// TODO Auto-generated method stub

	}

}
