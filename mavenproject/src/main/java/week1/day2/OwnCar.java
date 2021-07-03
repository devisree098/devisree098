package week1.day2;

public class OwnCar {
	
	public void SoundHorn() {
		System.out.println("soundhorn");
	}

	public static void main(String[] args) {
		
		MyCar obj2 = new MyCar();
		obj2.drivecar();
		// TODO Auto-generated method stub
		
		OwnCar obj3 = new OwnCar();
		obj3.SoundHorn();

	}

}
